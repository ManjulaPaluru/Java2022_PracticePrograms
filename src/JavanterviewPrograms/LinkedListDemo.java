package JavanterviewPrograms;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList<Student1>  list1= new LinkedList<Student1>();
        Student1 s1=new Student1(1);
        Student1 s2=new Student1(2);
        list1.add(s1);
        list1.add(s2);
        list1.add(new Student1(3));
        list1.add(new Student1(4));
       // System.out.println(list1);//hash code values will print  for proper data we need to iterate the loop
        //for(int i=0; i<list1.size();i++){
         //   System.out.println(i);


        Iterator itr= list1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());

        }


    }
}
class Student1 {
    int rno;

    public Student1(int rno) {
        this.rno = rno;
    }
    public String toString(){
        return " " +rno;
    }
}