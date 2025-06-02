package com.jeric;

    import java.util.ArrayList;

public class HarmMinorScale extends Scale {
    private ArrayList<Note> harmMinScale;

    public HarmMinorScale(Note rootNote) {
        super(rootNote);
        harmMinScale = new ArrayList<>();
    }

    @Override
    public ArrayList<Note> getNotesInScale()
        {
            harmMinScale.add(getRoot());
            harmMinScale.add(getMaj2());
            harmMinScale.add(getMin3());
            harmMinScale.add(getPerf4());
            harmMinScale.add(getPerf5());
            harmMinScale.add(getMin6());
            harmMinScale.add(getMaj7());
            harmMinScale.add(getOctave());
            return harmMinScale;
        }
}
