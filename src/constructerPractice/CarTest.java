package constructerPractice;

public class CarTest {
    public static void main(String[] args) {
        Car c=new Car("Toyota",35000);

        Car c1=new Car("Honda","suv");
        System.out.println(c.wheels);
        System.out.println(c1.wheels);
       // Car c3= new Car("red"); // we are not able to create object because Car constructor have private access specifier
    }
}
