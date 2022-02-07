
class CompereGeneric<T:Comparable<T>>{

fun <T: Comparable<T>> compare( a1:T, a2:T): T? {

    return if (a1 > a2)
        a1
    else if(a1<a2)
        a2
    else
        null
}
}
fun main(){
    val c1=CompereGeneric<Int>()
    val re1=c1.compare<Int>(1,1)
    println(re1)
    val c2=CompereGeneric<Double>()
    val re2=c2.compare<Double>(2.3,1.3)
    println(re2)
    val c3=CompereGeneric<Long>()
    val re3=c3.compare<Long>(124,134)
    println(re3)
    val c4=CompereGeneric<String>()
    println(CompereGeneric<String>().compare("java", "kotlin"))




}
