package obj

interface Vehicle{
    fun call();
}
class Car:Vehicle{
    override  fun call(){
        println("car")
    }
    fun summa(){
        println("giiii")
    }
}
class Bike:Vehicle{
    override fun call(){
        println("bike");
    }
}
fun main(args:Array<String>){
    val Car:Vehicle=Car();
    val Bike:Vehicle=Bike();
    Car().call();
    Bike.call();
}