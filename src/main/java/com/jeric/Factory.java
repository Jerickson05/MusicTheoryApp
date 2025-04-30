package com.jeric;

public class Factory 
{
    private Scale scale;
    private Chord chord;
    public Factory() {}

    public Scale calcScale(String s, String t)
    {
        switch(t) {
            case "Minor":
            scale = new MinorScale(new Note(s));
            break;
            case "Major":
            scale = new MajorScale(new Note(s));
            break;
            default:
            new Error("Not a valid scale type"); //figure out what error would be best here
            };
        return scale;
    }

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
