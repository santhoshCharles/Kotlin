package loop

fun main(args:Array<String>){
    var arrList = arrayListOf("fvfdv","fehwfiu","wqdiuewiu");
    for((index,values) in arrList.withIndex()){
        println("index $index values $values");
    }
   outer@ for(i in 1..10){
        for(j in 1..10) {
            if(i-j===5){
                break@outer
            }
            println("$i $j");
        }
    }
}