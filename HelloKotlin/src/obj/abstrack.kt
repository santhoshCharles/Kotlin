package obj


abstract class Person(open val name:String, open val age:Int){
    abstract fun sayHai();
    abstract fun sayBio();
}
class student1 (override val name:String, override val age:Int, val id:Int) : Person(name,age){
    fun printIn(){
        println("stutent id $id");
    }
   override fun sayHai(){
        println("hi");
    }
   override fun sayBio(){
        println("$name $age");
    }
}
class Employee1 (override val name:String, override val age:Int, val id:Int) : Person(name,age){
    fun printIn(){
        println("student id $id");
    }
   override fun sayHai(){
        println("hi");
    }
   override fun sayBio(){
        println("$name $age");
    }
}
fun main(args:Array<String>){
    val student = Student("santhosh",10,68);
    val employee = Employee("ada poda",45,98);
    student.sayHai();
    student.sayBio();
    student.printIn();
    employee.sayHai();
    employee.sayBio();
    employee.printIn();
}