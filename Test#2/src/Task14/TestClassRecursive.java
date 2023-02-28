package Task14;

import org.jetbrains.annotations.NotNull;

class A{
    private String str;
    public int i;
}

class B extends A{

}

class C extends B{
    protected boolean b;
}

class D extends C{
    public double a;
}

public class TestClassRecursive {
    static void printInfo(@NotNull Class c){
        System.out.println(c.getSimpleName() + "\n" + c.getCanonicalName() + "\n" + c.getDeclaredFields());
        while(c.getSuperclass() != null){
            c = c.getSuperclass();
            System.out.println(c.getSimpleName() + "\n" + c.getCanonicalName() + "\n" + c.getDeclaredFields());
        }
    }

    public static void main(String[] args) {
        int[] n = {3,4,4,5,6};
        int[]n2 = n;
        System.out.println();
//        Class c = null;
//        try {
//            c = Class.forName("Task14.D");
//        }
//        catch (ClassNotFoundException e){
//            System.out.println("error");
//            System.exit(1);
//        }
//        printInfo(c);
    }
}
