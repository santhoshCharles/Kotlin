package obj

class Hello(var name:String,var number:Int) {
//    var number:Int;
//    var name:String
//    init{
//        this.number=number;
//        this.name=name;
//    }
    fun hai(name:String){
        println("$number $name");
        println(this.name)
    }
}
fun main(args:Array<String>){
    var hello = Hello("dvjd",19);
    println(hello.name);
    hello.hai("poda dai");
}