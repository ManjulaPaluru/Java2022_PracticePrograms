package stringsConcepts;

public class StringConcat {
    public static void main(String[] args) {
        String str1 = "ABC";
        String str2 = "BCD";
        String str3 = "FGD";
        System.out.println(oldApproach(str1, str2, str3));
        System.out.println(useStringBuilder(str1, str2, str3));
        System.out.println(useStringConcat(str1, str2, str3));
        System.out.println(useStringConcat(str2, str1, str3));
    }

    private static String useStringConcat(String str1, String str2, String str3) {
        return str1.concat(str2).concat(str3);
    }

    private static String useStringBuilder(String str1, String str2, String str3) {
        return new StringBuilder(str1).append(str2).append(str3).toString();
    }

    private static String oldApproach(String str1, String str2, String str3) {
        return str1+str2+str3;
    }
}