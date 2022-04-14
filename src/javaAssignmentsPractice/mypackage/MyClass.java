package javaAssignmentsPractice.mypackage;
// Can we have two methods with same signature in java file?
//Yes we can implement two methods with same signature  by using
// approach1: is inner class
//Through main classes reference variable we can  create object for inner class
// approach 2 : is using two classes in same java file(outer class or new class)
//we can write multiple outer class in java file but one class  should be public.
//method name--- actual name of method
//method signature---combination of method name and parameters
 public class MyClass {
    public static void main(String[] args) {
        MyClass myc=new MyClass();
        myc.method1();
       MyInnerClass mic= myc.new MyInnerClass();
        mic.method1();
        MyScondClass msc= new MyScondClass();
        msc.method1();
    }
    public  void method1(){
        System.out.println("from method1");
    }

    //Approach 1: By using Inner Class
    class MyInnerClass{

        public void method1(){
            System.out.println("My inner class----from method");
        }
    }
    }

    //Approach 2: by using outer class or new class in same java file
class MyScondClass {

    public void method1() {
        System.out.println("My second class=====from method");
    }
}
