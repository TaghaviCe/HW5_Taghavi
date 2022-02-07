fun<T> ArrayList<T>.printList(list: ArrayList<T>){
     for (i in list){
         println(i)
     }
}
fun main(){
    val list= arrayListOf(1,2,3,4,5)
    list.printList(list)
    val list2= arrayListOf("amir","sara","saba")
    list2.printList(list2)
}
