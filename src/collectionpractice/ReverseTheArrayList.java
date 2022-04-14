package collectionpractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ReverseTheArrayList {
    public static void main(String[] args) {

        ArrayList ar=new ArrayList();
        ar.add(1);
        ar.add(2);
        ar.add(3);
        ar.add(4);
        ar.add(5);
        System.out.println(ar);
        Iterator itr=ar.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        Collections.reverse(ar);
        Iterator itr1= ar.iterator();
        System.out.println("printing the list in reverse order: ");
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }
    }

}
