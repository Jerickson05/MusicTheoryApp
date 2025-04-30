package com.jeric;

public interface IContract 

{

    interface Presenter
    {
        void createChord(String n, String t);
        void createScale(String n, String t);
    }
    interface View
    {
        void updateOutput(String out);
    }
    
}
