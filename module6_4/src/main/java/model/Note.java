package model;

import java.util.HashMap;

public class Note {
    private HashMap<String, String> note;

    public Note() {
        note = new HashMap<>();
    }

    public void addNote(String key, String value) {
        note.put(key, value);
    }

    public String getValue(String key) {
        return note.get(key);
    }

    public String getKey(String key){
        if(note.containsKey(key)){
            return key;
        }
        return "";
    }
}
