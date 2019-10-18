package obj

class Bio(var name:String, var age:Int){
    override fun toString(): String {
        return "name $name age $age";
    }
}
data class dataBio(var name:String, var age:Int){

}
fun main(args:Array<String>){
    var bio1 = Bio("santhosh",21);
    var bio2 = Bio("santhosh",21);
    var dataBio1 = dataBio("santhosh",21);
    var dataBio2 = dataBio("santhosh",21);
    var dataBio3 = dataBio1.copy(age=12);
    println(bio1);
    println(dataBio1);
    println(dataBio3);
    println(bio1.equals(bio2));
    println(dataBio1.equals(dataBio2));
    var set = hashSetOf(dataBio1,dataBio2,dataBio3);
    println(set);
    var set2 = hashSetOf(bio1,bio2);
    println(set2);

}