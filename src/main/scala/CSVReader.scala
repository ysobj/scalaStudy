import scala.io.Source
import scala.util.Try
object CSVReader {
  def main(args: Array[String]): Unit = {
    val file = args(0)
    val s:Option[Source] = Try{
      Source.fromFile("data/" + file + ".csv")
    }.toOption
    s match{
      case Some(x) => {
        try{
          for(line <- x.getLines){
            println(line)
          }
        }finally{
          x.close
        }
      }
      case None => println( file + " Not found.")
    }
  }
}
