
interface cloneable{
    Object clone();
}

abstract class Warrior implements cloneable{
    String value;
    public abstract Warrior clone();

    public void echo(){
        System.out.println("value " + value);
    }

}

class WarriorV1 extends Warrior{

    public WarriorV1(){
        value = "WarriorV1";
    }
    public WarriorV1 clone(){
       WarriorV1 t = new WarriorV1();
       t.value = this.value;
       return t;
    }
    
}


class Main{
    public static void main(String args[]){
        WarriorV1 wV1 = new WarriorV1();
        wV1.echo();
        wV1.value = "WarriorV1Clone";
        WarriorV1 t= wV1.clone();
        t.echo();
 
    }
}