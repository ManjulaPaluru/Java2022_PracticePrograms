package abstraction.Page;

public class Login1 extends AbstractPage {


    //default constructor
    public Login1(){
       System.out.println("login page====constructor");
    }
     public Login1(int a){
         System.out.println("login page parameterized constructor: " +a);
     }

    @Override
    public void title() {
        System.out.println("Loginpage======title");
    }

    @Override
    public void url() {
        System.out.println("Login page ======url");
    }

    //inherit form parent abstractpage class
    public void timeOut(){
        System.out.println("page timeout is 10 sec");
    }

    //Login page individual method
    public void doLogin(){
        System.out.println(" login page====app login");
    }
    
}
