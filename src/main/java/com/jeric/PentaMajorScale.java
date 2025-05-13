package com.jeric;

import java.util.ArrayList;

public class PentaMajorScale extends Scale {
private ArrayList<Note> pentaMajScale;
    public PentaMajorScale(Note rootNote) {
        super(rootNote);
        pentaMajScale = new ArrayList<>();
    }

    @Override
    public ArrayList<Note> getNotesInScale() 
    {
        pentaMajScale.add(getRoot());
        pentaMajScale.add(getMaj2());
        pentaMajScale.add(getMaj3());
        pentaMajScale.add(getPerf5());
        pentaMajScale.add(getMaj6());
        pentaMajScale.add(getOctave());
        return pentaMajScale;
    }
}