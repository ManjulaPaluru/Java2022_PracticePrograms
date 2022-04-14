package JavanterviewPrograms;

public class ReverseEachWordInString {

    public static void main(String[] args) {
      reserveStringApproach3("selenium java");
        /*String str = "welcome to java";
        reverseWordsInString("malayalam is madam");
        String[] words = str.split(" ");//splitting string into words
        String reverseString = "";
        for (String w : words) {//welcome  to
            System.out.println(w);
            String reverseWord = "";
            for (int i = w.length() - 1; i >= 0; i--) { //welcome  to avaj
                reverseWord = reverseWord + w.charAt(i);
            }
            reverseString = reverseString + reverseWord +" ";//emoclew  ot avaj
        }
        System.out.println(reverseString);*/
    }

    private static void reverseWordsInString(String text) {
        // New Logic
        System.out.println("===========================");
        String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            char[] a = words[i].toCharArray();
            for (int j = 0, k = a.length - 1; j < a.length / 2; j++, k--) {
                if (a[j] != a[k]) {
                    char temp = a[j];
                    a[j] = a[k];
                    a[k] = temp;
                    System.out.printf("Swapped: %d <==> %d\n", j, k);
                }
            }
            words[i] = new String(a);
            System.out.println(a);
        }
        System.out.println(String.join(" ", words));
        System.out.println("===========================");
    }
//
  //Approach 3
   public static void reserveStringApproach3(String text){
       System.out.println("approach 3");
      String[] words =text.split(" ");
      String reverseword="";
      for(String w: words){
          StringBuilder sb=new StringBuilder(w);//convert the string builder object
          sb.reverse();
          reverseword=reverseword+sb.toString()+ " ";
      }
       System.out.println(reverseword);


        }

}

