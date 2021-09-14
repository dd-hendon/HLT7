package io.HLT7;

public class Main {

    public static void main(String[] args) {

        //Variables and string concatenation
        Literals.demo();

        //Types  of integer
        Integers.demo();

        //Data type wrapper methods
        MinMax.demo();

        //OOP basics
        Student Dan = new Student();
        Dan.setData(777, "Daniel");
        Dan.printData();

        //Using constructor to achieve same result
        Student Sophia = new Student(888, "Sophia");
        Sophia.printData();

        //Scanner to determine max of two ints
        ScannerMax.demo();

        //Return values
        System.out.print("Passing the return value of 7 - 2 to println: ");
        System.out.println(Return.subtract(7, 2));


        //TODO Upload to GH

    }
}
