package encapsulationPractice;
//Encapsulating data members and methods
//1. Private Class or Instance level variables we can't access through object.
//for that we are using encapsulation concept (in that we are accessing the private variable through
// public layer means we are creating set and get parameterized public methods there we are assigning
//local variable to class level variable by using 'this'  keyword
//
public class Employee {

   public  String name;
   public int age;
   private  double  salary;
   private String Occupation;

   public void setSalary(double salary){
       this.salary=salary;
   }
    public double getSalary(){
       return salary;
    }
  public void setOccupation(String Occupation){
       this.Occupation=Occupation;
  }
public String getOccupation(){
       return Occupation;
}

   public static void main(String[] args) {
Employee e1=new Employee();
e1.name="manju";
e1.age=28;
e1.salary=1009;
e1.salary=100;
        System.out.println(e1.name +" " +e1.age +" " +e1.salary);


    }


}
