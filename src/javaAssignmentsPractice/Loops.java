package javaAssignmentsPractice;

public class Loops {
    public static void main(String[] args) {
        int i=0;
        int j=10;
        //printing even numbers from 100
        System.out.println("even numbers in 100: ");
        while(i<=100){
            System.out.println(i);
           i=i+2;
        }
        //printing 10 to 1 using for loop
        for(j=10 ;j>0;j--){
            System.out.println(j);
        }
        //it will go infinite if we are not mention the initialization and increment in the for loop, need to use break statement
       /* for(;j<=10;){
            System.out.println(j);
        }*/

        do{
            System.out.println("do while loop");
            System.out.println("do while loop:  " +i);
        } while(i<=100);
    }

}



