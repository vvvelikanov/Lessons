package Tests;

import java.util.ArrayList;
import java.util.Iterator;

//page 290 Ekkel
interface Selector {
    boolean end();

    Object current();

    void next();
}


public class Sequence {
    private ArrayList<Object> items = new ArrayList<Object>();
    private int next = 0;
    public void add(Object x)
    {
        items.add(x);
    }

    private class SequenceSelector implements Selector {
        private int i = 0;

        Sequence sequence(){
            return Sequence.this;
        }

        public boolean end() {
            return i == items.size();
        }

        public Object current() {
            return items.get(i);
        }

        public void next() {
            if (i < items.size()) i++;
        }

    }

    private class reserveSequenceSelector implements Selector {
        private int i = items.size() - 1;

        Sequence sequence(){
            return Sequence.this;
        }

        public boolean end() {
            return i == -1;
        }

        public Object current() {
            return items.get(i);
        }

        public void next() {if (i > -1) i--;}

    }

    public Selector selector() {
        return new SequenceSelector();
    }

    public Selector reserveSelector(){return new reserveSequenceSelector();}

    public static void main(String... args){
        Sequence sequence = new Sequence();

        for(int i = 0; i < 10; ++i){
            sequence.add(i);
        }
        Selector selector = sequence.selector();
        while(!selector.end()){
            System.out.print(selector.current() + " ");
            selector.next();
        }

        System.out.println("");

        Sequence sequence1 = new Sequence();
        for(int i = 0; i < 10; ++i){
            sequence1.add(i);
        }
        Selector selector1 = sequence.reserveSelector();
        while(!selector1.end()){
            System.out.print(selector1.current() + " ");
            selector1.next();
        }


    }
}
