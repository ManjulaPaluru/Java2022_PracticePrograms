package arraysConcept;

import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {
        //array object is creating for int data type
       /* int a[]=new int[4];
        a[0]=100;
        a[1]=200;
        a[2]=300;
        a[3]=400;
        //a[4]=500;// if u try to add more than specified array  length will get  ArrayIndexOutOfBoundsException
        System.out.println( a[1]);
        //System.out.println( a[-1]);// If u try to print out of the boundary means negative value or more than specified length will get  ArrayIndexOutOfBoundsException
    // array object is creating for float data type
        float f[]=new float[3];
        f[0]= (float) 2.09;
        f[1]= (float) 0.23;
        System.out.println( f[1]);

        //character
        char c[]=new char[2];
        //c[0]='a';
        //c[1]='b';
        System.out.println( c[0]);
        //If we want to pass all dat types of values into single array we need to specify data type as object.

        Object emp[] = new Object[5];
        emp[0]="tom";
        emp[1]=10;
        System.out.println(emp.length);
        for(int i=0;i<emp.length;i++) {
            System.out.println(emp[i]);
            System.out.println("++++++++++++++++");*/

        findCommonElements();
        findUnCommonElements();

    }

    public static void findCommonElements() {
        int ar[] = {1, 2, 3, 4, 5, 6};
        int ar1[] = {2, 3, 5,7,8,6};

        int l = 0;
        int q=0;
        int commonElements[] = new int[ar1.length];
        int uncommon[]=new int[ar1.length];

        for (int j = 0; j < ar.length; j++) {
            for (int k = 0; k < ar1.length; k++) {
                if (ar[j] == ar1[k]) {
                    commonElements[l]=ar[j];
                    l++;
                }

            }

        }
        System.out.println(Arrays.toString(commonElements));
    }

    //find uncommon elements from given 2 arrays list
    public static void findUnCommonElements(){
        int a[]=new int[]{1,2,3,4,5,7,8,9};
        int b[]=new int[]{2,4,5,9};

        int m=0;
        int uncommonElements []=new int[a.length];

        for (int i=0;i<a.length;i++){
            for (int j=0;j<b.length;j++){
                if(a[i]!=b[j]){

                }
                uncommonElements[m] = a[i];
            }
        }

        System.out.println("uncommon elements in the given 2 arrays: "  +Arrays.toString(uncommonElements));
    }
}



