package obj

open class person(open val name:String, open val age:Int){
    fun sayHai(){
        println("hi");
    }
    fun sayBio(){
        println("$name $age");
    }
}
class Student (override val name:String, override val age:Int, val id:Int) : person(name,age){
    fun printIn(){
        println("stutent id $id");
    }
}
class Employee (override val name:String, override val age:Int, val id:Int) : person(name,age){
    fun printIn(){
        println("student id $id");
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