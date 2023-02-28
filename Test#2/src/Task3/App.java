package Task3;


interface IntApp{
    void process();
    class Other implements Task3.IntApp {

        @Override
        public void process() {
            System.out.println("process");
        }
    }
}
public class App {

    static class Super
    implements IntApp {
        public void process(){}
        static class Other{

        }
    }

    public static IntApp toSuper(){
        return new Super();
    }

    public static void main(String... args){
        //new Other().process();
    }
}
