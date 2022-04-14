
//we can do the main method overloading,real time we are not using the main method overloading,
// because main method is calling method in java  not met for business logic

package methodOverloading;

public class MainMethodOverLoading {
    public static void main(String[] a) {
        System.out.println("main method");

        main(10);
        main(2,5);
    }

    public static void  main(int a) {
        System.out.println("print a values"+a);
    }


    public static void main(int a, int b){
        System.out.println("sum of a , b is : " +(a+b));

    }
}
