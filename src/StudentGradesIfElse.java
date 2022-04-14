public class StudentGradesIfElse {

    public int  studentGrades(int marks) {
        if(marks>100){
            System.out.println("Marks "+marks+ " are exceed more than 100, please given the proper marks for grade");
            return marks;
        }
        else if (marks >= 91 && marks <= 100) {
            System.out.println("grade AA: " + marks);
            return marks;
        } else if (marks >= 81) {
            System.out.println("grade BB: " + marks);
            return marks;
        } else if (marks >= 71) {
            System.out.println("grade CC" + marks);
            return marks;
        } else if (marks >= 61) {
            System.out.println("grade DD: " + marks);
            return marks;
        } else if (marks >= 51 ) {
            System.out.println("grade EE:" + marks);
            return marks;
        } else if (marks >= 35) {
            System.out.println("Pass: " + marks);
            return marks;
        }else if(marks >=0){
            System.out.println("Student" + "got  failed" + marks);
            return marks;
        }else if (marks<0){
            System.out.println("Student got the negative marks: "+marks );
            return marks;
        }
        return marks;
    }



    public static void main(String[] args)
    {
        StudentGradesIfElse grades =new StudentGradesIfElse();
        grades.studentGrades(100);
        grades.studentGrades(10);
        grades.studentGrades(87);
        grades.studentGrades(90);
        grades.studentGrades(0);
        grades.studentGrades(-1);
        grades.studentGrades(190);

    }
}
