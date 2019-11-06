class Person<T>(age: T){
    var age: T = age
    init {
        this.age= age
        println(age)
    }
    fun<Ti> gen(a:Ti){
        //var agee:Ti=hi;
        println(a);

    }
}
fun main(args: Array<String>){
    var ageInt: Person<Int> = Person<Int>(30)
    var ageString: Person<String> = Person<String>("40")
    ageInt.gen<Int>(10);
    ageInt.gen<String>("10");
}  