import java.util.ArrayList;

public class MethodReturnsMultipleValues {
    public static void main(String[] args) {

        MethodReturnsMultipleValues carlist = new MethodReturnsMultipleValues();
      String[]  caravailability =carlist.carBookingUsingArray("suva");

      for(int i=0;i<caravailability.length;i++) {

          System.out.println(caravailability[i]);
      }
        System.out.println("============= =====================++++++++++++++++");
    //calling carBookingUsingArray methos
      ArrayList<String> caravailabilityArrayList =carlist.carBookingUsingArrayList("mini");
        System.out.println("available option are : " + caravailabilityArrayList);
     // if u want iterate ecach item from the array list use for loop
        for(int j=0;j<caravailabilityArrayList.size();j++){
         System.out.println(caravailabilityArrayList.get(j));
      }
//calling method overloading function "test"

        carlist.test();
        carlist.test(10);
        carlist.test(2,4);
    }
//Method overloading, this is  compile time polymorphism
    public void test(){
        System.out.println("test");
    }
    public void test(int a){
        System.out.println("test with a value" +a);
    }
    public void test(int a, int b){
        System.out.println("test with a and b values "+(a+b));
    }

    /**
     //Method return type is array of string, because this method is returing the multiple values
     //equalsIngonecase method is useful for converting the  upper case to lower case
     @parameter car
     This will return String[]
 */


    public String[] carBookingUsingArray(String car){
        String s[]=new String[2];

        if(car.equalsIgnoreCase("suv")){
            s[0]="rav4";
            s[1]="rangrover";

        }
        else if(car.equalsIgnoreCase("sedan")){
            s[0]="city";
            s[1]="civic";


        }
        else if(car.equalsIgnoreCase("mini")){
            s[0]="cooper";
            s[1]="swift";


        }
        else{
            System.out.println("car type is not available");
        }
        return s;
    }

    //by using ArrayList
    public ArrayList<String> carBookingUsingArrayList(String car){
        ArrayList<String>  s1 = new ArrayList<String>();
        if(car.equalsIgnoreCase("suv")){
            s1.add("rav4");
            s1.add("range rover");

        }
        else if(car.equalsIgnoreCase("mini")){
            s1.add("shift");
            s1.add("cooper");

        }
        else{
            System.out.println("this model car is not available");
        }
        return s1;
    }

}
