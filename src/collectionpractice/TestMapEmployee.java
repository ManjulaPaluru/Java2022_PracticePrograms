package collectionpractice;

import collectionpractice.collectionPractice.Set.Employee;

import java.util.HashMap;
import java.util.Map;

public class TestMapEmployee {
    public static void main(String[] args) {
        Map<Employee, String> empMap= new HashMap<Employee,String>();
        Employee e1=new Employee("manju",20);
        empMap.put(e1,"perminent");
        System.out.println(empMap.get(e1));
        e1.setAge(25);
        empMap.put(e1,"temp");
        System.out.println(empMap.get(e1));
      
    }
}
