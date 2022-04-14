package JavanterviewPrograms;

import java.util.Scanner;

public class CountTheWordsInaString {
    public static void main(String[] args) {
        System.out.println("enter the string");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();//welcome to java
        System.out.println("length of the string :" + s.length());
        int wcount = 1;
        for (int i = 0; i < s.length() - 1; i++) {

            if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' ')) {
                wcount++;
            }
        }
        System.out.println("no of words in the string " + wcount);
    }
}

