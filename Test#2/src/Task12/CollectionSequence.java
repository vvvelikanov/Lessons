package Task12;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

public class CollectionSequence implements Collection<Integer> {
    public Integer[] pets = {1,50,1,23,4, 5, 12, 96};
    public int size() { return pets.length; }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            private int index = 0;
            public boolean hasNext() {
            return index < pets.length;
        }
        public Integer next()
        {
            return pets[index++];
        }
        public void remove()
        { // Не реализован
            throw new UnsupportedOperationException();
        }
        };
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }


    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Integer integer) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    public static void main(String[] args){
        CollectionSequence c = new CollectionSequence();
        InterfaceVsIterator.display(c);
        InterfaceVsIterator.display(c.iterator());
    }

}