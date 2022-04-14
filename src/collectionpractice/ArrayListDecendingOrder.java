package collectionpractice;
import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDecendingOrder {
    public static void main(String[] args) {
        List l=new ArrayList();
        l.add(40);
        l.add(20);
        l.add(79);
        l.add(89);
        l.add(100);
        Iterator itr1= l.iterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }
       Comparator comp= Collections.reverseOrder();
        Collections.sort(l,comp);
        Iterator itr2= l.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }
    }
}
