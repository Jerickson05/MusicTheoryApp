package com.jeric;

import java.util.ArrayList;

public class MajorScale extends Scale {
    private ArrayList<Note> majScale;

    public MajorScale(Note rootNote) {
        super(rootNote);
        majScale = new ArrayList<>();
    }

    @Override
    public ArrayList<Note> getNotesInScale() 
    {

        majScale.add(getRoot());
        majScale.add(getMaj2());
        majScale.add(getMaj3());
        majScale.add(getPerf4());
        majScale.add(getPerf5());
        majScale.add(getMaj6());
        majScale.add(getMaj7());
        majScale.add(getOctave());
        return majScale;
    }    
}
