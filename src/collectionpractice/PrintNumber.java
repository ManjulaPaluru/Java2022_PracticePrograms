package collectionpractice;

public class PrintNumber {
    static int count=1;
    public static void main(String[] args) {
       printNumber();
    }

    public static void printNumber(){
        if (count <= 100000) {
            System.out.println("hello");
            count++;
           // printNumber();
        }
    }
}
