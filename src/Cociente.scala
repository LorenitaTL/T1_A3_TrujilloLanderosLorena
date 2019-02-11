import scala.io.StdIn._

object Cociente {
  def cociente(dividendo: Int, divisor: Int): Int={
    if(divisor>dividendo){
      return 0
    }else{ 
      1+cociente(dividendo-divisor, divisor)
      }
  }
  def main(args: Array[String]): Unit = {
    println("Ingresa el dividendo")
    val dividendo = readInt();
    println("Ingresa el divisor")
    val divisor = readInt();
    
    print("Cociente: "+cociente(dividendo, divisor))
  }
}