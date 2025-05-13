package com.jeric;

public class ScaleFactory 
{
    private Scale scale;
    public ScaleFactory() {}

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

    
}
