class SampleProgram{
    static void main(String[] args){


        int [][] multiply = new int[10][10]

        int value1 = 1

        for(int row = 0; row < multiply.length; row++){
            int value2 = 1
            for (int column = 0; column < multiply.length; column++){

                multiply[row][column] = value1 * value2
                value2++
                print(multiply[row][column] + " ")


            }
            value1++
            println()
            if (value1 == 3)
                println "start of 3"
                continue


        }
        println("***********************************************")

        def employee = ["Ken" : 21, "John" : 25, "Sally" : 22];

        for(emp in employee) {
            println(emp);
        }

    }



}