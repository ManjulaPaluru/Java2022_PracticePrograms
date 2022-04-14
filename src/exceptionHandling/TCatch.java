package exceptionHandling;

public class TCatch {
    int i = 10;


    //if we mention first catch as throwable or exception in catch block  it will catch the all exceptions.
// will get error if u try to  add again catch block with  different exceptions separatly,  error message is like
    //delete or move the exception before throwable catch statement.
    static {
        System.err.println("test");
    }

    public static void main(String[] args) {
        try {
            int i = 10 / 0;

            System.out.println(i);

        } catch (Throwable e) {
            e.printStackTrace();
        }
        /*  catch(ArithmeticException e){//delete this catch or  move to before catch which is has throwable */

  }

}

