package com.jeric;

import java.util.ArrayList;

public abstract class Chord 
{
	protected Note root;
	public Chord(Note root)
	{
		this.root = root;
	}

	public abstract ArrayList<Note> getNotesInChord();

}
