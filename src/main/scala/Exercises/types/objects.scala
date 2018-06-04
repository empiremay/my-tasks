package Exercises.types

object objects {
    object Greeting {
        def english = "hi"
        def espanol = "hola"
    }

    class Movie(val name: String, val year: Short)

    object Movie {
        def academyAwardBestMoviesForYear(x: Short): Option[Movie] = {
          x match {
            case 1930 => Some(new Movie("All Quiet On The Western Front", 1930))
            case 1931 => Some(new Movie("Cimarron", 1931))
            case 1932 => Some(new Movie("Grand Hotel", 1932))
            case _ => None
          }
        }
    }

    class Nerd(val name: String, private val superheroName: String)

  object Nerd {
      def showMeInnerSecret(x: Nerd) = x.superheroName
  }
}
