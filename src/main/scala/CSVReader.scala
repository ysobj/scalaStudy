import scala.io.Source
object CSVReader {
  def main(args: Array[String]): Unit = {
    val file = args(0)
    val s = Source.fromFile("data/" + file + ".csv")
    try{
      for(line <- s.getLines){
        println(line)
      }
    }finally{
      s.close
    }
  }
}
