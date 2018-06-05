package com.example.mytasks.interpreters

import cats.Applicative
import com.example.mytasks.algebras.Tasks
import com.example.mytasks.models.{Task, User}
import cats.implicits._

import scala.util.Random.nextString
import scala.util.Random.nextInt

class TasksInterpreter[F[_]: Applicative] extends Tasks[F] {
  override def add(a: Task): F[Int] = ???

  override def list: F[List[Task]] = ???
}

