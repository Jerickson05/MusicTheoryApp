package com.jeric;

import java.util.ArrayList;

public abstract class Chord 
{
	protected String[] NOTE_SEQ = {"A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#"};

	protected Note root;
	public Chord(Note root)
	{
		this.root = root;
	}

	public abstract ArrayList<Note> getNotesInChord();


	protected int findNoteIndex(String note)
    {
        for (int i = 0; i < NOTE_SEQ.length; i++) 
        {
            if (NOTE_SEQ[i].equals(note))
            {return i;}
        }
        return -1; //In the event the note isn't in the list, to be filtered in the getNotes method
    }
    
}
