package inheritanceConcept.multipleInheritance;

public class TestCollege {
    public static void main(String[] args) {
        College c=new College();
        c.englishLaunage();
        c.frenchLanguage();
        c.sancrietLanguage();
        System.out.println( c.getstudentName("medha"));

        System.out.println(c.getStudentNumber(2));

        c.collegeFee();
        c.standradsForColleges();
        c.uniform();
        IndiaCollege.uniform();
         c.cast();

    }


    }
