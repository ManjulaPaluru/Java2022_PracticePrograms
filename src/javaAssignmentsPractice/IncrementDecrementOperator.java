package javaAssignmentsPractice;

public class IncrementDecrementOperator {
    public static void main(String[] args) {
        int i=10;
        int j=i--;
        System.out.println(i);//9
        System.out.println(j);//10
        int i1=10;
        int i2=20;
        int i3=i1--;
        int i4=--i2;
        System.out.println(i3);//10
        System.out.println(i1);//9
        System.out.println(i2);//19
        System.out.println(i4);//19
        int j1= 5;
        int j2=++j1;
        System.out.println(j1);//6
        System.out.println(j2);//6
        int j3=j1++;
        System.out.println(j3);//6
        System.out.println(j1);//7
    }



}
