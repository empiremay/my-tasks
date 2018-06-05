package com.example.mytasks.http

import org.http4s.dsl.Http4sDsl
import cats.syntax.functor._
import cats.syntax.flatMap._
import org.http4s.HttpService
import org.http4s.dsl.Http4sDsl
import cats.effect.Effect
import com.example.mytasks.modules.Workflow

class Routes[F[_]: Effect](implicit wf: Workflow[F]) extends Http4sDsl[F] {
  val service: HttpService[F] = HttpService[F] {
    case GET -> Root => wf.getRandomString.map(s => Ok(s)).flatten
    case GET -> Root / "users" => wf.getUsers.map(l => Ok(l.asJson)).flatten
  }
}
