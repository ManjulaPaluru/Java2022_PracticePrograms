package abstraction.Page;

public class Home extends AbstractPage {


    //override methods from parent Abstract class
    @Override
    public void title() {
        System.out.println("Homepage======title");
    }

    @Override
    public void url() {
        System.out.println("Home page =======url");
    }


    //WE cant overirde or inherit the final method from parent abstract class
   // public final void logo(){
    //    System.out.println("page logo");
   // }




    //override  NON-Abstract  method from the abstract parent class
@Override
    public void timeOut(){
        System.out.println("page timeout is 20 sec");
    }




}

