import scala.io.StdIn
object NumberCategorizer {
  def main(args: Array[String]): Unit = {
    println("Enter a number: ")
    val num = StdIn.readInt()
    println(describeNumber(num))
    }

    private val describeNumber: Int => String = {
      case n if (n % 5 == 0 && n % 3 == 0) => "Multiple of Both Three and Five"
      case n if (n % 3 == 0) => "Multiple of Three"
      case n if (n % 5 == 0) => "Multiple of Five"
      case _ => "Not a Multiple of Three or Five"
    }
}
