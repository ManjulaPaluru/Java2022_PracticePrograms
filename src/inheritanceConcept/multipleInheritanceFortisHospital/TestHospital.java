package inheritanceConcept.multipleInheritanceFortisHospital;

public class TestHospital{
    public static void main(String[] args) {
        FortisHospital fh= new FortisHospital();

        fh.cardioServices();
        fh.physioServices();
        fh.emergencyServices();
        fh.optServices();//FH individual method


        //object is creating for only classes not for interfaces
        //top casting
        //child class object can be referred by parent class interface reference variable, here we cant access the individual methods of
        //FH hospitals

        //down casting  is not possible
        UKMedical ukmedical=new FortisHospital();
        ukmedical.entServices();
        ukmedical.emergencyServices();
        ukmedical.transplantServices();
        System.out.println(ukmedical.min_free);
        //FH is also implementing the static method which is available in parent interface, this is not called overriding
        //it s called method hiding, with class name we can access the  static methods .


        //accessing static and default methods
        FortisHospital.billing();
        UKMedical.billing();
        int num = fh.getPaticentNumber("manjula");
        System.out.println("paticent number is " + num);
// overriding and inheriting the parent class methods
        fh.medicalEquement();
        fh.medicalStudy();

        fh.covid19Reserch();
        fh.covid19Vacination();
        fh.medicalEquement();






    }


}
