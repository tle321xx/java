public class Programmer extends Employee {

    public Programmer(String name, Double salary){
        // ใช้ super เพื่อเรียกใช้ constructor ของแม่;
        super(name, salary);
        System.out.println("Coding Skill");
    }
}
