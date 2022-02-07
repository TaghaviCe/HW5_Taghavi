abstract class Employee(val hours: Double){
    var name: String=""
    var age: Int=0
    var hourRate: Double=120000.0
     open fun salary(hours: Double): Double{
         return hourRate*hours
     }
    override fun toString(): String {
        return "name: $name age: $age hourRate: $hourRate"
    }
}
class Manager(name1: String,age1: Int,  hours: Double):Employee(hours){
    val listMaxAge= arrayListOf<Int>()
    var maxAge:Int=0
    init {
        name=name1
        age=age1
    }
    override fun toString(): String {
       return "name: ${this.name} age: ${this.age} hourRate: ${this.hours}"
    }
    fun AddAge(){
        listMaxAge.add(age)
    }
//
//    fun maxAge():Int{
//        var largest = listMaxAge[0]
//        for (num in listMaxAge) {
//            if (largest < num)
//                largest = num
//        }
//        return largest
//    }


}
class Clerk(name1: String,age1: Int, hours: Double):Employee(hours){
    init {
        name=name1
        age=age1
    }
    override fun salary(hours: Double): Double {
       return hourRate * hours / 2
    }
    override fun toString(): String {
        return "name: ${this.name} age: ${this.age} hourRate: ${this.hours}"
    }

}
data class Customer(val name:String,val age:Int,val gender: Gender){
    val nameCustomer:String=name
    val ageCustomer:Int=0
    val genderCustomer:Gender=gender

    override fun equals(other: Any?): Boolean {
        return (this.nameCustomer == (other as Customer).nameCustomer && this::class == other::class)

    }

}
enum class Gender{
    Male,
    Female
}

fun main() {
    val listOfManager = arrayListOf<Manager>()

    val person1 = Manager("Ali", 52, 104.0)
    person1.AddAge()
    println(person1.toString())
    listOfManager.add(person1)
    val person2 = Clerk("Sama", 16, 110.0)
    println(person2.toString())

    val person3 = Manager("Reza", 42, 120.0)
    person3.AddAge()
    println(person3.toString())
    listOfManager.add(person3)

    val person4 = Manager("Farhad", 34, 120.0)
    person4.AddAge()

    println(person4.toString())
    listOfManager.add(person4)

    val customer1 = Customer("sara", 22, Gender.Female)
    val customer2 = Customer("maryam", 30, Gender.Female)
    println(customer1.equals(customer2))

    val maxManager=listOfManager.maxOf { it.age }
    val max={ c:Int-> print(c) }
    max(maxManager)



}