package JavanterviewPrograms;
//Find out maximum and menium no of the given 3 positive number
public class MaxMinNumberes {
    public static void main(String[] args) {
       // maxMinNumbers(2,6,3);
        maxNumber(34,4,2);
        findMinNumber(1,0,23);
    }

    public static void maxNumber(int a, int b, int c){

        int max=0;

        while(a>0 || b>0 || c>0)
        {
            a--;
            b--;
            c--;
            max++;

        }
        System.out.println(max);

    }

public static void findMinNumber(int a, int b, int c){
        int min=0;
        while(a>0 && b>0 && c>0){
            a--;
            b--;
            c--;
            min++;
        }
    System.out.println(min);
}




    public static void maxMinNumbers(int a, int b, int c){
        if (a>b && a>c){
            System.out.println("a is max " +a);
        }else if (b>a && b>c){
            System.out.println(" b is max" +b);
        }else{
            System.out.println(" c is max" +c );
        }

    }

public static void minNumberIf(int a, int b, int c)
{

    if(a>b || a>c)
    {
        System.out.println(a);
    }
}
}
