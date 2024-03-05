package model;

import java.util.HashMap;
import java.util.Locale;

public class Dictionary {
    private final HashMap<String, String> dictionary = new HashMap<>();

    public Dictionary(){
    }

    public void addPair(String word, String description){
        word = word.toLowerCase();
        description = description.toLowerCase();
        dictionary.put(word, description);
    }

    public String getDescription(String word){
        word = word.toLowerCase();
        if(dictionary.containsKey(word)){
            return dictionary.get(word);
        }
        return "N/A";
    }
}
