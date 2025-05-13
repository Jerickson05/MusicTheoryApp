package com.jeric;

public class PentatonicScaleFactory extends ScaleFactory 
{
    private Scale scale;
    
    public PentatonicScaleFactory() {}

    @Override
    public Scale calcScale(String s, String t)
    {
        switch(t) {
            case "Pentatonic Minor":
            scale = new PentaMinorScale(new Note(s));
            break;
            case "Pentatonic Major":
            scale = new PentaMajorScale(new Note(s));
            break;
            default:
            scale = super.calcScale(s, t);
        };
        return scale;
    }
    
}
