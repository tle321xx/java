class Employee {
    private String name;
    private String id;
    private Double salary;

    public Employee(){
        System.out.println("Initializing a Default Constructor");
    }

    // constructor
    public Employee(String name, Double salary){
        System.out.println("Initializing a Constructor");
        this.name=name;
        this.salary=salary;
        displayEmployee();
    }

    // Setter Methods

    // ถ้าอยากจะกำหนดอะไรก็แล้วแต่ใน attribute ที่เป็น private จะต้องเรียกผ่าน method
    public void setId(String id) {
        // this.attribute ที่ส่งมา
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void displayEmployee() {
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
    }

    // Getter Methods
    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Double getSalary() {
        return this.salary;
    }

}
