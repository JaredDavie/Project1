import org.apache.spark.sql.SparkSession
import org.apache.log4j.{Level, Logger}
import java.sql.{Connection,DriverManager,ResultSet}
import scala.io.StdIn.readLine

object NewsApp {

  def main(args: Array[String]): Unit = {
    // create a spark session
    // for Windows
    //System.setProperty("hadoop.home.dir", "C:\\Hadoop3")
    val spark = SparkSession
      .builder
      .appName("Hi")
      .config("spark.master", "local")
      .enableHiveSupport()
      .getOrCreate()
    Logger.getLogger("org").setLevel(Level.ERROR)
    println("created spark session")

    spark.sql("SHOW DATABASES;").show()

    println("how are you doing?")
    val value = readLine()
    println(value)

//    //val driver = com.mysql.jdbc.driver
//    val url = "jdbc:mysql://localhost:3306/test"
//    val user = "root"
//    val pass = "p4ssword"
//
//    val sourceDf=spark.read.format("jdbc").option("url",url)
//      .option("dbtable","users").option("user",user)
//      .option("password",pass).load()
//    sourceDf.show()
//
//    sourceDf.createOrReplaceTempView("users1")
//    spark.sql("SELECT * FROM users1 where user_id=1").show()
//
//    val sql="select * from users where user_id=2"
//    val sourceDf2=spark.read.format("jdbc").option("url",url)
//      .option("dbtable",s"( $sql ) as t").option("user",user)
//      .option("password",pass).load()
//    sourceDf2.show()
//
//    sourceDf2.createOrReplaceTempView("users2")
//    spark.sql("SELECT * FROM users2 where user_id=2").show()
//
//    var sourceDf3=spark.sql("SELECT * FROM users2 where user_id=2")
//    sourceDf3.distinct().count()
//    sourceDf3.createOrReplaceTempView(viewName="anotherview")
//    spark.sql("SELECT * FROM anotherview").show()

    spark.close()
  }
}
