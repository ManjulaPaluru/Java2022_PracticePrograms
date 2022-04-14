public class TestCar {
    public static void main(String[] args) {
       /* Car carmain=new Car();
        System.out.println("one class non static method is calling from another class ex:- Car and TestCar");
        carmain.car1("Rav4",40000);*/

        System.out.println("first main method ");


        TestCar tc=new TestCar();
        tc.main();
        tc.main(10);
    }

    public  void main() {
        System.out.println("method overloading");
    }
    public void main(int a){
        System.out.println("print a value"+a);
    }
}
