public abstract class Chord 
{
	private String name;
	private Note root;
	public Chord(String name,Note root)
	{
		this.name = name;
		this.root = root;
	}

	public abstract ArrayList<Note> calculateChord(Note root);

}
