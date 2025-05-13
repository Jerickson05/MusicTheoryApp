package com.jeric;

import java.util.ArrayList;

public abstract class Scale 
{
	protected String[] NOTE_SEQ = {"A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#"};
	
	private Note root, m2, M2, m3, M3, P4, P5, m6, M6, m7, M7, Octave,
                    dim2, Aug1, dim3, Aug2, dim4, Aug3, dim5, Aug4, dim6, 
                    Aug5, dim7, Aug6, dim8, Aug7;

	public Scale(Note rootNote) 
	{
		
        if(findNoteIndex(rootNote.getName()) != -1)
            {
            //Maj, Min, and Perfect intervals                             Semitones from root
            root = new Note(rootNote.getName());                                    // 0
            m2 = new Note(NOTE_SEQ[(findNoteIndex(root.getName()) + 1) % 12]);      // 1
            M2 = new Note(NOTE_SEQ[(findNoteIndex(root.getName()) + 2) % 12]);      // 2
            m3 = new Note(NOTE_SEQ[(findNoteIndex(root.getName()) + 3) % 12]);      // 3
            M3 = new Note(NOTE_SEQ[(findNoteIndex(root.getName()) + 4) % 12]);      // 4
            P4 = new Note(NOTE_SEQ[(findNoteIndex(root.getName()) + 5) % 12]);      // 5
            P5 = new Note(NOTE_SEQ[(findNoteIndex(root.getName()) + 7) % 12]);      // 7
            m6 = new Note(NOTE_SEQ[(findNoteIndex(root.getName()) + 8) % 12]);      // 8
            M6 = new Note(NOTE_SEQ[(findNoteIndex(root.getName()) + 9) % 12]);      // 9
            m7 = new Note(NOTE_SEQ[(findNoteIndex(root.getName()) + 10) % 12]);     // 10
            M7 = new Note(NOTE_SEQ[(findNoteIndex(root.getName()) + 11) % 12]);     // 11
            Octave = new Note(NOTE_SEQ[(findNoteIndex(root.getName()) + 12) % 12]); // 12
            //Dim and Aug intervals                                       Semitones from root
            dim2 = new Note(rootNote.getName());                                    // 0
            Aug1 = new Note(NOTE_SEQ[(findNoteIndex(root.getName()) + 1) % 12]);    // 1
            dim3 = new Note(NOTE_SEQ[(findNoteIndex(root.getName()) + 2) % 12]);    // 2
            Aug2 = new Note(NOTE_SEQ[(findNoteIndex(root.getName()) + 3) % 12]);    // 3   
            dim4 = new Note(NOTE_SEQ[(findNoteIndex(root.getName()) + 4) % 12]);    // 4   
            Aug3 = new Note(NOTE_SEQ[(findNoteIndex(root.getName()) + 5) % 12]);    // 5
            dim5 = new Note(NOTE_SEQ[(findNoteIndex(root.getName()) + 6) % 12]);    // 6
            Aug4 = new Note(NOTE_SEQ[(findNoteIndex(root.getName()) + 6) % 12]);    // 6
            dim6 = new Note(NOTE_SEQ[(findNoteIndex(root.getName()) + 7) % 12]);    // 7
            Aug5 = new Note(NOTE_SEQ[(findNoteIndex(root.getName()) + 8) % 12]);    // 8
            dim7 = new Note(NOTE_SEQ[(findNoteIndex(root.getName()) + 9) % 12]);    // 9
            Aug6 = new Note(NOTE_SEQ[(findNoteIndex(root.getName()) + 10) % 12]);   // 10
            dim8 = new Note(NOTE_SEQ[(findNoteIndex(root.getName()) + 11) % 12]);   // 11
            Aug7 = new Note(NOTE_SEQ[(findNoteIndex(root.getName()) + 12) % 12]);   // 12
            }
        else
            {throw new IllegalArgumentException("Not a valid root note.");}
            
	}

	public abstract ArrayList<Note> getNotesInScale();


	private int findNoteIndex(String note)
	{
		for (int i = 0; i < NOTE_SEQ.length; i++) 
		{
			if (NOTE_SEQ[i].equals(note))
			{return i;}
		}
		return -1; 
	}

	/* Maj, Min, and Perfect Intervals */
    Note getRoot() {return root;}
    Note getMin2() {return m2;}
    Note getMaj2() {return M2;}
    Note getMin3() {return m3;}
    Note getMaj3() {return M3;}
    Note getPerf4() {return P4;}
    Note getPerf5() {return P5;}
    Note getMin6() {return m6;}
    Note getMaj6() {return M6;}
    Note getMin7() {return m7;}
    Note getMaj7() {return M7;}
    Note getOctave() {return Octave;}

    /* Dim and Aug Intervals */
    Note getDim2() {return dim2;}
    Note getAug1() {return Aug1;}
    Note getDim3() {return dim3;}
    Note getAug2() {return Aug2;}
    Note getDim4() {return dim4;}
    Note getAug3() {return Aug3;}
    Note getDim5() {return dim5;}
    Note getAug4() {return Aug4;}
    Note getDim6() {return dim6;}
    Note getAug5() {return Aug5;}
    Note getDim7() {return dim7;}
    Note getAug6() {return Aug6;}
    Note getDim8() {return dim8;}
    Note getAug7() {return Aug7;}
}