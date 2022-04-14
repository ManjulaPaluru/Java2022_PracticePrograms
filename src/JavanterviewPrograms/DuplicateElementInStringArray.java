package JavanterviewPrograms;

import java.util.HashSet;

public class DuplicateElementInStringArray {
    public static void main(String[] args) {

        duplicateElementInStringArray1();
        duplicateElementsInStringUsingHashSet();

    }

    public static void duplicateElementInStringArray1() {
        String s1[] = {"test", "java", "test", "c", "c++", "selenium", "java", "JAVA"};

        boolean flag = false;
        int count = 1;
        for (int i = 0; i < s1.length; i++) {
            for (int j = i + 1; j < s1.length; j++) {

                if (s1[i] == s1[j]) {
                    System.out.println("Duplicate elements is:  " + s1[i]);
                    count++;
                    System.out.println(count);
                    flag = true;
                }
            }
             if (flag == false) {
               System.out.println("there is no duplicate values: ");
              }
        }
    }

    public static void duplicateElementsInStringUsingHashSet(){
        System.out.println("++++++++++++++++++++++++++++++++++++");
        String [] s={"java","test","java","selenium"};
         boolean flag=false;
        HashSet<String> hs=new HashSet<String>();
            for(String dup: s){

                if(hs.add(dup)==false){
                    System.out.println("Duplicate element in the string : " +dup);
                    flag=true;
                }
            }
        if(flag==false){
            System.out.println("there is no duplicate values");
        }
    }



}


