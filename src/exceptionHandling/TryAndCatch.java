package exceptionHandling;

public class TryAndCatch {

    public TryAndCatch(String hello) {
    }

    public static void main(String[] args) {

        int a[]={2,3};
        try {
            int i = 9 / 9;
            a[0]=1;
            a[1]=2;
            System.out.println("printing i value" +i);
        } catch (ArithmeticException e) {
            e.printStackTrace();


        }

        finally {
            System.out.println("finally block execution");
        }
            try {
             a[4]=4;
                System.out.println("exception coming inside catch");
            }
            catch(ArrayIndexOutOfBoundsException e1){
                e1.printStackTrace();
            }

        System.out.println("print ");
        }



    }



