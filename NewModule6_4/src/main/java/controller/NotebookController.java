package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import model.Note;
import model.Notebook;
import view.NotebookView;

public class NotebookController {

    private Notebook notebook = new Notebook();

    private NotebookView gui;

    @FXML
    private Label titleLabel;

    @FXML
    private Label noteTitleLabel;

    @FXML
    private Label noteLabel;

    @FXML
    private Button addButton;

    @FXML
    private TextField titleTextField;

    @FXML
    private TextArea noteTextArea;

    @FXML
    private void addNote() {
        Note note = new Note();
        note.addNote(titleTextField.getText(), noteTextArea.getText());
        notebook.add(note);
    }

    @FXML
    private void displayNote() {
        Note note = notebook.getNote();
        if (note != null) {
            noteTitleLabel.setText(note.getKey(titleTextField.getText()));
            noteLabel.setText(note.getValue(noteTextArea.getText()));
        }
    }

    public static void main(String[] args) {
        NotebookView.launch(NotebookView.class);
    }
}
