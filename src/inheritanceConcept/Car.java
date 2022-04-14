package inheritanceConcept;

public class Car {

    public void start(){
        System.out.println("Car====Start Method");
    }

    public void Stop(){
        System.out.println("car===Stop Method");
    }
    public void refuel(){
        System.out.println("Car refuel");
    }
    private void price(){//class to class inheritance we cant override the private methods
        System.out.println("Car price");
    }
    public static void speed()
    {
        System.out.println("Car speed");

    }
}
