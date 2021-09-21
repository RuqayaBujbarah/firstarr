fun main(){
    val arr = arrayOf("", "", "", "", "")
    println("Enter your top five movies: ")
    for (i in 0..4){
        arr[i]= readLine()!!.toString()
    }
    println("This is your top five movies:)")
    for (i in 0..4){
        println(arr[i])
    }
}