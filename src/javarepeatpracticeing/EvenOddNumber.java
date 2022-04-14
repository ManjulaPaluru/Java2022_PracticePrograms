package javarepeatpracticeing;

import java.util.Scanner;

public class EvenOddNumber {
    public static void main(String[] args) {
        System.out.println("enter number: ");
        int sc=new Scanner(System.in).nextInt();
        if(sc%2==0){
            System.out.println("given no is even number");
        }else{
            System.out.println("given no is odd number");
        }
    }
}
