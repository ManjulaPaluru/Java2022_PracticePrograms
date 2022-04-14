package JavanterviewPrograms;
//Finding Max and Minium no from given array;
public class MaxAndMiniumNumFromArray {
    public static void main(String[] args) {

        maxNumber();
        miniumNumber();

    }
       // finding Maximu number for given array

       public static void maxNumber() {
           int array[] = {2, 56, 12, -234,778, 34, 90, 343534554, 0};
           int max = array[0];
           for (int i = 1; i < array.length; i++) {
               if (array[i] > max) {
                   max = array[i];//56  776
               }
           }
           System.out.println("max value form the given array is: " + max);
       }


       //Finding minimum no from given array
       public static void miniumNumber(){
        int a[]= {2,56,12,0,3,7,34,-12343};
            int minium=a[0];
            for(int i=1;i<a.length;i++){
                if(a[i]<minium){
                    minium=a[i];
                }
            }
               System.out.println("minimum value in the array is: " +minium);
       }
}

