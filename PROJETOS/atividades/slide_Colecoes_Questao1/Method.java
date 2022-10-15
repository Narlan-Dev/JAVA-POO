package slide_Colecoes_Questao1;
import java.util.Map;
import java.util.HashMap;

public abstract class Method {
    private static int value;
    private static Map<String, Integer> dictionary = new HashMap<>();

    public static void occurrencesWordRating(Phrase phrase){
        dictionary.clear();
        String[] words = phrase.getPhrase().split("\\s+");
        for(int i = 0; i < words.length; i++){
            dictionary.put(words[i], null);
        }
        for(String key : dictionary.keySet()){
            for(int i = 0; i < words.length; i++){
                if(key.equals(words[i])){value++;}
            }
            dictionary.computeIfAbsent(key, s -> value);
            value = 0;
        }
    }
    public static void showWordsOccurrences(){
        if(!dictionary.isEmpty()){
            for(String key : dictionary.keySet()){
                System.out.format("\nWord: %7s        Occurrences: %d", key, dictionary.get(key));
            }
        }else{System.out.println("Undefined phrase!!");}
    }
}
