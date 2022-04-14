package JavanterviewPrograms;

public class Palindrome {
    public static void main(String[] args) {

        palindromeTest("madam");
        palindromeTest("manjula");
        palindromeTest("2332");
    }

    public static void palindromeTest(String str) {
        //String str = "manjula";
        System.out.println("length of the string: " + str.length());
        int i = 0;
        int j = str.length() - 1;
        if (str.charAt(i) == str.charAt(j)) {
            i++;
            j--;
            System.out.println( str +"  is a palindrome");
        } else {
            System.out.println("given string "+str +" is not a palindrome");
        }
    }
}