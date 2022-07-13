import scala.io.StdIn.readLine
import sparkQueries._

import scala.collection.immutable.ListMap

object main_menu {
  def opening(): Unit = {
    println("News App")
    println("Welcome!")
  }
  def main(args: Array[String]): Unit = {
    println("1) See the News")
    println("2) Login")
    println("3) Create Account")
    println("4) Exit App")


    val user_input = readLine("Please choose an option:")

    if (user_input == "1") {
      //Print news table
    } else if (user_input == "2") (user_input == "2") {
      println("Please login")
      userLogin()
    } else if (user_input == "3") {
      println("Please create an account")
      createAccount()
      val userId = readLine("Username:")
      val userName = readLine("First and Last name:")
      val userPw = readLine("Password:")


    }else if (user_input == "4"){
      sys.exit(1)
    }
  }

}
