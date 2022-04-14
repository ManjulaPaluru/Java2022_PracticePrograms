package inheritanceConcept.multipleInheritanceFortisHospital;

public class FortisHospital extends Medical implements USMedical,UKMedical,IndiaMedical{

    //class is able to  implement the private methods from interface
    //for that we need the pass the private method name into other public class.
    // ex:- 'testing' is  private method and we are passing that method in to 'medicalEquement' method.

    private void testing(){
    System.out.println("FH=== testing");
}


    @Override
    public void medicalEquement() {
        System.out.println("FH===medical equement");
        testing();
    }


    //Fortis hospital have their own Individual methods
    public void optServices(){
        System.out.println("FH=====opt services");
    }


   //Implementing abstract methods from USMedical
    @Override
    public void physioServices() {
        System.out.println("FH======PhysioServices");
    }

    @Override
    public void cardioServices() {
        System.out.println("FH=====CardioServices");
    }


//Implementing abstract methods from UKMedical
    @Override
    public void entServices() {
        System.out.println("FH=====entServices");
    }

    @Override
    public void transplantServices() {
        System.out.println("FH=====transplant services");
    }

    //using static method from the interface is called "Method hiding" , if we want we can use the static method.
    public static void billing(){
        System.out.println("FH=====billing");
    }

    //overriding the default method  from the parent interface UKMedical,
    // need to change access specifier to public instead of default

    @Override
    public void  medicalTraining()
    {
        System.out.println("UK===medical training");
    }


    //Implementing abstract methods from IndiaMedical
    @Override
    public void dentalServices() {
        System.out.println("FH=====dental services");
    }

    @Override
    public void hairCareServices() {
        System.out.println("FH=====hair care services");
    }

    //if 3 of parent interfaces have the same method like emergencyservices() we need to implement only once in child class
    @Override
    public void emergencyServices() {
        System.out.println("FH=======Emergency Services");

    }

    @Override
    public int getPaticentNumber(String name) {
        if (name.equals("manjula")) {
            System.out.print("manjula  ");
            return 100;
        } else if (name.equals("akhil")) {
            return 200;
        }
        else{
            return -1;
        }

    }
//Grandparent 'WHO' methods which are overridden in the grand child 'forthis' hospital
    @Override
    public void covid19Vacination() {
        System.out.println("FH======covid 19 vacination");
    }
    @Override
    public void covid19Reserch(){
        System.out.println("FH====reserch");
    }
}



