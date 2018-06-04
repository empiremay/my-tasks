package com.example.mytasks.http

import org.http4s.dsl.Http4sDsl
import org.http4s.HttpService
import org.http4s.dsl.Http4sDsl
import cats.effect.Effect

class Routes[F[_]: Effect] extends Http4sDsl[F] {
  val service: HttpService[F] = HttpService[F] {
    case GET -> Root => Ok("Hola")
  }
}
