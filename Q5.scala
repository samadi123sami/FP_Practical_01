package prac01_22001816

object Q5 {

  def main(args: Array[String]): Unit = {
    print("Total Running Time = ")
    val TotalTime = TotalRunningTime()
    print(TotalTime)
    println(" min")
  }

  def TotalRunningTime(): Int = {
    var EasyPaceT = 8
    var EasyPaceK = 4
    var TempoT = 7
    var TempoK = 3

    var TotalTime = (EasyPaceT *  EasyPaceK) + (TempoT * TempoK)
    TotalTime
  }
}
