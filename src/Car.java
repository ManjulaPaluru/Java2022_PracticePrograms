public class Car {
    String car;
    int  price;
    String colour;
     static final int wheels=4;
    // Method overloading

    public void car1(String name, int Price){
        car2("red");
        System.out.println("car1");
       // car2("red");
    }
    public void car2(String colour){
        car3("BMW",445000,"Green");
        System.out.println("car2");

    }
    public static void  car3(String name, int price,String colour){
        System.out.println("car3");
    }

    public static void main(String[] args) {
     Car car=new Car();
     car.car1("toyoto",23000);
    // car.car2("RED");
     //   System.out.println("wheels of the car" +car.wheels);
    // car3("BMW",200020,"Blue");
    }

}
