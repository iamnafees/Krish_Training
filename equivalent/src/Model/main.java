package Model;

public class main {

    public static void main(String[] args) {
        Employee emp1 = new Employee("E0001", "EC0001", "nafees", "973322249v", "Bammanna");
        Employee emp2 = new Employee("E0002", "EC0002", "althaf", "975466449v", "Kinniya");


        boolean result1 = emp1.equals(emp2);
        System.out.println("Emp1 equals Emp2:" + result1);

        System.out.println("===================================================================");

        emp2.setEmpId("E0001");
        emp2.setEmpCode("EC0001");

        boolean result2 = emp1.equals(emp2);
        System.out.println("Emp1 equals Emp2:" + result2);

    }

}
