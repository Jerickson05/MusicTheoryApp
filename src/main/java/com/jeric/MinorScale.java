package com.jeric;

import java.util.ArrayList;

public class MinorScale extends Scale {
    private ArrayList<Note> minScale;

    public MinorScale(Note rootNote) {
        super(rootNote);
        minScale = new ArrayList<>();
    }

    @Override
    public ArrayList<Note> getNotesInScale() 
    {
        minScale.add(getRoot());
        minScale.add(getMaj2());
        minScale.add(getMin3());
        minScale.add(getPerf4());
        minScale.add(getPerf5());
        minScale.add(getMin6());
        minScale.add(getMin7());
        minScale.add(getOctave());
        return minScale;
    }


}
