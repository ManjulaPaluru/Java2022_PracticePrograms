package JavanterviewPrograms;

public class CountDigitsInNumber {

    public static void main(String[] args) {

        digitsCount(2345545);
        digitsCount(333333333);
    }
    public static void digitsCount(int no) {
        int dcount = 0;
        while(no>0){
            no=no/10;
            dcount++;
        }
        System.out.println(dcount);
    }
}
