package JavanterviewPrograms;

import java.util.Arrays;
import java.util.Collections;

public class ArraySorting {
    public static void main(String[] args) {
        sort1();
        sort2();
        //underScoreAsVariable();
        // classA();
        decendingArray();
    }
    //Approch 1 with Arrays class methods
    public static void sort1() {
        int array[] = {13, 7, 6, 45, 21, 9, 100};
        Arrays.sort(array);
        System.out.println("Sorted Arrays: " + Arrays.toString(array));
    }

    //Approach 2 for sorting array
    public static void sort2() {
        int array[] = {13, 5, 2, 8, 76, 2, 134};
        System.out.println("Before sorting array elements: " + Arrays.toString(array));
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
//                    System.out.println("sorted array : " + Arrays.toString(array));
                }
            }
        }
        System.out.println("sorted array : " + Arrays.toString(array));
    }

        public static void decendingArray () {
            Integer [] array = {23, -9, 78, 102, 4, 0, -1, 11, 6, 110, 205};
// sorts array[] in descending order
            Arrays.sort(array);
            Arrays.sort(array, Collections.reverseOrder());
            System.out.println("Array elements in descending order: " +Arrays.toString(array));
        }
}



    //public static void underScoreAsVariable(){

  //Declaring underscore as variable in java 8 only
        // java release 9 on wards '_' is a keyword and may not be used an identifier
       // int _ = 10;
       // System.out.println(_);
    //}


    /*with below code we will get the compilation error "break outside switch or loop",
     because break is related to loop statements, if we want to write break in if condition  that
     if condition need to be souranded by some loop switch or for   */
   /* public static void classA(){
        if(true)
            break;

    }*/





