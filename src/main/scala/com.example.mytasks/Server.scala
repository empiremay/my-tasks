package com.example.mytasks

import com.example.mytasks.http.Routes
import cats.effect.Effect
import fs2.StreamApp
import org.http4s.server.blaze.BlazeBuilder
import cats.effect.IO
import scala.concurrent.ExecutionContext.Implicits.global

object Server extends HttpServer[IO]

class HttpServer[F[_]: Effect] extends StreamApp[F] {
  def service[F[_]: Effect]=new Routes[F].service

  override def stream(args: List[String], requestShutdown: F[Unit]): fs2.Stream[F, StreamApp.ExitCode] =
    BlazeBuilder[F].bindHttp().mountService(service, "/").serve
}