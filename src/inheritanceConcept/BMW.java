package inheritanceConcept;

public class BMW extends Car{
    @Override
    public void start(){
        System.out.println("BMW start method");
    }

    public void autoParking(){
        System.out.println("BMW auto parking");
    }
    private void price(){
        System.out.println("BMW price");//private methods cant overriden
    }

    public static void speed(){
        System.out.println("BMW speed");//method hiding
    }

}
