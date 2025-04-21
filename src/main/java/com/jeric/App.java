package com.jeric;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {

    private static Scene scene;
    private Chord cMaj = new MajorChord(new Note("C"));
    private Chord aMin = new MinorChord(new Note("A"));

    @Override
    public void start(Stage stage) throws IOException {

        for (Note n : cMaj.getNotesInChord())
        {
            System.out.println(n.getName());
        }
        for (Note n : aMin.getNotesInChord())
        {
            System.out.println(n.getName());
        }

        stage.setScene(scene);
        stage.show();
    }



    public static void main(String[] args) {
        launch();
    }

}
