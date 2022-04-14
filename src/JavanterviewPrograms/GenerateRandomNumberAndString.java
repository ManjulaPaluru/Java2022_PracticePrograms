package JavanterviewPrograms;

import java.util.Random;

public class GenerateRandomNumberAndString {
    public static void main(String[] args) {
        //Approach1: using Random build in class
        Random rand= new Random();
       int  rand_int = rand.nextInt(100);
        System.out.println("Random interger with in the 100 range: " +rand_int);

     double rand_double = rand.nextDouble();//range 0.0 and leass than 1.0
        System.out.println("Random double value: " + rand_double);

        //Approach 2:  By using Math class
        System.out.println(Math.random());// we can generate random decimal no using math class also
// Approach 2: Apache commons -lang API


    }
}
