package JavanterviewPrograms;

import java.util.*;

//Find how many even and odd no is ther in user given range
public class EvenOddCountInGivenRange {
    //Find the even and odd numbers count from the user input range
    public static void main(String[] args) {
        int even = 0;
        int odd = 0;
        System.out.println("Enter the Start range no: ");
        int sc = new Scanner(System.in).nextInt();
        System.out.println("Enter the End range no: ");
        int ed = new Scanner(System.in).nextInt();
        for (int i = sc; i <= ed; i++) {
            if ((i % 2) == 0) {
                even++;
            } else if ((i % 2) != 0) {
                odd++;
            }
        }

        System.out.println("even count" + even);
        System.out.println("odd count" + odd);
    }
}
