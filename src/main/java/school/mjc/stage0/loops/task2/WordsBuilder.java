package school.mjc.stage0.loops.task2;

import java.util.Arrays;

public class WordsBuilder {
    public void buildPhrase(char... chars){
        String word="";

        word=word+ Arrays.toString(chars);
        while (word.length()>3){
            System.out.println(word);
        }


    }
}
