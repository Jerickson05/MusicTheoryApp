package com.jeric;

import java.util.ArrayList;

public class PentaMinorScale extends Scale {
private ArrayList<Note> pentaMinScale;
    public PentaMinorScale(Note rootNote) {
        super(rootNote);
        pentaMinScale = new ArrayList<>();
    }

    @Override
    public ArrayList<Note> getNotesInScale() 
    {
       pentaMinScale.add(getRoot());
       pentaMinScale.add(getMin3());
       pentaMinScale.add(getPerf4());
       pentaMinScale.add(getPerf5());
       pentaMinScale.add(getMin7());
       pentaMinScale.add(getOctave());
       return pentaMinScale;
    } 
}