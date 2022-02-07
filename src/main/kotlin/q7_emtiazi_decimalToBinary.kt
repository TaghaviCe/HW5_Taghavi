
import java.util.*
import kotlin.math.pow

fun getBinaryNumber(decimalNumber: Int): String {
    var decimalNumber = decimalNumber
    var binary : String=""

    while (decimalNumber > 0) {
        val r = (decimalNumber % 2).toString()
        decimalNumber /= 2
        binary+=r
    }

    return binary.reversed()
}


fun getDecimalNumber(binaryNumber: Long): Int {
    var binaryNumber = binaryNumber
    var decimal = 0
    var power = 0

    while (binaryNumber > 0) {
        val r = binaryNumber % 10                                         //example:1011--->1011 % 10 --> 101.1-->r=1
        decimal = (decimal + r * 2.0.pow(power.toDouble())).toInt()       //0+1*2^0
        binaryNumber /= 10                                                //example binaryNumber=101
        power++
    }
    return decimal
}
fun main() {
    try {
        println("Enter Decimal Number  :")
        val input = Scanner(System.`in`)
        val decimalNumber = input.nextInt()
        val binaryNumber = getBinaryNumber(decimalNumber)
        println("Binary Number : $binaryNumber")

        println("Enter Binary Number :")
        val binary = input.nextLong()
        val decimal = getDecimalNumber(binary)
        println("Decimal Number : $decimal")
    }catch (e:Exception){
        println("error!")
    }

}
