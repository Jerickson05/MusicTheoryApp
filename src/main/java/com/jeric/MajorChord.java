package com.jeric;
import java.util.ArrayList;

public class MajorChord extends Chord
{
    private ArrayList<Note> majChord;

    public MajorChord(Note rootNote) {
        super(rootNote);
        majChord = new ArrayList<>();
    }

    @Override
    public ArrayList<Note> getNotesInChord() 
    {
        majChord.add(getRoot());
        majChord.add(getMaj3());
        majChord.add(getPerf5());
        return majChord;
    }
}