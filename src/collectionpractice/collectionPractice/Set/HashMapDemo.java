package collectionpractice.collectionPractice.Set;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {

    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();

        hm.put(1, "manju");
        hm.put(2, "paluru");
        hm.put(3, "akhil");
        hm.put(4, "medha");
        System.out.println(hm);

        Set s = hm.keySet();//will get all keys form the hashmap and stored in to set data type variable
        Iterator itr = s.iterator();
        while (itr.hasNext()) {
            Object obj = itr.next();//present value is storing in to the object
            System.out.println(obj+ "  :  " +hm.get(obj));//get method will get the values from the key


        }
    }
}