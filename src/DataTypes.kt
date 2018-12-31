// this exercise is for the data types and how we can assign data to them

fun main(args: Array<String>){

    /* Data Types in Kotlin
      Type	    Bit width
      Double	64
      Float	    32
      Long	    64
      Int	    32
      Short	    16
      Byte	    8*/


    val a = 1
    print(a)
    println(" - " +a.javaClass.name)

    var b = 1
    println(b)

    // TODO("Uncomment a below to see the error")
    //val cannot be reassigned so we cannot change values that are assigned once.
    // a=2
    // println(a)

    b = 2 // this works as we can change values of var so it reassigns the value to 2
    println(b) // now it prints 2

    //we also can explicitly mention the data type
    var c :Int = 1
    print(c)
    println(" - " +c.javaClass.name)
    // now we can't assign another data type type other than int
    // TODO("uncomment c and run to see the error")
    // throws error
    // c = 0.1
    // nor will this work
    // c = "Hello"

    val d: String = "This is a string"
    print(d)
    println(" - " +d.javaClass.name)


    val e : Double = 0.1
    print(e)
    println(" - " +e.javaClass.name)

    val f: Boolean = true
    print(f)
    println(" - " + f.javaClass.name)


}