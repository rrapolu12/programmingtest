object Fibonacci extends App {

  def fibonacci(n: Int): Int = n match {
    case 0 | 1 => 1
    case _ => fibonacci(n - 1) + fibonacci(n - 2)
  }
  println(fibonacci(3))
}
