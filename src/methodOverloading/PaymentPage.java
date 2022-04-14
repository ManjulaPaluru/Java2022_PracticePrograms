package methodOverloading;

public class PaymentPage {
    public static void main(String[] args) {

        PaymentPage pp=new PaymentPage();
        pp.doPayment("134344");
        pp.searchPage("dresses");

    }

    public void doPayment(String cc,int opt){

    } public void doPayment(String cc,int opt,long phonenumber){

    } public void doPayment(String cc,int opt,String expiredate){

    } public void doPayment(String paypal){
        System.out.println("done payment");
    }




    public void searchPage(){
    }
    public void searchPage(String name){
        System.out.println("searching for dress");
    }
    public void searchPage(String name, int price){
    }
    public void searchPage(String name, int price, String brand){
    }
}


