package stringsConcepts.blocksAccessConcept;


public class ParentClass {
    //static block
    static
    {
        System.out.println("parent static block");
    }

    //Instance block
    {
        System.out.println("parent instance block");
    }
    ParentClass(){
        System.out.println("parent class constructor");
    }

}


class ChildClass extends ParentClass{

    static{
        System.out.println("child class static block");
    }

    ChildClass(){
        System.out.println("child class constructor");
    }

    {
        System.out.println("child class instance block");
    }

    public static void main(String[] args) {
        System.out.println("main method ");
        ChildClass c=new ChildClass();
    }
}

