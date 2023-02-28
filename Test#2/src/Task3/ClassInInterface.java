package Task3;

public interface ClassInInterface {
    void  process();
    class Other implements ClassInInterface{
        public static void doOn(){
            new Other().process();
        }

        public void process(){
            System.out.println("processing");
        }

        public static void main(String... args){
            doOn();
        }
    }

}
