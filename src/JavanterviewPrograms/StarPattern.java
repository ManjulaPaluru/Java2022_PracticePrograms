package JavanterviewPrograms;

import java.util.ArrayList;

public class StarPattern {
    public static void main(String[] args) {
        //star();
        square();
        patternOne();
        patternTwo();
        patternThree();
        rightSideTriangle();
        diamond();
    }

    public static void star() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("a");
            }
            System.out.println();
        }
    }

    public static void square() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("%  ");
            }
            System.out.println();
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++");
    }

    public static void patternOne() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                // for(int k=1;k<=j;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //System.out.println();
    }

    public static void patternTwo() {
        System.out.println("+++ =================================");
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j <= 5; j++) {
                System.out.print("$ ");
            }
            System.out.println();
        }
    }

    public static void patternThree() {
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j <= 5; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void rightSideTriangle() {
        for (int i = 1; i <= 5; i++) {

            for (int j = i; j <= 5; j++) {
                System.out.print(" ");
            }
            //for (int j = 1; j <=i; j++) {
             //   System.out.print("*");
            //}

            System.out.println();
        }
    }

    public static void diamond() {
        System.out.println("++++++++=============+++++++++++++++");
        for (int i = 1; i <5; i++) {
            for (int j = i; j <=5; j++) {
               System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <=5; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j <= 5; j++) {
                System.out.print("* ");
            }
            for (int j = i; j <= 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        }
    }

