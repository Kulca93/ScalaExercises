package Models

object Main extends App {

  //To add to garage
  val employee1 = new Employee(1, "Engineer", "Marky", "Mark", "207892662283")
  val customer1 = new Customer(1, "Jim", "James", "07892662268")
  val car1 = new Car("HVC 5086", "Car", "Audi", "R8", "Spinal", 26052017)
  val bike1 = new Bike("GB15 GJD", "Bike", "Kawasaki", "Honda", "Wheel GONE", 22032018)

  val garage = Array(1,1,1,)

  println(garage)

  println(employee1)
  println(customer1)
  println(car1)
  println(bike1)


}



