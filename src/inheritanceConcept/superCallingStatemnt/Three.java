package inheritanceConcept.superCallingStatemnt;

public class Three extends Two {
    Three(String b){
        super();

        System.out.println("Three constructor");
    }

    public Three() {
        System.out.println("Three default constructor");
    }
}
