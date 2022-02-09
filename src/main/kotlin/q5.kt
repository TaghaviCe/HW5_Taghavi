import java.util.*
import kotlin.collections.ArrayList

fun <T>List<T>.splitArray(list: List<T>){
    val list2= arrayListOf<T>()
    println("Enter your number of slice:")
    val input=Scanner(System.`in`)
    val number=input.nextInt()
    var j=0

        val c = list.slice(j..j+number)
        println(c)
        j+=number
        if(j+number>=list.size-1){
            for (k in j+1 until list.size){
                list2+=list[k]
            }
            println(list2)

        }



}


fun main(){
    val list= listOf("a","b","c","d","e","f","g")

    list.splitArray(list)

    val list2= listOf(1,2,3,4,5)

    list2.splitArray(list2)
}