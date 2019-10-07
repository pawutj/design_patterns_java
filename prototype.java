
interface cloneable{
    Object clone();
}

abstract class Warrior implements cloneable{
    
    public abstract Warrior clone();

  

}

class WarriorV1 extends Warrior{
    private String value;
    public WarriorV1(){
        value = "WarriorV1";
    }
    public WarriorV1 clone(){
       WarriorV1 t = new WarriorV1();
       t.value = this.value;
       return t;
    }
    
    public void echo(){
        System.out.println("value " + value);
    }

}


class Main{
    public static void main(String args[]){
        WarriorV1 wV1 = new WarriorV1();
        wV1.echo();
        WarriorV1 t= wV1.clone();
        t.echo();
 
    }
}