public class Main {
    public static void main(String[] args) {

        Accounting p1 = new Accounting();


        Accounting p2 = new Accounting();
        p2.bonus();

        Programmer p3 = new Programmer();
        p3.skill("JAVA", "Angular");


        Programmer p4 = new Programmer();
        p4.skill("JAVA", "Angular", "HTML", "CSS");
        p4.bonus();

    }
}
