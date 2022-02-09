interface Vehicle{

    abstract val maxCapacity: Int
    abstract val name: Transportation
    abstract val maxSpead: Long

}
interface PublicTrasportationVehicle:Vehicle{
    fun MaxSpeed()
    fun MaxCapacity()
}
interface ServiceTrasportationVehicle:Vehicle {
    fun MaxSpeed()
    fun MaxCapacity()
}
interface PrivateTrasportationVehicle:Vehicle{
    fun MaxSpeed()
    fun MaxCapacity()

}
 class Van(override var maxSpead:Long,override var maxCapacity:Int,override var name:Transportation):PrivateTrasportationVehicle{
     var maxSpeedVan:Long=0
     var maxCapacityVan:Int=0
     override fun MaxSpeed(){
        maxSpeedVan=maxSpead
     }

     override fun MaxCapacity() {
          maxCapacityVan=maxCapacity
     }

 }

class SportCar(override var maxSpead:Long, override var maxCapacity:Int,override var name:Transportation):PrivateTrasportationVehicle{
    var maxSpeedSportCar:Long=0
    var maxCapacityVanSportCar:Int=0
    override fun MaxSpeed() {
      maxSpeedSportCar=maxSpead
    }

    override fun MaxCapacity() {
    maxCapacityVanSportCar=maxCapacity
    }

}


class Truck(override var maxSpead:Long,override var maxCapacity :Int,override var name:Transportation):ServiceTrasportationVehicle{
    var maxSpeedTruck:Long=0
    var maxCapacityTruck:Int=0
    override fun MaxSpeed() {
     maxSpeedTruck=maxSpead
    }

    override fun MaxCapacity() {
     maxCapacityTruck=maxCapacity
    }

}
class Ambulance(override var maxSpead:Long,override var maxCapacity:Int,override var name:Transportation):ServiceTrasportationVehicle{
    var maxSpeedAmbulance:Long=0
    var maxCapacityAmbulance:Int=0
    override fun MaxSpeed() {
       maxSpeedAmbulance=maxSpead
    }

    override fun MaxCapacity() {
      maxCapacityAmbulance=maxCapacity
    }

}
class Subway(override var maxSpead:Long, override var maxCapacity:Int,override var name:Transportation):PublicTrasportationVehicle{
    var maxSpeedSubway:Long=0
    var maxCapacitySubway:Int=0
    override fun MaxSpeed() {
        maxSpeedSubway=maxSpead
    }

    override fun MaxCapacity() {
        maxCapacitySubway=maxCapacity
    }

}
class Taxi(override var maxSpead:Long, override var maxCapacity:Int,override var name:Transportation):PublicTrasportationVehicle{
    var maxSpeedTaxi:Long=0
    var maxCapacityTaxi:Int=0
    override fun MaxSpeed() {
        maxSpeedTaxi=maxSpead
    }

    override fun MaxCapacity() {
        maxCapacityTaxi=maxCapacity

    }

}
class Bus(override var maxSpead:Long,override var maxCapacity:Int,override var name:Transportation):PublicTrasportationVehicle{
    var maxSpeedBus:Long=0
    var maxCapacityBus:Int=0
    override fun MaxSpeed() {
        maxSpeedBus=maxSpead
    }

    override fun MaxCapacity() {
        maxCapacityBus=maxCapacity

    }

}



enum class Transportation{
    Subway,
    Taxi,
    Bus,
    MiniBUs,
    Ambulance,
    Truck,
    SportCar1,
    SportCar2,
    HatchbackCar,
    Van1,
    Van2
}



fun main(){
    var number=10
    val listVehicle= arrayListOf<Vehicle>()

    val c1=Subway(130,4,Transportation.Subway)
    c1.MaxSpeed()
    c1.MaxCapacity()
    listVehicle.add(c1)

    val c2=Taxi(110,7,Transportation.Taxi)
    c2.MaxSpeed()
    c2.MaxCapacity()
    listVehicle.add(c2)

    val c3=Van(80,2,Transportation.Van1)
    c3.MaxSpeed()
    c3.MaxCapacity()
    listVehicle.add(c3)

    val c4=SportCar(70,13,Transportation.SportCar1)
    c4.MaxSpeed()
    c4.MaxCapacity()
    listVehicle.add(c4)

    val c5=Bus(40,3,Transportation.Bus)
    c5.MaxSpeed()
    c5.MaxCapacity()
    listVehicle.add(c5)

    val c6=Ambulance(50,6,Transportation.Ambulance)
    c6.MaxSpeed()
    c6.MaxCapacity()
    listVehicle.add(c6)

    val c7=SportCar(100,14,Transportation.SportCar2)
    c7.MaxSpeed()
    c7.MaxCapacity()
    listVehicle.add(c7)

    val c8=Truck(30,1,Transportation.Truck)
    c8.MaxSpeed()
    c8.MaxCapacity()
    listVehicle.add(c8)

    val c9=Van(60,5,Transportation.Van2)
    c9.MaxSpeed()
    c9.MaxCapacity()
    listVehicle.add(c9)

    val c10=Bus(65,17,Transportation.MiniBUs)
    c10.MaxSpeed()
    c10.MaxCapacity()
    listVehicle.add(c10)
    var i=0


    var swap = true
    while(swap){
        swap = false
        for(i in 0 until listVehicle.size-1){
            if(listVehicle[i].maxSpead <listVehicle[i+1].maxSpead){
                val temp = listVehicle[i]
                listVehicle[i] = listVehicle[i+1]
                listVehicle[i + 1] = temp

                swap = true
            }
        }
    }
    println("------Sort by maximum speed------")
    for (i in 0 until listVehicle.size){
        println("${listVehicle[i].name}  with ${listVehicle[i].maxSpead} max speed")
    }
    println("------Sort by minimum speed------")
    var swap1 = true
    while(swap1){
        swap1 = false
        for(i in 0 until listVehicle.size-1){
            if(listVehicle[i].maxCapacity >listVehicle[i+1].maxCapacity){
                val temp = listVehicle[i]
                listVehicle[i] = listVehicle[i+1]
                listVehicle[i + 1] = temp

                swap1 = true
            }
        }
    }
    for (i in 0 until listVehicle.size){
        println("${listVehicle[i].name} with ${listVehicle[i].maxCapacity} capacity")
    }

}




