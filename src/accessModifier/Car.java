package accessModifier;

public class Car {
    public String name;
    private int LIC_no;
    protected int price;
    String colour;

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.name = "manju";
        c1.price = 123243;
        c1.LIC_no = 123;
        c1.colour = "red";

        test1();
        test2();
        test3();
        test4();


        }

    public static void test1 () {
        System.out.println("public method");
    }
    private static void test2(){
        System.out.println("private method");

    }
    static void test3(){
        System.out.println("default method");
    }
    protected static void test4(){
        System.out.println("protected method");
    }

}