package generation

object Subset {

  def subset(xss: List[Int]): List[List[Int]] = {
    if(xss.isEmpty) 
      List(List.empty[Int])
    else {
      val h = xss.head
      val subs = subset(xss.tail)
      subs.map( h +: _) ++ subs
    }
  }

}


object Test  {

  import Subset._
  println(subset(List.empty[Int]))
  println(subset(List(1)))
  println(subset(List(1,2)))
  println(subset(List(1,2,3)))

}
