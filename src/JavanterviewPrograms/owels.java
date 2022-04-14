package JavanterviewPrograms;

import java.util.Locale;

public class owels {
    public static void main(String[] args) {
        String s= "Manjula";
      String  lower = s.toLowerCase();
        int count=0;
        int consonet=0;
        for(int i=0;i<lower.length();i++){
      char ch= lower.charAt(i);
            if (ch == 'a'|| ch=='e'||ch =='i'||ch=='o'||ch=='u') {
              count++;
            }else{
                consonet++;
            }
        }
        System.out.println(++count);
        System.out.println(consonet);
    }
}