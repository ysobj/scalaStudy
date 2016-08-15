import scala.io.Source
import scala.util.Try
object CSVTable {
  def main(args: Array[String]): Unit = {
    println("TEST")
    println(new CSVTable(args(0)).read)
  }
}
class CSVTable(val tableName:String){
    def read : String = {
      val source = Source.fromFile("data/" + tableName + ".csv")
      var s = ""
      try source.getLines.foreach{ s += _ } finally source.close
      return s
    }
}
