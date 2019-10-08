//Water tretment factory

class FlocculationSystem{
    public void flocculation(){
        System.out.println("flocculation");
    }
}

class CoagulationSystem{
    public void coagulation(){
        System.out.println("coagulation");
    }
}

class SedimentationSystem{
    public void sedimentation(){
        System.out.println("sedimentation");
    }
}

// focus this class
class Facade{
    public void process(){
        FlocculationSystem p1 = new FlocculationSystem();
        CoagulationSystem p2 = new CoagulationSystem();
        SedimentationSystem p3 = new SedimentationSystem();

        p1.flocculation();
        p2.coagulation();
        p3.sedimentation();

        System.out.println("get treated water 1ea");

    }
}

class Main{
    public static void main(String args[]){
        Facade facade = new Facade();
        facade.process();
 
    }
}