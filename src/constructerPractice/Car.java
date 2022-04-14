package constructerPractice;

public class Car {

   String carname;
   int carprice;
   String colour;
   String  Model;
   static final int wheels =4;
   public Car(String name,int price){
       this.carname=name;
       this.carprice=price;
    }
    public Car(String name,String Model){
       this.carname=name;
       this.Model=Model;
    }

    //this constructor is private we can't access through object in another class
    private Car(String colour){
       this.colour=colour;
    }













    public static void main(String[] args) {

    }

}
