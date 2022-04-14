package javarepeatpracticeing;

import java.util.Scanner;

public class VowelConsonot {
    public static void main(String[] args) {
        //a e i e o u
        char ch='b';
      if(ch=='a'||ch=='e' || ch=='i'|| ch=='o' ||ch=='u'){
          System.out.println("given characte is vowel: " +ch);
        }else{
          System.out.println("given char is consonont: " +ch);
      }

      switch(ch){
          case 'a':
          case 'e':
          case 'i':
          case 'o':
          case 'u':
              System.out.println("given character is vowel: " +ch);
              break;
          default:
              System.out.println("given character is consonont: "+ch);
      }



    }
}
