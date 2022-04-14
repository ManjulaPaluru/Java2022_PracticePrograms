package inheritanceConcept;

public class TestCar {
    public static void main(String[] args) {
        BMW b=new BMW();
        b.start();//overriding
        b.autoParking();//individual method
        b.refuel();//inheriting
        b.Stop();//inheriting

//Static methods
        BMW.speed();
        Car.speed();

        //parent class object creating
        //we can't access the private methods ,because by nature its private
        System.out.println("+++++++++++++++++++");
        Car c= new Car();
        c.start();
        c.refuel();
        c.Stop();


//child class object can be referred by parent class reference variable
        //top casting
       Car c1= new BMW();
       c1.start();
       c1.Stop();
       c1.refuel();

    }
}
