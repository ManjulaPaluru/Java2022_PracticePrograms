package abstraction.Page;

import accessModifier.Car;

public class TruckSubClass extends Car {
    public static void main(String[] args) {
        TruckSubClass tc=new TruckSubClass();
        tc.name="test";
        tc.price=353534;
        tc.test1();
        tc.test4();

    }
}
