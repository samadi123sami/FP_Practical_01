package prac01_22001816

object Q4 {

  def main(args: Array[String]): Unit = {
    val Discount = 0.4
    val CoverPrice = 24.95
    var Copies = 60
    print("Total wholesale cost for 60 copies = ")
    val TotalCost = WholesaleCost(0.4,24.95,60)
    println(TotalCost)
  }

  def WholesaleCost(Discount:Double,CoverPrice:Double,Copies:Int): Double = {
    val DiscountPrice = CoverPrice - (CoverPrice * Discount)  //for 1 book
    var Cost : Double= 0
    if (Copies > 50) {
      Cost = (Copies - 50) * 0.75 // 75 cents for each additional copy
      Cost = Cost + (50 * 3)  // Shipping costs Rs. 3 for the first 50 copies
    }
    else{
        Cost = Copies * 3
    }

    val TotalCost = (DiscountPrice * 60) + Cost
    TotalCost
  }

}
