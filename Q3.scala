package prac01_22001816

object Q3 {

  def main(args: Array[String]): Unit = {
    val r = 5
    print("Volume of a sphere with radius 5 = ")
    val Volume = VolumeOfSphere(5)
    println(Volume)
  }

  def VolumeOfSphere(r: Int): Double = {
    (math.Pi * r * r * r)*4/3
  }

}