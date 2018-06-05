package com.example.mytasks.interpreters

import cats.Applicative
import com.example.mytasks.algebras.Users
import com.example.mytasks.models.User
import cats.implicits._
import scala.util.Random.nextString
import scala.util.Random.nextInt

class UsersInterpreter[F[_]: Applicative] extends Users[F] {

  override def add(a: User): F[Int] = nextInt().pure[F]

  override def list: F[List[User]] = List(User(99, "Joaquin")).pure[F]

  override def getRandomString: F[String] = nextString(4).pure[F]
}
