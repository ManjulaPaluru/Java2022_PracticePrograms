

//we can pass Array or ArrayList as parameters to the function or constructor, for that in main method
// before calling the function we need to create object of array or arraylist and need to add the values to arraylist.
//in function arguments list we need to pass the arraylist object.
package constructerPractice;
import java.util.ArrayList;

public class User {
String name;
int age;
ArrayList<String> deviceList;

public  User( String name,int age,ArrayList<String> deviceList){
    System.out.println(this.name=name);
    System.out.println(this.age=age);
    System.out.println(this.deviceList=deviceList);
}
public User()
{
    System.out.println("default constructor");
}

    public static void main(String[] args) {

    ArrayList<String> devicelist1 =new ArrayList<String>();
    devicelist1.add("mac");
    devicelist1.add("i phone");
    devicelist1.add("laptop");

    User user=new User("manjula",35,devicelist1);

    }
}
