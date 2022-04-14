package javarepeatpracticeing;

import java.util.Scanner;

//print the number by using user input
public class PrintInteger {
    public static void main(String[] args) {
        System.out.println("enter the integer value");
        Scanner sc= new Scanner(System.in);
       int num=  sc.nextInt();
        System.out.println("You entered number is:" + num);

    }
}
