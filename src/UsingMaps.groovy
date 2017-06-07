/**
 * Created by cnapoles on 6/5/17.
 */

class MapsTopic {
    static void main(String[] args) {

        // Map (also known as an associative array, dictionary, table, and hash) is an unordered collection of object references
        // the use of contains key is to check if it is similar
        def mp = ["TopicName" : "Maps", "TopicDescription" : "Methods in Maps"]
        println(mp.containsKey("TopicName"));
        println(mp.containsKey("TopicDescription"));

        //get in Maps is to get the equivalent
        println(mp.get("TopicDescription"))

        //put in Maps is to add another category
        mp.put("The Key ID: ", "001")
        println(mp)

        //set Date & time
        Date olddate = new Date("05/11/2015");
        Date newdate = new Date("05/12/2015");
        Date latestdate = new Date();

        olddate.setTime(10000);
        newdate.setTime(10000);
        latestdate.setTime(10000);

        System.out.println(olddate.toString());
        System.out.println(newdate.toString());
        System.out.println(latestdate.toString());

        //Closure

        def clos = {param->println "Hello ${param}"};
        clos.call("World");
    }
}
