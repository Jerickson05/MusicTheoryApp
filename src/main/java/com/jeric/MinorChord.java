package com.jeric;

import java.util.ArrayList;

public class MinorChord extends Chord
{
private ArrayList<Note> majChord;
private Note minThird;
private Note perfFifth;

public MinorChord(Note root) {
    super(root);
    majChord = new ArrayList<>();
}

@Override
public ArrayList<Note> getNotesInChord() 
{
    int rootidx = findNoteIndex(this.root.getName());
    if (rootidx == -1)
    {
        throw new IllegalArgumentException("Not a valid Root Note.");
    }
    minThird = new Note(NOTE_SEQ[(rootidx + 3) % 12]); 
    perfFifth = new Note(NOTE_SEQ[(rootidx + 7) % 12]);

    majChord.add(root);
    majChord.add(minThird);
    majChord.add(perfFifth);
    return majChord;
}
}


