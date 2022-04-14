package collectionpractice;

public class StackOverFlowError {
    public static void m1() {
        m2();
    }
    public static void m2(){
        m3();
    }
    public static void m3(){
        int i=10;
        System.out.println("m3: " +i);
    }

    public static void main(String[] args) {

        m1();
    }
}