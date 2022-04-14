package inheritanceConcept.multipleInheritance;



public interface IndiaCollege extends  UnitedNationalIns{

   int  entrencetest_fee =1000;
public void sancrietLanguage();

public String getStudentNumber(int no);

public static void  uniform(){
    System.out.println("india=====uniform");
}
default void cast() {
    System.out.println("cast");

}
    private void testprivatemethod(){
        System.out.println("test private method");
    }

}


