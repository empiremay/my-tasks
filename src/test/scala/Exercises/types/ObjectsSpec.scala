package Exercises.types

import Exercises.types.objects.{Greeting, Movie, Nerd}
import org.scalatest._

class ObjectsSpec extends FlatSpec with Matchers {
  "Objects" should "have all its instances as equivalents" in {
    val x=Greeting
    val y=x
    val z=Greeting

    x.eq(y) shouldBe true
    x.eq(z) shouldBe true
  }

  it should "have companion object as factory" in {
    Movie.academyAwardBestMoviesForYear(1932).get.name should be ("Grand Hotel")
  }

  it should "have companion object which access to private values" in {
    val rafa = new Nerd("Rafa", "Superman")
    val paco = new Nerd("Paco", "Spider-Man")

    Nerd.showMeInnerSecret(rafa) shouldBe "Superman"
    Nerd.showMeInnerSecret(paco) shouldBe "Spider-Man"
  }
}
