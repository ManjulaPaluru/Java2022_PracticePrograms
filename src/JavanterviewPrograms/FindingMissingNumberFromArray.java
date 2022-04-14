package JavanterviewPrograms;
//Array should not have any duplicate values
//Array no need to be sorted order
//values should be in range
public class FindingMissingNumberFromArray {
    public static void main(String[] args) {
        int a[]={1,2,3,4,6,7};
        //1+3+4+5+6+7=26
        //1+2+3+4+5+6+7=28
        //28-26=2
        int sum1=0;
        for(int i=0;i<a.length;i++){
            sum1=sum1+a[i];
        }
        System.out.println("sum1: "+ sum1);
    int sum2=0;
    for(int i=1;i<=7;i++){
        sum2=sum2+i;
    }
        System.out.println("sum2: " +sum2);
        System.out.println("missing no is: " +(sum2-sum1));
    }



}
