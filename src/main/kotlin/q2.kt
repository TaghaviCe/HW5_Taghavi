abstract class Employee(val hours: Double){
    var name: String=""
    var age: Int=0
    var hourRate: Double=1200.0
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
    var hoursMnager:Double=0.0
    init {
        name=name1
        age=age1
        hoursMnager=hours

    }
    override fun toString(): String {
       return "name: ${this.name} age: ${this.age} hourRate: ${this.hours}"
    }
    fun AddAge(){
        listMaxAge.add(age)
    }

    fun maxAge():Int{
        var largest = listMaxAge[0]
        for (num in listMaxAge) {
            if (largest < num)
                largest = num
        }
        return largest
    }
    override fun salary(hours: Double): Double {
        return (hourRate * hours ).toDouble()
    }



}
class Clerk(name1: String,age1: Int, hours: Double):Employee(hours){
    val listMaxAge= arrayListOf<Int>()
    var hoursClerk:Double=0.0
    init {
        name=name1
        age=age1
        hoursClerk=hours
    }
    override fun salary(hours: Double): Double {
       return (hourRate * hours / 2).toDouble()
    }
    override fun toString(): String {
        return "name: ${this.name} age: ${this.age} hourRate: ${this.hours}"
    }
    fun AddAge(){
        listMaxAge.add(age)
    }
    fun maxAge():Int{
        var largest = listMaxAge[0]
        for (num in listMaxAge) {
            if (largest < num)
                largest = num
        }
        return largest
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
    var totalPayment=0.0
    val person1 = Manager("Ali", 52, 104.0)
    person1.AddAge()
    println(person1.toString())
    listOfManager.add(person1)
    totalPayment+=person1.salary(104.0)

    val person2 = Clerk("Sama", 16, 110.0)
    person2.AddAge()
    println(person2.toString())
    totalPayment+=person2.salary(110.0)

    val person3 = Manager("Reza", 42, 120.0)
    person3.AddAge()
    println(person3.toString())
    listOfManager.add(person3)
    totalPayment+=person3.salary(120.0)

    val person4 = Manager("Farhad", 34, 120.0)
    person4.AddAge()

    println(person4.toString())
    listOfManager.add(person4)
    totalPayment+=person4.salary(120.0)

    val customer1 = Customer("sara", 22, Gender.Female)
    val customer2 = Customer("maryam", 30, Gender.Female)
    println("Check if customer1 and customer2 are the same:")
    println(customer1.equals(customer2))

    println()
    println("total payment:$totalPayment")
    println()
    println("the maximum age:")
    val maxManager=listOfManager.maxOf { it.age }
    val max={ c:Int-> print(c) }
    max(maxManager)



}