package constructerPractice;

import java.util.Arrays;

public class UserMethod {
    String name;
    int age;
    String  devicelist;

    public void user1(String name, int age, String devicelist){
        System.out.println(this.name=name);
        System.out.println(this.age=age);
        System.out.println(this.devicelist=devicelist);
    }



    public static void main(String[] args) {

        String[] dlist= new String[5];
        dlist[0]="table";
        dlist[1]="chair";
        dlist[2]="desktop";
        //System.out.println(dlist); if we print array object directly we will ge junk letters as a output. for that we need to
        //iterate the array or need to use Arrays.toString();
        String list= Arrays.toString(dlist);
        UserMethod deviceList=new UserMethod();
        deviceList.user1("manju",34, list);

        //System.out.println(Arrays.toString());

    }
}
