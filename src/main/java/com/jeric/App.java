package com.jeric;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
//TODO: Add JavaDoc
//TODO: make unit tests
public class App extends Application implements IContract.View {

    private TextField tf_rootNote;
    private TextField tf_type;
    private Label lbl_output;
    IContract.Presenter myPresenter;
    
    @Override
    public void start(Stage stage) throws IOException {
        myPresenter = new Presenter(this);
        stage.setTitle("Music Theory Application");
        tf_rootNote = new TextField();
        tf_rootNote.setPromptText("Enter root note.");
        tf_type = new TextField();
        tf_type.setPromptText("Enter scale/chord type.");
        Button chordButton = new Button("Create Chord");
        chordButton.setOnAction(this::chordButtonPressed);
        Button scaleButton = new Button("Create Scale");
        scaleButton.setOnAction(this::scaleButtonPressed);
        lbl_output = new Label("");

        VBox vbox = new VBox(20);
        vbox.setPadding(new Insets(20, 30, 30, 20));
        HBox hbox = new HBox();
        hbox.getChildren().addAll(chordButton, scaleButton);
        vbox.getChildren().addAll(tf_rootNote, tf_type, hbox, lbl_output);

    Scene scene = new Scene(vbox);
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) { launch(); }
        
    public void scaleButtonPressed(ActionEvent e) 
    {
        myPresenter.createScale(tf_rootNote.getText(), tf_type.getText());
    }

    public void chordButtonPressed(ActionEvent e) 
    {
        myPresenter.createChord(tf_rootNote.getText(), tf_type.getText());
    }

    @Override
    public void updateOutput(String out)
    {
        lbl_output.setText(out);
    }

}
