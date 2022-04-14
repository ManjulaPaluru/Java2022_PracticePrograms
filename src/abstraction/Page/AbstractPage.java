package abstraction.Page;

public abstract class AbstractPage {

     // Constructor
   //1. we can create constructors in abstract class, but we can't create the object for abstract class,
   // 2. but we can create object for child class , when we create the child class object by the time java
   // will create default constructor it's not available in parent and child, otherwise it will
   //execute first parent default constructor and child constructor.
   //if we have any parameterized constructor in child and  parent we need to create mandatory default constructor
   // in parent class.

    public AbstractPage(){
      System.out.println("AbstractPage=====constructor");
    }


   //Abstract methods
    public abstract void title();
    public abstract void url();


    //Non-Abstract Method
    public void timeOut(){
        System.out.println("page timeout is 10 sec");
    }


    //declared with final no one can override

    public final void logo(){
        System.out.println("page logo");
    }


}
