import scala.io.StdIn._

object Factorial {
  def factorialRecursivo(n: Int): Int ={
    if(n==0)1 else factorialRecursivo(n-1)*n
  }
  
  def main(args: Array[String]): Unit={
    println("Ingresa el número del cual deseas conocer su factorial")
    val num = readInt()
    println("Factorial: "+factorialRecursivo(num));
  }
}