package obj

open class Course (open var topic:String ){
    open fun learn(){
        println("i am learning $topic")
    }

}
interface Learning {
    fun learn(){
        println("interface learn")
    }
}
class Kotlin ():Course("kotlin"),Learning{
    override fun learn(){
        super<Course>.learn();
        println("kotlin is vast");
    }
}
fun main(args:Array<String>){
    var kotlin = Kotlin();
    kotlin.learn();
}