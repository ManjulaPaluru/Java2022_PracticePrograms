package JavanterviewPrograms;

public class CountEvenOddDigitsInNumber {
    public static void main(String[] args) {

        evenAndOddDigitsInNumber(123445);
        evenAndOddDigitsInNumber(123);
        evenAndOddDigitsInNumber(44442456);
        evenAndOddDigitsInNumber(78);
        evenAndOddDigitsInNumber(100030);
        evenAndOddDigitsInNumber(234);
    }

    public static void evenAndOddDigitsInNumber(int no) {
        int evencount = 0;
        int oddcount = 0;
        int number;
        while(no>0) {
            no = no / 10;
            if(no%2==0){
               evencount++;
            } else if(no%2!=0){
                oddcount++;
            }
        }
        System.out.println("evencount: " +evencount);

        System.out.println("oddcount: " +oddcount);
    }
}