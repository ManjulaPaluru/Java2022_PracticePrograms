package abstraction.Page;

public class TestPageAbstractionClass {
    public static void main(String[] args) {

       //we can't create the object for Abstract class and Interface


        //child class object creation
        Login1 lp=new Login1(10);

        lp.title();//override

        lp.timeOut();//inherit
        lp.url();//override
        lp.logo();//final method from parent abstract class
        lp.doLogin();


        System.out.println("=+++++++++++++= =========");
        Home hm= new Home();
        hm.timeOut();//override
        hm.title();//override
        hm.url();//overide
        hm.logo();//final method , we cant override
        System.out.println("===============");
        //top casting
        AbstractPage ps=new Login1(30);
       ps.logo();//final method
       ps.timeOut();
       ps.url();
       ps.url();

    }










}
