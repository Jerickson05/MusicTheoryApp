package com.jeric;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {

    private static Scene scene;
    //private Chord cMaj = new MajorChord(new Note("C"));
    //private Chord aMin = new MinorChord(new Note("A"));
    //private Scale cMajScale = new MajorScale(new Note("C"));
    //private Scale aMinScale = new MinorScale(new Note("A"));
    private TextField tf_rootNote;
    private TextField tf_type;
    private Label lbl_chord;
    private Label lbl_scale;
    


    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("Music Theory Application");
        tf_rootNote = new TextField();
        tf_rootNote.setPromptText("Enter root note.");
        tf_type = new TextField();
        tf_type.setPromptText("Enter scale/chord type.");
        Button chordButton = new Button("Create chord");
        chordButton.setOnAction(this::chordButtonPressed);
        Button scaleButton = new Button("Create Scale.");
        scaleButton.setOnAction(this::scaleButtonPressed);
        Label lbl_chordPrompt = new Label("Created chord: ");
        lbl_chord = new Label("");
        Label lbl_scalePromt = new Label("Created scale: ");
        lbl_scale = new Label("");
        

    

        stage.setScene(scene);
        stage.show();
    }



    public static void main(String[] args) {
        launch();
    }

    /*  Return to start to do further testing,
        moved here to keep area clean for GUI code.
    for (Note n : cMaj.getNotesInChord())
    {
        System.out.print(n.getName() + " ");
    }
    System.out.println("");
    for (Note n : aMin.getNotesInChord())
    {
        System.out.print(n.getName() + " ");
    }
    System.out.println("");
    for (Note n : cMajScale.getNotesInScale())
    {
        System.out.print(n.getName() + " ");
    }
    System.out.println("");
    for (Note n : aMinScale.getNotesInScale())
    {
        System.out.print(n.getName() + " ");
    }
    System.out.println("");
    */
    //TODO: Define these.
public void scaleButtonPressed(ActionEvent e) {}
public void chordButtonPressed(ActionEvent e) {}

}
