abstract public class SuperHero {
    private String name;
    private String age;
    private String job;

    public void setName(String name) {
        this.name=name;
    }

    public void setAge(String age) {
        this.age=age;
    }

    public void displayHero(){
        System.out.println("this.name= "+this.name + ", age= "+this.age);
    }

    public abstract void setSkill(String skill);
}
