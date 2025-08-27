import Example.*

@main def hello: Unit =
  println(greeting("Mack"))
  println(product(3,3))
  println(greeting())

def product(num1: Int, num2: Int): Int = num1 * num2

def greeting(name: String = "default"): String = s"whats good $name!"

object Example {


  /*def greeting(name: String = "default"): String*/
}




















