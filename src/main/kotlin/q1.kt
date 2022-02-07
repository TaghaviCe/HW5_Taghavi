
interface PublicTrasportationVehicle{
    fun MaxSpeed()
    fun MaxCapacity()
}
interface ServiceTrasportationVehicle {
    fun MaxSpeed()
    fun MaxCapacity()
}
interface PrivateTrasportationVehicle{
    fun MaxSpeed()
    fun MaxCapacity()

}
 class Van(var maxSpead:Long, var capacity:Int):PrivateTrasportationVehicle{
     override fun MaxSpeed() {

     }

     override fun MaxCapacity() {

     }

 }
class SportCar(var maxSpead:Long, var capacity:Int):PrivateTrasportationVehicle{
    override fun MaxSpeed() {

    }

    override fun MaxCapacity() {

    }

}
class Truck(var maxSpead:Long, var capacity:Int):ServiceTrasportationVehicle{
    override fun MaxSpeed() {

    }

    override fun MaxCapacity() {

    }

}
class Ambulance(var maxSpead:Long, var capacity:Int):ServiceTrasportationVehicle{
    override fun MaxSpeed() {

    }

    override fun MaxCapacity() {

    }

}
class Subway(var maxSpead:Long, var capacity:Int):PublicTrasportationVehicle{
    override fun MaxSpeed() {
    }

    override fun MaxCapacity() {
    }

}
class Taxi(var maxSpead:Long, var capacity:Int):PublicTrasportationVehicle{
    override fun MaxSpeed() {
    }

    override fun MaxCapacity() {

    }

}



enum class Transportation{
    Subway,
    Taxi,
    Bus,
    Ambulance,
    Truck,
    SportCar,
    HatchbackCar,
    Van,
    Motor,
    MiniBus
}



fun main(){
    var number=10
//    val listVehicle= arrayListOf<T>()
//
//    val c1=VehicleType(100,Transportation.Taxi,4)
//    c1.MaxSpeed()
//    c1.MaxCapacity()
//    listVehicle.add(c1)
//
//    val c2=VehicleType(110,Transportation.Van,7)
//    c2.MaxSpeed()
//    c2.MaxCapacity()
//    listVehicle.add(c2)
//
//    val c3=VehicleType(80,Transportation.Ambulance,2)
//    c3.MaxSpeed()
//    c3.MaxCapacity()
//    listVehicle.add(c3)
//
//    val c4=VehicleType(70,Transportation.Bus,13)
//    c4.MaxSpeed()
//    c4.MaxCapacity()
//    listVehicle.add(c4)
//
//    val c5=VehicleType(40,Transportation.SportCar,3)
//    c5.MaxSpeed()
//    c5.MaxCapacity()
//    listVehicle.add(c5)
//
//    val c6=VehicleType(50,Transportation.HatchbackCar,6)
//    c6.MaxSpeed()
//    c6.MaxCapacity()
//    listVehicle.add(c6)
//
//    val c7=VehicleType(130,Transportation.Subway,14)
//    c7.MaxSpeed()
//    c7.MaxCapacity()
//    listVehicle.add(c7)
//
//    val c8=VehicleType(30,Transportation.Truck,1)
//    c8.MaxSpeed()
//    c8.MaxCapacity()
//    listVehicle.add(c8)
//
//    val c9=VehicleType(60,Transportation.Motor,5)
//    c9.MaxSpeed()
//    c9.MaxCapacity()
//    listVehicle.add(c9)
//
//    val c10=VehicleType(65,Transportation.MiniBus,17)
//    c10.MaxSpeed()
//    c10.MaxCapacity()
//    listVehicle.add(c10)
//    var i=0
//
//
//    var swap = true
//    while(swap){
//        swap = false
//        for(i in 0 until listVehicle.size-1){
//            if(listVehicle[i].maxSpead <listVehicle[i+1].maxSpead){
//                val temp = listVehicle[i]
//                listVehicle[i] = listVehicle[i+1]
//                listVehicle[i + 1] = temp
//
//                swap = true
//            }
//        }
//    }
//    println("------Sort by maximum speed------")
//    for (i in 0 until listVehicle.size){
//        println("${listVehicle[i].name1}  with ${listVehicle[i].maxSpead} max speed")
//    }
//    println("------Sort by minimum speed------")
//    var swap1 = true
//    while(swap1){
//        swap1 = false
//        for(i in 0 until listVehicle.size-1){
//            if(listVehicle[i].capacity >listVehicle[i+1].capacity){
//                val temp = listVehicle[i]
//                listVehicle[i] = listVehicle[i+1]
//                listVehicle[i + 1] = temp
//
//                swap1 = true
//            }
//        }
//    }
//    for (i in 0 until listVehicle.size){
//        println("${listVehicle[i].name1} with ${listVehicle[i].capacity} capacity")
//    }

}




