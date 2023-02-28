package Tests;

interface A { public void canA();}

interface B extends A{ public void canB();}

interface C extends A{ public void canC();}

class One implements B, C{
    public void canA() {}
    public void canB() {}
    public void canC() {}
}

public class TaskOne {
    public static void q(A x){x.canA();}
    public static void w(B x){x.canA();}
    public static void e(B x){x.canB();}
    public static void r(C x){x.canA();}
    public static void t(C x){x.canC();}

    public static void main(String... args){
        One one = new One();
        q(one);
        w(one);
        e(one);
        r(one);
        t(one);
    }
}
