package collectionpractice.set;
import java.util.*;
public class HashSetDemo {
    public static void main(String[] args) {

        hashSet();
        linkedHashset();
        treeSet();
    }

    public static void hashSet() {
        HashSet hs = new HashSet();
        hs.add("manju");
        hs.add("akhil");
        hs.add("medha");
        hs.add("sangeetha");

        // System.out.println(hs);
        Iterator itr = hs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());//output values are not in the insertion order it is printing  based on hashcode
            // which is stored in the hash table
        }
    }

    public static void linkedHashset() {
        LinkedHashSet lhs = new LinkedHashSet();
        lhs.add(2);
        lhs.add(24);
        lhs.add(23);
        lhs.add(22);
        lhs.add(12);
        lhs.add(24);
        System.out.println(lhs);

        Iterator itr = lhs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    public static void treeSet() {
        //Tree set values are sorting  ascending order based output.
        //
        TreeSet ths = new TreeSet();
        ths.add(2);
        ths.add(4);
        ths.add(3);
        ths.add(2);
        ths.add(12);
        ths.add(24);
        System.out.println(ths);
        Iterator itr = ths.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

}
