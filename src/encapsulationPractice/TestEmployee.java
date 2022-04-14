package encapsulationPractice;

public class TestEmployee {
    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.name="peter";
        e1.age=23;
        e1.setSalary(2000);
        System.out.println(e1.getSalary());
        e1.setOccupation("Tester");
        System.out.println(e1.getOccupation());
    }
}
