fun main (args: Array<String>){
    val message = "hello kotlin";
    println(message);

    //array
    var array= arrayOf("santh","osh","vdkjndfjv");
    var arr = arrayOf("cdmc","cdvbdf","dcbjd");
    var newArr = array+arr;
    print(newArr.size);
    var emp:Boolean=newArr.isEmpty();
    println(emp);
    if(newArr.contains("cdvbdf")){
        println(newArr.contains("cdvbdf"));
    }
    else{
        println("not");
    }



    //list

    var arrList = arrayListOf("dvdfv","sdvcjbdsv","dcjhdgs","dcnjdscjds");
    var anoArrList = arrayListOf("vhdvhd","wfdhiewjf","diasd");
    println(arrList+anoArrList);
    println(arrList.size);
    println(arrList.isEmpty());
    println(arrList.contains("sdvcjbdsv"));
    arrList.add(1,"ada poda");
    println(arrList);
    arrList.remove("dcjhdgs");
    println(arrList);
}