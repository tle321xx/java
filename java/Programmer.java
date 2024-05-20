public class Programmer extends Employee {
    public void skill(){
        System.out.println("No Skill");
    }

    public void skill(String skill){
        System.out.println("Skill = " + skill);
    }

    public void skill(String skill,String skill2){
        System.out.println("Skill 1 = " + skill + " and Skill 2 = " + skill2);
    }

    public void skill(String...skill){
        for(int i = 0; i < skill.length; i++){
            System.out.println("No. = " + i + ", Skill = "  + skill[i]);
        }
    }

    public void bonus(){
        System.out.println("bonus + 10%");
    }
}
