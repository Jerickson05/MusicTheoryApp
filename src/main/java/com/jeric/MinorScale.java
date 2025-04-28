package com.jeric;

import java.util.ArrayList;

public class MinorScale extends Scale {
    private ArrayList<Note> minScale;
    private Note majSecond, minThird, 
                 perfFourth, perfFifth,
                 minSixth, minSeventh, 
                 octave; 
    public MinorScale(Note root) {
        super(root);
        minScale = new ArrayList<>();
    }

    @Override
    public ArrayList<Note> getNotesInScale() 
    {
        int rootidx = findNoteIndex(this.root.getName());
        if (rootidx == -1)
        {
            throw new IllegalArgumentException("Not a valid Root Note.");
        }
        majSecond = new Note(NOTE_SEQ[(rootidx + 2) % 12]);
        minThird = new Note(NOTE_SEQ[(rootidx + 3) % 12]); 
        perfFourth = new Note(NOTE_SEQ[(rootidx + 5) % 12]);
        perfFifth = new Note(NOTE_SEQ[(rootidx + 7) % 12]);
        minSixth = new Note(NOTE_SEQ[(rootidx + 8) % 12]);
        minSeventh = new Note(NOTE_SEQ[(rootidx + 10) % 12]);
        octave = new Note(NOTE_SEQ[rootidx]);

        minScale.add(root);
        minScale.add(majSecond);
        minScale.add(minThird);
        minScale.add(perfFourth);
        minScale.add(perfFifth);
        minScale.add(minSixth);
        minScale.add(minSeventh);
        minScale.add(octave);
        return minScale;
    }
    
}
