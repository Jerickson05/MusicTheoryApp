package com.jeric;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {

    private static Scene scene;
    private Chord cMaj = new MajorChord(new Note("C"));
    private Chord aMin = new MinorChord(new Note("A"));
    private Scale cMajScale = new MajorScale(new Note("C"));
    private Scale aMinScale = new MinorScale(new Note("A"));

    @Override
    public void start(Stage stage) throws IOException {

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
    

        stage.setScene(scene);
        stage.show();
    }



    public static void main(String[] args) {
        launch();
    }

}
