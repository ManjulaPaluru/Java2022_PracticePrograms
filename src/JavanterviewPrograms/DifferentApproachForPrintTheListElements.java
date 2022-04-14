package JavanterviewPrograms;

import java.util.ArrayList;
import java.util.*;

import static java.lang.String.CASE_INSENSITIVE_ORDER;

public class DifferentApproachForPrintTheListElements {
    public static void main(String[] args) {

        List<String> al= new ArrayList<String>();

        al.add("manju");
        al.add("paluru");
        al.add("akhil");
        al.add("medha");
        al.add(2,"suneel");
        al.add("manju");
        al.add("manju");

  // Approach 1:  using print method
        System.out.println(al);
        System.out.println("++++++++++++++++++");
        //Approach 2: using for loop to print list of elements from the list
        for(int i=0;i<al.size();i++){
            System.out.println(al.get (i));
        }

       //Approach 3: using for each loop, we can use for loop also
        for (String e:al)
        System.out.println(e);

//Approach 4: using ListIterator method :
// ListIterator interface for forward directions and backward directions
        ListIterator<String> itr = al.listIterator();//by using this we can print values from list forword

        System.out.println("In forword Direction: ");
        while(itr.hasNext()){//we are checking next element is there in the list
            System.out.println(itr.next());//we are printing the present element
        }
        System.out.println("In reverse order: ");
        while(itr.hasPrevious()){
            System.out.println(itr.previous());
        }
      //Approach 5: using Iterator  interface and iterate method
        Iterator<String> itr1=al.iterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }
        //Approach 6: using forEach loop with lambda expressions for printing the values from arraylist
        al.forEach(a->{System.out.println(a);});


        //Approach 7: using forEachRemaining method with lambda expression
        System.out.println("++++++++++++++++");
        Iterator<String> itr2= al.iterator();
        itr2.forEachRemaining(a->{
            System.out.println(a);
        });
        System.out.println("++++++++++++++++");
   ArrayList<String> al2=new ArrayList<String>();
   al2.add("abc");
   al2.add(1,"cfe");
   al2.addAll(al);
        System.out.println(al2);
   for(String a: al2)
        System.out.println(a);
        System.out.println(al.equals(al2));//false
        //++++++++++++++++++++++++++++++
        ArrayList<String> al3= new ArrayList<String>();
        al3.add("cfe");
        al3.add("abc");
        System.out.println(al2.equals(al3));
        System.out.println(al3.isEmpty());
        System.out.println(al.lastIndexOf("manju"));
        System.out.println(al.indexOf("manju"));
        System.out.println(al.indexOf("eeeee"));//-1 because this string element is not available in the list , but we are try to access that
        System.out.println(al.contains("manju"));
        System.out.println(al.remove(0));
        System.out.println(al);
        System.out.println(al.remove("manju"));
        System.out.println(al);
        System.out.println(al3.removeAll(al));
        System.out.println(al);
        System.out.println(al.set(1,"kkkk"));
        System.out.println(al);
         al.sort(String.CASE_INSENSITIVE_ORDER);
        System.out.println(al);
        al.sort(Comparator.naturalOrder());
        System.out.println(al);
        System.out.println(al.subList(1,3));
        System.out.println(al.size());
        System.out.println(al.get(2));


    }

    private static Comparator<String> getCaseInsensitiveOrder() {
        return CASE_INSENSITIVE_ORDER;
    }
}
