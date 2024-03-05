package model;

import javafx.scene.control.ListView;

public class Notebook {
    private ListView<Note> notes;

    public Notebook() {
        notes = new ListView<>();
    }

    public void add(Note note) {
        notes.getItems().add(note);
    }

    public void remove(Note note) {
        notes.getItems().remove(note);
    }

    public ListView<Note> getNotes() {
        return notes;
    }
}
