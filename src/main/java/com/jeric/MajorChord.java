package com.jeric;
import java.util.ArrayList;

public class MajorChord extends Chord
{

    private ArrayList<Note> majChord;
    private Note third;
    private Note fifth;
    private String[] NOTE_SEQ = {"A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#"};

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
        third = new Note(NOTE_SEQ[(rootidx + 4) % 12]); 
        fifth = new Note(NOTE_SEQ[(rootidx + 7) % 12]);

        majChord.add(root);
        majChord.add(third);
        majChord.add(fifth);
        return majChord;
    }

    private int findNoteIndex(String note)
    {
        for (int i = 0; i < NOTE_SEQ.length; i++) 
        {
            if (NOTE_SEQ[i].equals(note))
            {return i;}
        }
        return -1; //In the event the note isn't in the list, to be filtered in the getNotes method
    }
    
}
