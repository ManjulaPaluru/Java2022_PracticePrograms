package javarepeatpracticeing;

public class WordCount {
    public static void main(String[] args) {
        wordCount();
        wordCountString();
    }

    public static void wordCount() {
        String []s = {"test", "java", "apple", "job"};
        int count = 0;
        for (int i = 0; i < s.length; i++) {
            count++;
        }
        System.out.println("word count in the given string: " +count);
    }

    public static void wordCountString() {
        String s1 = "This is java and selenium program";
        int wcount = 1;
        for (int i = 0; i < s1.length(); i++) {
            if ((s1.charAt(i)==' ') && (s1.charAt(i+1)!=' ')){
                wcount++;
            }
        }
        System.out.println("Word count in the given string: " + wcount);
    }
}