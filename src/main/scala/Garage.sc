

  class Customer(var customerId: Int) extends Person(fName, lName){


  }



class Vehicle(var registration: String, var make : String, var model : String, var problem : String, var dateStarted : String){

  class Car() extends Vehicle (registration , make, model, problem, dateStarted) {

  }

  class Bike() extends Vehicle (registration , make, model, problem, dateStarted) {


  }


}

//val p = new Person()
val p2 = new Employee(1, "", "", "")