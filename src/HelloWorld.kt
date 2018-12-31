fun hello() = "Hello World" // this is a function assignment so it returns a string

fun thisIsAFunction(){
    println("we can create a function like this")
    //this print kotlin.Unit as there is no return type for this function
 }

fun anotherFunction() :String{
    return "this is another function" // this has a return type so it won't print kotlin.Unit like thisIsAFunction method.
}

fun main(args: Array<String>){
    println( hello())
    println("Hello Kotlin")
    println(thisIsAFunction())
    println(anotherFunction())
}