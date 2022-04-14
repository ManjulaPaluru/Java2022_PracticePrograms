package JavanterviewPrograms;
import java.util.ArrayList;
//Getting IndexOutOfBoundaryException when we try to get the index 0 th position value from the arraylist without adding any value
// Index 0 out of bounds for length 0
public class ArrayListIndexOutOfBoundryException {
    public static void show() {
        ArrayList<String> ar = new ArrayList<String>();
        System.out.println(ar.size());
        System.out.println(ar.get(0));
    }
    public static void main(String[] args) {
        ArrayListIndexOutOfBoundryException ag=new ArrayListIndexOutOfBoundryException();
        ag.show();
    }
}