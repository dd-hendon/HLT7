package io.HLT7;
import java.util.Scanner;

public class ScannerMax {
    public static void demo(){
        Scanner sc = new Scanner(System.in);
        int x;
        int y;

        System.out.println("Max of two numbers");

        System.out.print("Enter first number: ");
        x = sc.nextInt();

        System.out.print("Enter second number: ");
        y = sc.nextInt();

        if (x >= y){
            System.out.println(x);
        }
        else if (x < y){
            System.out.println(y);
        }

        System.out.println();

    }
}
