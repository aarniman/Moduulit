package controller;

import model.Dictionary;
import view.DictionaryView;

public class DictionaryController {

    private DictionaryView gui;

    private Dictionary dict = new Dictionary();

    public DictionaryController(DictionaryView gui){
        this.gui = gui;
    }

    public String search(String word){
        return dict.getDescription(word);
    }

    public void add(String word, String d){
        dict.addPair(word, d);
    }

    public static void main(String[] args) {
        DictionaryView.launch(DictionaryView.class);
    }

}
