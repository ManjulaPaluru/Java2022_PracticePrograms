package inheritanceConcept.multipleInheritanceFortisHospital;

public interface UKMedical extends WHO{

    //interface variable by default static  and final nature, once define we cant change the value
    int min_free=100;

    //in abstract method we cant keep static keyword , because in that time it will ask to add method body.
    public  void entServices();
    public void transplantServices();
    public void emergencyServices();
    //we can create abstract method with arguments also
    public int getPaticentNumber(String name);


    //after jdk 1.8  2 changes are added
    // 1.  interface is allowing static method with body.

    public static void billing(){
        System.out.println("billing of UKMedical");
    }

    private void testing(){
        System.out.println("uk===testing");

    }

//2. Interface allowing default  method with body, this default method we can override in child (FH class)class
    // for that in child class we need to change the access specifier to public instead of default

    default  void  medicalTraining()
     {
         System.out.println("UK===medical training");

     }



}
