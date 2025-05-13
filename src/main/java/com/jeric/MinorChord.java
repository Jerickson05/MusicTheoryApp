package com.jeric;

import java.util.ArrayList;

public class MinorChord extends Chord
{
    private ArrayList<Note> minChord;

    public MinorChord(Note rootNote) {
        super(rootNote);
        minChord = new ArrayList<>();
    }

    @Override
    public ArrayList<Note> getNotesInChord() 
    {
        minChord.add(getRoot());
        minChord.add(getMin3());
        minChord.add(getPerf5());
        return minChord;
    }
}


