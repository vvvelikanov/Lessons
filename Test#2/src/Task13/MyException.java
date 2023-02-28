package Task13;
import Task6.Gerbil;


class SimpleException extends Exception{
    String str;
    public SimpleException(String str){
        super(str);
        this.str = str;
    }
    public SimpleException(){}
    public void Print(){
        System.out.println(this.str);
    }
}


public class MyException {
    public static void main(String[] args){
        int i = 0;

        while(i++<5){
            try{
                throw new Exception();
            }
            catch (Exception e){
                System.out.println("!");
            }
        }
        System.out.println("enough exceptions");
    }
}
