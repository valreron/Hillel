package lesson12;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class WordCount {
    public static void main(String[] args) {
        String input = "Lol kek cheburek, kek lol Arbidol. Cheburek vge ne takui, kek odun, dva, tru";
        String[] words = input.split(" ");

        Map<String,Integer> wordCountMap = new HashMap<>();

        for(String word : words){

           word=  word.replace(",","").replace(".", "").toLowerCase(Locale.ROOT);

            if (wordCountMap.containsKey(word)) {
                wordCountMap.put(word,wordCountMap.get(word)+1);
            }else {
                wordCountMap.put(word,1);
            }
        }
        System.out.println(wordCountMap);
    }
}
