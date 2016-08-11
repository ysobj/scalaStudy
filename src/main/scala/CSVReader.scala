import scala.io.Source
object CSVReader {
  def main(args: Array[String]): Unit = {
    val s = Source.fromFile("data/STAFF.csv")
    try{
      for(line <- s.getLines){
        println(line)
      }
    }finally{
      s.close
    }
  }
}
