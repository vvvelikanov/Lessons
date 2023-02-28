package Task8_Stack;

public class App {
    public static void main(String... args){
        String str = "+U+n+c---+e+r+t---+a-+i-+n+t+y---+ -+r+u--+l+e+s---";
        char[] data = str.toCharArray();

        Stack<String> stack = new Stack<String>();
        for (int i = 0; i < str.length();i++){
            if(data[i] == '+'){stack.push(Character.toString(data[i+1]));}
            else if(data[i] == '-'){System.out.print(stack.pop() + " ");}
        }

        System.out.println(stack);
    }
}
