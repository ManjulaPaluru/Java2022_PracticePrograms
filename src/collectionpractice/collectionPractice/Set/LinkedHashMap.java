package collectionpractice.collectionPractice.Set;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.*;


public class LinkedHashMap {
    public static void main(String[] args) {
       Map lhm= (Map) new LinkedHashMap();
        lhm.put("name" ,"manjula");
        lhm.put("dob","3th2033");

    // Set s=   lhm.keySet();
     Iterator itr= lhm.keySet().iterator();
     while(itr.hasNext()){
          Object obj=itr.next();//object key
         System.out.println(obj +"  :  "+ lhm.get(obj));
     }



    }
}
