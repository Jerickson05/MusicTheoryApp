import com.jeric.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class ChordTest
{
    @Test
    public void checkMajChord()
    {
        ArrayList<Note> notes = new ArrayList<>();
        Note c, e, g;
        c = new Note("C");
        e = new Note("E");
        g = new Note("G");
        notes.add(c);
        notes.add(e);
        notes.add(g);
        Chord cMaj = new MajorChord(new Note("C"));
        StringBuilder testChord = new StringBuilder();
        StringBuilder expectedChord = new StringBuilder();

        for (Note n : cMaj.getNotesInChord())
        { testChord.append(n.getName() + " "); }
        for ( Note n : notes)
        { expectedChord.append(n.getName() + " "); }

        assertEquals(testChord.toString(), expectedChord.toString());

    }
}
