var fName: String? = "lairu";
val lName = " Prasanna";

var saySomething =" hello ";


fun main() {
/*
   if(fName != null)
    {
        print(saySomething);
        print(fName);
        print(lName);
    }
    else
    {
        println("No Name Found");

    }
*/
    when(fName)
    {
        null -> print("No Name Found");
        else -> print("Name Found");

    }





}