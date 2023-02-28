package Task12;

import java.util.Iterator;

public class NonCollection<T>  {
    private Integer moreInt[] = {1,43,54,10};
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            private int index = 0;
            public boolean hasNext() {
                return index < moreInt.length;
            }
            public Integer next() {
                return moreInt[index++];
            }
            public void remove()
            { // Not implemented
                throw new UnsupportedOperationException();
            }
        };
    }




}