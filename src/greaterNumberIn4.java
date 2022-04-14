
public class greaterNumberIn4 {
    public static void main(String[] args) {
        int a = 234;
        int b = 345;
        int c = 22;
        int d = 38;
        approachMax4(2, 3, 4, 5);
        max(234, 32, 22, 38);
        max(234, 345, 22, 38);
        max(234, 345, 456, 38);
        max(234, 345, 22, 567);
        maxInThreeNo(2,4,6);
    }
    //Approach 1 for finding greater no in given 4 numbers
    public static void  approachMax4(int a, int b, int c,int d)
        {
    if(a>b && a>c && a>d)
        {
            System.out.println("a is greater value" +a);
        }
        else if(b>c && b>d)
        {
            System.out.println("b is greater value"+b);
        }else if(c>d){
            System.out.println("c is greater value"+c);
        }else{
            System.out.println("d is greater value"+d);
        }

    }
//Approach 2 finding max in given 4 numbers
    public static void max(int a, int b, int c, int d) {
        if (a > b) {
            if (a > c) {
                if (a > d) {
                    System.out.println("a is greater number" + a);
                } else
                    System.out.println("d is greater number" + d);
            } else {
                if (c > d) {
                    System.out.println("c is greater no" + c);
                } else {
                    System.out.println("d id greater" + d);
                }
            }
        } else if (b > c) {
            if (b > d) {
                System.out.println("b id greater value" + b);
            } else {
                System.out.println("d is greater value" + d);

            }
        } else if (c > d) {
            System.out.println("c is greater value" + c);
        } else {
            System.out.println("d is greater value" + d);
        }
    }
        //greater no in given 3 numbers
        public static void maxInThreeNo (int a, int b,int c)
        {
            if (a > b && a > c) {
                System.out.println("a is greater number" + a);
            } else if (b > c) {
                System.out.println("b is greater no" + b);
            } else {
                System.out.println("c is greater value" + c);
            }
        }
    }
