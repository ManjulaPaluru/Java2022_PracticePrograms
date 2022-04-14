package inheritanceConcept.superCallingStatemnt;

public class Two extends One{
    Two(String name){
        super();
        System.out.println("Two parameterized constructor");
    }



     public Two() {
       System.out.println("two default constructor");
   }
}
