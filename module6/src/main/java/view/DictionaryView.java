package view;

import controller.DictionaryController;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DictionaryView extends Application {
    private TextField word, description;
    private Button search, add;
    private Label label;
    DictionaryController controller;

    public void start(Stage stage){
        word = new TextField();
        description = new TextField();
        search = new Button("Search");
        add = new Button("Add new pair");
        label = new Label();

        FlowPane top = new FlowPane();
        FlowPane bottom = new FlowPane();

        VBox vbox = new VBox();

        stage.setTitle("Dictionary");

        Insets insets = new Insets(10, 10, 10, 10);
        top.setMargin(word, insets);
        top.setMargin(description, insets);
        top.setMargin(search, insets);
        top.setMargin(add, insets);
        bottom.setMargin(label, insets);

        top.getChildren().add(word);
        top.getChildren().add(description);
        top.getChildren().add(search);
        top.getChildren().add(add);
        bottom.getChildren().add(label);
        vbox.getChildren().add(top);
        vbox.getChildren().add(bottom);

        Scene scene = new Scene(vbox);
        stage.setScene(scene);
        stage.show();

        search.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                try {
                    String wor = word.getText();
                    String result = controller.search(wor);
                    label.setText(result);
                } catch (Exception e){
                    label.setText("Not found.");
                }
            }
        });

        add.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                try {
                    String w = word.getText();
                    String d = description.getText();
                    controller.add(w, d);
                    label.setText("Word added");
                } catch (Exception e){
                    label.setText("Error " + e);
                }
            }
        });
    }

    public void init(){
        controller = new DictionaryController(this);
    }



}
