package com.jeric;

public class Note
{
//Might need to abstract this.
//The Concretes would be: Flat, Sharp, Natural (and maybe DblFlat and DblSharp).
//TODO: Figure this out.
private String note;
public Note(String n) 
{
    this.note = n;
}

public String getName() { return note; }



}
