package Encap

class Ani{
    var a:Int =0
    get(){
        println("get field"+field);
        return field;
    }
    set(value){
        println("set field"+value);
        field = value;
    }
}
fun main(args: Array<String>){
    var aa = Ani();
    aa.a=8;
    println(aa.a);
}