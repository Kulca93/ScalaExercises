//Hello World
println("Hello World")

println("Assignment")
val Hello= "Hello World2"
  println(Hello)

println("Parameters")
def Hello2(Hello: String) Unit = {
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

prinln("String2")
def String2(Word: String, Word2: String, Letter: Char, Letter2: Char) : String ={

  val result = Word + Word2

  result.replace(Letter, Letter2)
}
println(String2("Ha", "llo", 'a', 'e'))

println("Conditionals")

def Sum(a : Int, b: Int, tof: Boolean) : Int ={

  var result: Int = 0
  if(tof == true) {
    result = a + b
  }else if(a == 0) {
    result = b
  }

  else if(b == 0){
  result = a

  }else {
   result = a * b
  }

  result
}
println(Sum(0, 2, true))
