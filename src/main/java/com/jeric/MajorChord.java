package com.jeric;
import java.util.ArrayList;

public class MajorChord extends Chord
{

    private ArrayList<Note> majChord;
    private Note majThird;
    private Note perfFifth;

    public MajorChord(Note root) {
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
        majThird = new Note(NOTE_SEQ[(rootidx + 4) % 12]); 
        perfFifth = new Note(NOTE_SEQ[(rootidx + 7) % 12]);

        majChord.add(root);
        majChord.add(majThird);
        majChord.add(perfFifth);
        return majChord;
    }


}
