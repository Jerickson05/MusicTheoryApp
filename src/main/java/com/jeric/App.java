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

public class App extends Application implements IContract.View {

    //private static Scene scene;
    //private Chord cMaj = new MajorChord(new Note("C"));
    //private Chord aMin = new MinorChord(new Note("A"));
    //private Scale cMajScale = new MajorScale(new Note("C"));
    //private Scale aMinScale = new MinorScale(new Note("A"));
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
        Button scaleButton = new Button("Create Scale.");
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

// @Override
// public void updateChordOutput(String c) 
// {
//     lbl_output.setText(c);
// }



// @Override
// public void updateScaleOutput(String s) 
// {
    
// }

}
