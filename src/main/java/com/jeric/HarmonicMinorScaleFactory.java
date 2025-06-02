package com.jeric;

public class HarmonicMinorScaleFactory extends PentatonicScaleFactory
{
    private Scale scale;

    public HarmonicMinorScaleFactory() {}

    @Override
    public Scale calcScale(String s, String t)
    {
            switch(t) {
                case "Harmonic Minor":
                    scale = new HarmMinorScale(new Note(s));
                    break;
                default:
                    scale = super.calcScale(s, t);
            };
            return scale;
    }
}
