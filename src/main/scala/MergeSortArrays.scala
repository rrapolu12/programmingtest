object MergeSortArrays extends App {

  def merge(list1 : List[Int], list2: List[Int]): List[Int] = (list1, list2) match {
    case (Nil, Nil) => Nil
    case (l1 :: xs, Nil) => list1
    case (Nil, l2 :: ys) => list2
    case (l1::xs,l2::ys) =>
      if(l1 <= l2)
        l1 :: merge(list1.tail,list2)
      else
        l2 :: merge(list1,list2.tail)
  }

  val list1 = List(1,4,6)
  val list2 = List(2,3,5)
  private val mergedList: List[Int] = merge(list1,list2)

  println(mergedList)
}

