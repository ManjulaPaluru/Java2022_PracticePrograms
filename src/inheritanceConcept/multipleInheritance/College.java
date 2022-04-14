package inheritanceConcept.multipleInheritance;
public  class College  implements USCollege,UKCollege,IndiaCollege {

//India college
    @Override
    public void sancrietLanguage() {
        System.out.println("college======sancriet language");
    }

    @Override
    public String getStudentNumber(int no) {
        if (no == 1) {
            return "manjula";
        } else {
            System.out.println("please enter the correct student no: ");
        }
  return null;
    }
//uk college
    @Override
    public void frenchLanguage() {
        System.out.println("college=====french language");
    }


    //us college
    @Override
    public void englishLaunage() {
        System.out.println("college====english language");

    }

    @Override
    public int getstudentName(String name) {
        if (name.equals("medha")) {
            System.out.println("student no is: ");
            return 1;
        } else {
            System.out.println("pls enter the correct name, this name is not available in the student list");
           return -1;
        }
    }

    //college individual method
    public void collegeFee(){
      int   collegefee= entrencetest_fee + 100;
        System.out.println(" total college fee is : " +collegefee);
    }
    // grand parent abstract method, grand child class need to be implement (interface unitednationalins)
    @Override
    public void standradsForColleges() {
        System.out.println("college Standards");
    }
    //static class from interface
    //method hiding

    public static void  uniform(){
        System.out.println("College=====uniform");
    }
    private void testprivatemethod(){
        System.out.println("test private method");
    }
    //override the parent interface default method in child class
    public void cast(){
        System.out.println("college===cast");
        testprivatemethod();
    }

}