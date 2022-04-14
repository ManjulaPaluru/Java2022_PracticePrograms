package JavanterviewPrograms;

import java.util.Vector;
//In arraylist virtual capacity is by default 10  after exceeding default capacity it will increase 50 %
// ( physical capacity/2) like 15
// but in vector by default capacity is 10 , after exceeding the default capacity it will increase double  20
//This is the main disadvantage of vector
public class VectorDemo {
    public static void main(String[] args) {

        Vector v= new Vector();
        v.add("manju");
        v.add("paluru");
        System.out.println(v.capacity());
    }
}
