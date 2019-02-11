import scala.io.StdIn._

object Sumatoria {
  
  def sumatoria(inicio: Int, fin: Int): Int ={
    if(inicio==fin){
      inicio
    }else{
      fin+sumatoria(inicio, fin-1)
    }
    }
  
  def main(args: Array[String]): Unit={
    println("Ingresa el numero inicial")
    val inicio = readInt();
    println("Ingresa el numero final")
    val fin = readInt();
    println("Sumatoria: "+sumatoria(inicio, fin))
  }
}