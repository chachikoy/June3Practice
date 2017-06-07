/**
 * Created by cnapoles on 6/5/17.
 */
class ClosureSample{
//    static void main(String[] args) {
//        def str1 = "Hello";
//        def clos = {param -> println "${str1} ${param}"}
//        clos.call("World");
//
//        // We are now changing the value of the String str1 which is referenced in the closure
//        str1 = "Welcome";
//        clos.call("World");
//    }


    def static Display(clo) {
        // This time the $param parameter gets replaced by the string "Inner"
        clo.call("Inner");
    }

    static void main(String[] args) {
        def str1 = "Hello";
        def clos = { param -> println "${str1} ${param}" }
        clos.call("World");

        // We are now changing the value of the String str1 which is referenced in the closure
        str1 = "Welcome";
        clos.call("World");

        // Passing our closure to a method
        ClosureSample.Display(clos);
println()

        // Closure in Maps
        def mp = ["TopicName" : "Maps", "TopicDescription" : "Methods in Maps"]
        mp.each {println it}
        mp.each {println "${it.key} maps to: ${it.value}"}

        //in conditional statement
        println()
        def lst =[1,2,3,4]
        lst.each {println it}
        println("The list will only display those numbers which are divisible by 2")
        lst.each {num -> if (num % 2 == 0) println(num)}


    }
}