public class positiveNagetiveNumber {
    public static void main(String[] args) {
      number(-23);
      number(34);
      number(0);
    }
    public static void number(int a){
        if (a>0){
            System.out.println("a is positive number" +a);
        }
        else if (a==0){
            System.out.println("a is positive number"+a);
        }else{
            System.out.println("a is negative " +a);
        }
    }
}
