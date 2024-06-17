package prac01_22001816

object Q2 {

  def main(args: Array[String]): Unit = {
    val c = 35
    print("Fahrenheit temperature = ")
    val Fahrenheit = Ftemperature(35)
    println(Fahrenheit)
  }

  def Ftemperature(c: Int): Double = {
    (c * 1.8000) + 32.00
  }
}
