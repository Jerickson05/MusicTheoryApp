package com.jeric;

public class Presenter implements IContract.Presenter
{
 IContract.View view;
 ScaleFactory scaleFactory;
 ChordFactory chordFactory;
 StringBuilder chordOutput;
 StringBuilder scaleOutput;

    public Presenter(IContract.View aView)
    {
        this.view = aView;
        this.scaleFactory = new PentatonicScaleFactory();
        this.chordFactory = new ChordFactory();
    }

    @Override
    public void createChord(String n, String t) 
    {
        chordOutput = new StringBuilder();
        for (Note note : chordFactory.calcChord(n, t).getNotesInChord())
        {
            chordOutput.append(note.getName() + " ");
        }
        view.updateOutput(chordOutput.toString());
    }

    @Override
    public void createScale(String n, String t) 
    {
        scaleOutput = new StringBuilder();
        for (Note note : scaleFactory.calcScale(n, t).getNotesInScale())
        {
            scaleOutput.append(note.getName() + " ");
        }
        view.updateOutput(scaleOutput.toString());
    }
}