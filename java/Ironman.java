public class Ironman extends SuperHero {
    
    // สืบทอด abstract
    public void setSkill(String skill){
        System.out.println("skill= "+skill);
    }

     // สืบทอดจาก interface
     public void setWealty(String value){
        System.out.println("How Wealty= "+value);
    };
    public void setMoving(String movement){
        System.out.println("How many speed= "+movement);
    };
}
