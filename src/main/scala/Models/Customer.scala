package Models

class Customer (

      var customerId : Int,
      override var fName: String,
      override var lName: String,
      override var contactNumber: String
      ) extends Person{

  override def toString: String = s" The customers name is $fName $lName and their customer ID is $customerId. "


}

