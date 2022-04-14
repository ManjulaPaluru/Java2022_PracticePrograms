package JavanterviewPrograms;

public class ArrayException {
    public static void main(String[] args) {
        int a[]= new int[5];
        System.out.println(a.length);
        System.out.println(a[0]);
        // default value '0' is the output in static array
        // same case will get IndexOutOfBoundaryException in dynamic array list
    }
}