package Tests;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

public class TaskTwo
    implements Readable{
    Random random = new Random(47);
    private int count;
    private static final char[] symbols = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    TaskTwo(int count) {this.count = count;}

    @Override
    public int read(CharBuffer cb) throws IOException {
        if(count-- == 0)
            return -1;
        for (int i = 0; i < 10; ++i) {
            cb.append(symbols[random.nextInt(symbols.length)]);
        }
        cb.append(" ");
        return symbols.length;
    }

    public static void main(String... args){
        Scanner scanner = new Scanner(new TaskTwo(5));
        while(scanner.hasNext())
            System.out.println(scanner.next());
    }
}
