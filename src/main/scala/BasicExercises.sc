//Hello World
println("Hello World")

println("Assignment")
val Hello= "Hello World2"
  println(Hello)

println("Parameters")
def Hello2(Hello: String): Unit = {
  val Hello = "Hello World3"
  println(Hello)
}

println("Return Types")
def Hello3(Hello: String) : String = {
  Hello
}
println(Hello3("Hello World 4"))

//Type Interface
//def TypeInterface() = {
//
//}

println("String")
def String(Word: String, a: Int) : String = {

  val result = Word.takeRight(a)
  result
}
println(String("Hello", 3))

println("String2")
def String2(Word: String, Word2: String, Letter: Char, Letter2: Char) : String ={

  val result = Word + Word2

  result.replace(Letter, Letter2)
}
println(String2("Ha", "llo", 'a', 'e'))

println("Conditionals")

def Sum(a : Int, b: Int, x: Int) : Int = x match {

  case 1 =>  a + b
  case 2 =>  a
  case 3 =>  b
  case 4 =>  a * b

  // boolean
//  var result: Int = 0
//  if(tof == true) {
//    result = a + b
//  }
  // else if(a == 0) {
//    result = b
//  }
  // else if(b == 0){
//  result = a

//  }else {
//   result = a * b
//  }
//

}
println(Sum(3, 2, 1))


println("Iteration")

def Iteration(a: Int, Word: String): Unit = {


  for (a <- 1 to a) {
    println(Word)
  }

}
println(Iteration(4, "H"))

println("Iteration2")
def Iteration2(a: Int, Word: String): Unit = {

  val fullString = Word * a
  var i = 0
  //Modular

//  if (a % 2 == 0){
//    val a = a
//  } else {
//    val a = a - 1
//  }
  while (i < a){
    print(fullString)
    println()
    i += 1
  }

}
println(Iteration2(4, "H"))

println("FizzBuzz")
def FizzBuzz(Word : String, Word2 : String, a : Int): Unit ={

  var i = 1

  while(i <= a){
    if(i % 3 == 0) {
      print(Word + ", ")

    }else if(i % 5 == 0) {
      print(Word2 + ", ")
    }
    else {
      print(i + ", " )
    }
    i += 1
  }

}
println(FizzBuzz("Fizz", "Buzz", 15))

println("Pattern Matching 2")
def patternMatching2(a : Any, b : Any, x: Int) : Unit = x match{
  case 1 => println(b, a)

}
println(patternMatching2(3, 4, 1))

//println("Functional1")
//
//print(java.util.TimeZone.getAvailableIDs.mkString(", ").split("/").filter(_.length > 4).foreach(print))
//
//println("FINISH THIS!!!!!")

println("Blackjack")
def BlackJack(a: Int, b: Int) : Unit = {

  if(a <= 21 && b <=21){
    if(a < b){
      println(b)

    } else{
      println(a)
    }
  }else if(a > 21 && b < 21){
    println(b)
  }else if (b > 21 && a < 21){
    println(a)
  }else{
    println("Enter real numbers m8")
  }

}
println(BlackJack(26, 30))

println("Too hot?")
def UniqueSum(a: Int, b: Int, c:Int) : Unit = {

  if(a == b && b == c && a == c){
    println("0")
  }else if(a == c){
    println(b)
  }else if(b == c){
    println(a)
  }else if(a == b) {
    println(c)
  } else{
    println(a + b + c)
  }
}
println(UniqueSum(1, 1, 2))

println("Too Hot?")

def TooHot(temperature: Int, isSummer: Boolean): Boolean = {
  var result = false
  if (isSummer == true)
  {
    if (temperature >= 60 && temperature <= 100)
      result = true
  } else {
      result = false
    }

   if(isSummer == false){
     if(temperature >= 60 && temperature <= 90){
       result = true
     }else {
       result = false
     }
  }
  result

}
println(TooHot( 100, true))