package javaAssignmentsPractice;

public class PrintNumbers{
    public static void main(String[] args) {
        int i=1;
        while(i<=10){
            if(i%10==0){
                break;
            }
            else {
                System.out.println(i);
                i++;
            }
        }
    }
}
