package prac01_22001816

object Q1 {
  
  def main(args: Array[String]): Unit = {
      val r = 5
      print("Area of a disk with radius 5 = ")
      val Area = AreaOfDisk(5)
      println(Area)
  }
  
  def AreaOfDisk(r:Int): Double = {
    math.Pi*r*r
  }
}
