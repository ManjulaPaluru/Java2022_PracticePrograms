package JavanterviewPrograms;
//Ascii values
//a-z   98 to 122
//A-Z   65 to 90
//0 -9  48 to 57
public class StringUpperLowerCase
{
  /*  public static void main(String[] args) {
        String s = "THIS is 123 JAVA program";
       String lower = "";
        String upper = "";
        String digitsare="";
        int uCount=0;
        int lCount=0;
        int digits = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 65 && ch <= 90) {
                upper = upper + ch;
                uCount++;
            } else if(ch>=48 && ch<= 57) {
                digitsare =digitsare+ch+ " ";
                digits++;
            }
                else
                lower = lower + ch;
                lCount++;
            }

        System.out.println("uppercase count: " + uCount);
        System.out.println("lower case count:" + lCount);
        System.out.println("digits count: " +digits);
        System.out.println("lower count : " + lCount + "\n" + " lowercase letters: " + lower);
        System.out.println(("upper count:  " + uCount + "\n" + " upper case letters: " + upper));
        System.out.println("digits count: "+digits +"\n" + "digits are: " +digitsare);
    }
*/

    public static void main(String[] args) {

        String s="ThiS is Java 1 ProGraM 456";
        String upper="";
        String lower="";
        String  digits="";
        int uCount=0;
        int lcount=0;
        int dcount=0;

        System.out.println("length of the string: " + s.length());
        for(int i=0; i<s.length();i++) {
            char ch = s.charAt(i);
            if (ch >= 65 && ch <= 90) {
                upper = upper + ch;
                uCount++;
            } else if (ch >= 48 && ch <= 57) {
                digits = digits + ch + " ";
                dcount++;
            } else {
                lower = lower + ch;
                lcount++;
            }
        }
        System.out.println("upper count: " + uCount + "\n" + "upper letters: "+ upper);
        System.out.println("lower count: " + lcount + "\n"+ "lower letters: "+ lower);
        System.out.println("digits count: " + dcount + "\n"+  "digits are: " + digits);
    }














}
