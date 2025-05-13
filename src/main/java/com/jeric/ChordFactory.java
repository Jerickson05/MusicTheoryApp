package com.jeric;

public class ChordFactory {
    private Chord chord;
    public ChordFactory() {}

    public Chord calcChord(String c, String t)
    {
        switch(t) {
            case "Minor":
            chord = new MinorChord(new Note(c));
            break;
            case "Major":
            chord = new MajorChord(new Note(c));
            break;
            default:
            new Error("Not a valid chord type"); //Figure out what error would be best here
            };
        return chord;
    }

}
