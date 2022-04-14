package stringsConcepts;

public class SplictingString {
    public static void main(String[] args) {
        String s1 = "java abc,testing,manjula";
        String[] str = s1.split(",");//split method will return array of String values
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
        System.out.println("======================");
        for ( String splitstring :str) //Syntax for each loop : (data type variable name: array name)
        {
            System.out.println(splitstring);
        }

        System.out.println(String.join(",",str));
    }

    public static class StringConcatination {
        public static void main(String[] args) {
            int i=10;
            int j=20;
            System.out.println(i+j);//in integer values concatenation is arithmetic operation
          System.out.println("integer values concatenation:    " + (i+j));// concatenation string with integer
            //String Concatenation
            String s="manjula";
            String s1="paluru";
            System.out.println(s+s1);
            System.out.println(i+j+s+s1);//30manjulapaluru
            System.out.println(s+s1+i+j);//manjulapaluru1020
            //asci values for characters
            //a-z 97-122
            //A-Z 65-90
            //0-9 48-57
            char c1='a';
            char c2='b';
            System.out.println(c1+c2);//o/p 195  character concatenation ascii values will consider
            System.out.println(10+20);
            System.out.println(20/10);

            // System.out.println(20/0);//arithmetic exception
            System.out.println(0/20);// output is zero
            System.out.println(5/2);//2
            System.out.println(5.0/2);//2.5
            System.out.println(5/2.0);//2.5
            System.out.println(5.0/2.0);//2.5
            System.out.println(0/2);//0
            System.out.println(0/2.0);//0.0
            System.out.println(2/0.0);//infinity


        }
    }
}