package Task11;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random random = new Random();
        Queue<Double> priorityQueue = new PriorityQueue<>();
        for(int i = 0; i < 10; i++)
            priorityQueue.add(random.nextDouble());
        for(int i = 0; i < 10; i++)
            System.out.println(priorityQueue.poll());
    }
}
