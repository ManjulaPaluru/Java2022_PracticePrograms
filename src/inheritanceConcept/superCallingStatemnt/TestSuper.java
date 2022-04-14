package inheritanceConcept.superCallingStatemnt;

/*
*Rule 1: super calling statement using only in inheritance
        Rule 2: super() can be the first statement in our constructor
        Rule3: user is not writing explicitly super() in constructor by default compiler will create
        Rule 4: it is useful for calling the immediate superclass constructor from the subclass constructor.

        */


public class TestSuper {
    public static void main(String[] args) {

       new Three();
       Three th= new Three("manju");

    }
}
