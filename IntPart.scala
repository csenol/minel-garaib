package generation

object IntPart {

  def intPart(x: Int): List[List[Int]] = {
    if(x == 1) List(List(1))
    else {
      (for {
	sub <- (1 to x).toList
	part <- intPart(x - sub)
      } yield (sub +: part).sortWith(_ > _)
      ).distinct
    }
  }

}


object Test2 extends App {

  import IntPart._
  println(intPart(1))
  println(intPart(2))
  println(intPart(5))
  println(intPart(6))

}
