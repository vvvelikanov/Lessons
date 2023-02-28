package Tests;
interface CanFight {
    void fight();
    void notFight();
}
interface CanSwim {
    void swim();
    void notSwim();
}
interface CanFly {
    void fly();
    void notFly();
}
interface CanClimb extends CanFight, CanSwim, CanFly {
    void climb();
    void notClimb();
}

abstract class ActionCharacter { public void fight() {}}

class Hero extends ActionCharacter
        implements CanClimb {
    public void swim() {}
    public void notSwim(){}
    public void fly() {}
    public void notFly(){}
    public void climb() {}
    public void notClimb(){}

    public void notFight(){}
}
public class Adventure {
    public static void t(CanFight x) {x.fight();}
    public static void u(CanSwim x) { x.swim();}
    public static void v(CanFly x) {x.fly();}
    public static void w(ActionCharacter x) {x.fight();}
    public static void e(CanClimb x) {x.climb();}

    public static void main(String... args){
        Hero h = new Hero();
        e(h);
    }

}

