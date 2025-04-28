package com.jeric;

import java.util.ArrayList;

public class MajorScale extends Scale {
    private ArrayList<Note> majScale;
    private Note majSecond, majThird, 
                 perfFourth, perfFifth,
                 majSixth, majSeventh, 
                 octave; 

    public MajorScale(Note root) {
        super(root);
        majScale = new ArrayList<>();
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
        majThird = new Note(NOTE_SEQ[(rootidx + 4) % 12]); 
        perfFourth = new Note(NOTE_SEQ[(rootidx + 5) % 12]);
        perfFifth = new Note(NOTE_SEQ[(rootidx + 7) % 12]);
        majSixth = new Note(NOTE_SEQ[(rootidx + 9) % 12]);
        majSeventh = new Note(NOTE_SEQ[(rootidx + 11) % 12]);
        octave = new Note(NOTE_SEQ[rootidx]);

        majScale.add(root);
        majScale.add(majSecond);
        majScale.add(majThird);
        majScale.add(perfFourth);
        majScale.add(perfFifth);
        majScale.add(majSixth);
        majScale.add(majSeventh);
        majScale.add(octave);
        return majScale;
    }
    
}
