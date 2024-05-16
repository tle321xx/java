public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setId("1");
        employee1.setName("Title");
        employee1.setSalary(1000.00);
        // employee1.displayEmployee();

        System.out.println(employee1.getName());

        Employee employee2 = new Employee();
        employee2.setId("2");
        employee2.setName("Titl2");
        employee2.setSalary(2000.00);
        // employee2.displayEmployee();

        System.out.println(employee2.getName());
    }
}
