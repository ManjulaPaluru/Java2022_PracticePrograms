package arraysConcept;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {

     arrayListSample();

    }

public static void arrayListSample(){
    ArrayList<Object> emp =new ArrayList<Object>();
        emp.add("manjula");
        emp.add(1);
        emp.add(30000);
        emp.add("Female");
        emp.add("Bangalore");
        System.out.println(emp.size());
        for(int i=0;i<emp.size();i++) {
            System.out.println(emp.get(i));
        }
    }

}
