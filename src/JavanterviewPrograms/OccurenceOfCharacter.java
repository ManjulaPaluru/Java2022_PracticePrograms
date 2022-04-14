package JavanterviewPrograms;

public class OccurenceOfCharacter {
    public static void main(String[] args) {

        //OccurenceOfCharacter constructer = new OccurenceOfCharacter();
        stringConcat();
        stringOccurence();
        patternmethod();
        multiThreee();
    }


    public static void stringOccurence()
    {
        String s = "This is my iphones";
        System.out.println(s.indexOf('i'));
        //System.out.println(s.indexOf('i')+1);
        System.out.println(s.indexOf('i', s.indexOf('i') + 1));
        System.out.println(s.indexOf('i', s.indexOf('i', s.indexOf('i') + 1) + 1));

        System.out.println("========");
        System.out.println(s.indexOf('s'));
        System.out.println(s.indexOf('s', s.indexOf('s') + 1));
        System.out.println(s.indexOf('s', s.indexOf('s', s.indexOf('s') + 1) + 1));

    }

    public static void patternmethod(){
        System.out.println("patter practice");
        for (int i=0;i<=3;i++){
            for(int j=0;j<=3;j++){
                System.out.print(i +"" +j);
                System.out.print(" ");
            }
            System.out.println();
        }

    }
    private OccurenceOfCharacter(String s1){
        System.out.println("private constructor");
   }

    //print the multipication of 3 numbers
    public static void multiThreee(){

        for(int i=1;i<=100;i++){
            if(i % 3==0){
                System.out.println(i);

            }
        }
    }


    public static void stringConcat(){

        String s= new String("test");
        s= s + "Automation";
        System.out.println( s);


    }
}


