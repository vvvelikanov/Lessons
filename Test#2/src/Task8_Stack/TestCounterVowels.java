package Task8_Stack;
import java.util.*;
import java.io.*;
import ClassTextFile.TextFile;

class Words{
    private String word;
    private int count;

    public Words(String word, int count){
        this.word = word;
        this.count = count;
    }
    public int getCount() {
        return count;
    }

    public String getWord() {
        return word;
    }

    @Override
    public String toString() {
        return word + "=" + count;
    }
}

public class TestCounterVowels {
    public static void main(String... args){
        TreeSet<String> set = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
        set.addAll(new TextFile("src\\Task4_GUI\\GreenhouseControls.java", "\\W+"));

        Map<String, Integer> countWord = new LinkedHashMap<>();
        Set<Words> setWords = new LinkedHashSet<>();

        char[] vowels = {'a', 'e', 'i', 'u', 'y', 'o', 'A', 'E', 'I', 'U', 'Y', 'O'};
        //char[] s = set.first().toCharArray();

        while(!set.isEmpty()){
            int counter = 0;
            String element = set.first();
            char[] copyElement = set.first().toCharArray();
            for(int i = 0; i < vowels.length; i++){
                for (int j = 0; j < copyElement.length ; j++){
                    if(vowels[i] == copyElement[j])
                        counter++;
                }
            }
            countWord.put(element, counter);
            setWords.add(new Words(element, counter));

            System.out.println(element + " " + counter);
            set.remove(element);
        }


        System.out.println(countWord);
        System.out.println(setWords);
    }
}
