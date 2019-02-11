import scala.io.StdIn._
object Conversion{
  
  def binario(num: Int){
    if(num<2){
      print(num)
    }else{
      binario(num/2)
      print(num%2)
    }
  }
  
  def main(args: Array[String]): Unit = {
    println("Ingresa el numero que deseas convertir")
    val num = readInt()
    print("Binario: ")
    binario(num)
  }
}