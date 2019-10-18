package AvoidHardCode

class Color(var color:SelectColor){
    fun printColor(){
        println(color)
    }
}
fun main(args:Array<String>){
    var color = Color(SelectColor.BLUE);
    println(color.color)
}