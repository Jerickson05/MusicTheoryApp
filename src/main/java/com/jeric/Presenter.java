package com.jeric;

public class Presenter implements IContract.Presenter
{
 IContract.View view;
 Factory factory;
 StringBuilder chordOutput;
 StringBuilder scaleOutput;

    public Presenter(IContract.View aView)
    {
        this.view = aView;
        this.factory = new Factory();
    }

    @Override
    public void createChord(String n, String t) 
    {
        chordOutput = new StringBuilder();
        for (Note note :factory.calcChord(n, t).getNotesInChord())
        {
            chordOutput.append(note.getName() + " ");
        }
        //view.updateChordOutput(chordOutput.toString());
        view.updateOutput(chordOutput.toString());
    }

    @Override
    public void createScale(String n, String t) 
    {
        scaleOutput = new StringBuilder();
        for (Note note :factory.calcScale(n, t).getNotesInScale())
        {
            scaleOutput.append(note.getName() + " ");
        }
        //view.updateScaleOutput(scaleOutput.toString());
        view.updateOutput(scaleOutput.toString());
    }

    
}
