package stringsConcepts;

import java.sql.SQLOutput;

public class StringsPractice {
    public static void main(String[] args) {
        String str= "      My name is Manjula     ";
        System.out.println(str.length());
        System.out.println(str.trim());
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.indexOf("i"));
        System.out.println(str.charAt(3));
        System.out.println(str.charAt(7));
        System.out.println(str.substring(3,7));
        System.out.println(str.contains("name"));//return true or false
        System.out.println(str.contentEquals("is"));//false
        System.out.println(str.replace(" ",""));//replacing the spaces

        String s="apple";
        String s1="Apple";

        System.out.println(s.equals(s1));//false
        System.out.println(s.equalsIgnoreCase(s1));//true ignoring the difference between lower and upper case

        String s2="apple";
        System.out.println(s==s2);//true not a good practice using equals method is best practice
//fetching  dynamic content from static array
        String m1="your order is 12345";
        System.out.println(m1.substring(m1.indexOf("is")+3,m1.length()));
        System.out.println(m1.substring(m1.indexOf("your")+5,m1.length()));
        System.out.println(str);
        System.out.println(str.concat("paluru"));
        int a=200;
        int b=300;
        int c=200;
        int d=065;
        System.out.println(d);

        System.out.println((a+b+c));
        System.out.println("ur concatnation answer is: "+ (a+b+c));
    }
}
