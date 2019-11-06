package stack

class Stack<E>(vararg val ele:E){
    val iteam=ele.toMutableList();
    fun push(data:E){
          iteam.add(data);
    }
    fun pop():E{
        return iteam.removeAt(iteam.size-1);
    }
    fun dis(){
        println(iteam);
    }
}
fun main(args: Array<String>){
    val Stack=Stack(1,2,3,4);
    Stack.dis();
    println(Stack.pop());
    Stack.dis();
}