package JavanterviewPrograms;

import java.util.ArrayList;
import java.util.List;

public class Student {
    int rollno;
    String name,address;
    Student(int rollno,String name,String address){
        this.rollno=rollno;
        this.name=name;
        this.address=address;
    }
}
class  CollectionsDemo{
    public static void main(String[] args) {
        List<Student> l =new ArrayList<Student>();//passing the class name into the generics type,
        // it will accept only student type of data
        Student s1=new Student(1,"manju","sunnyvale, ca");
        Student s2 = new Student(2,"paluru","tx");
        Student s3= new Student(3,"akhil","NC");
        l.add(s1);
        l.add(s2);
        l.add(s3);
        for(Student s:l){
            System.out.println(s.rollno+" "+s.name+" "+ s.address);
        }


    }
}