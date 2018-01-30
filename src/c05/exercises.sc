class count {
  private var value = Int.MaxValue

  def increment() {
    if (value < Int.MaxValue) value + 1 else value
  }

  def current = value
}

class BankAccount(val balance: Int = 0) {
  def deposit() {}

  def withdraw() {}
}

class Time(val hour: Int, val minutes: Int) {
  def before(other: Time): Boolean = {
    hour < other.hour || (hour == other.hour && minutes < other.minutes)
  }

  override def toString: String = {
    (hour * 24 + minutes).toString
  }

  import scala.beans.BeanProperty

  class Student {
    @BeanProperty var name: String = _
    @BeanProperty var id: Long = _
  }
/*
  class Person(var age: Int) {
    age = if (age < 0) 0 else age
  }
*/
  class Person(val name:String){}

  class Car(val manufacturer:String,val modelName:String,val modelYear:Int = -1,var licensePlate:String="")
}