/**
 * Created by cnapoles on 6/5/17.
 */

class MethodsPractice{
    static void main (String[] args){
        int x = 8
        int y = 9
        String a = 'Single Quote '
        String b = "Double Quote"
        String c = "'tripple Quote " + "Another tripple qoute'"
        println(a)
        println(b)
        println(c)

//String repitition
        println(a*3)


        println sum(9);
        MethodsPractice mp = new MethodsPractice()
        mp.setX(200)
        println mp.getX()

        String xString =x.toString()
        xString

//toString
        println("To String "+ xString+ " " + y)
        println(Integer.toString(19))

        println(x.compareTo(y))
        println(x.shortValue())
        println(x.floatValue())


        def lst = [11, 12, 13, 14];

        println(lst);
        lst.add(15);

        println(lst);
       lst.add(3, 5)
        def newList = []
        newList = lst.plus([5,4,6])

        println(newList);
        println newList.pop();
        println(newList)

    }

    // METHODS
    static int sum(int a, int b=9){
        return a + b;
    }

    int x =100;

    public int getX() {
        return x;
    }

    public void setX(int pX) {
        x = pX;
    }


}
