package Models

class Car (

    override var regNumber : String,
    override var vehicleType : String,
    override var make : String,
    override var model : String,
    override var problem : String,
    override var dateStarted : Int

  ) extends Vehicle {

  override def toString: String = s" The Registration number of the $vehicleType is $regNumber. It is a $make, $model. The problem is $problem and it was brought in on $dateStarted"


}
