package constructerPractice;

import java.util.ArrayList;

public class TestUser {
    public static void main(String[] args) {
        User u1=new User();

        ArrayList<String> devicelist1=new ArrayList<String>();
        devicelist1.add("Desktop");
        devicelist1.add("table");
        devicelist1.add("laptop");
        User u2=new User("paluru",38, devicelist1 );

    }
}
