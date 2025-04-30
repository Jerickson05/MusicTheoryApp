import com.jeric.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class ScaleTest {
    @Test
    public void checkMajScale()
    {
        ArrayList<Note> notes = new ArrayList<>();
        Note c, d, e, f, g, a, b;
        a = new Note("A");
        b = new Note("B");
        c = new Note("C");
        d = new Note("D");
        e = new Note("E");
        f = new Note("F");
        g = new Note("G");
        notes.add(c);
        notes.add(d);
        notes.add(e);
        notes.add(f);
        notes.add(g);
        notes.add(a);
        notes.add(b);
        notes.add(c);
        Scale cMaj = new MajorScale(new Note("C"));
        StringBuilder testScale = new StringBuilder();
        StringBuilder expectedScale = new StringBuilder();

        for (Note n : cMaj.getNotesInScale())
        { testScale.append(n.getName() + " "); }
        for ( Note n : notes)
        { expectedScale.append(n.getName() + " "); }

        assertEquals(testScale.toString(), expectedScale.toString());

    }

    @Test
    public void checkMinScale()
    {
        ArrayList<Note> notes = new ArrayList<>();
        Note c, d, e, f, g, a, b;
        a = new Note("A");
        b = new Note("B");
        c = new Note("C");
        d = new Note("D");
        e = new Note("E");
        f = new Note("F");
        g = new Note("G");
        notes.add(a);
        notes.add(b);
        notes.add(c);
        notes.add(d);
        notes.add(e);
        notes.add(f);
        notes.add(g);
        notes.add(a);
        Scale aMin = new MinorScale(new Note("A"));
        StringBuilder testScale = new StringBuilder();
        StringBuilder expectedScale = new StringBuilder();

        for (Note n : aMin.getNotesInScale())
        { testScale.append(n.getName() + " "); }
        for ( Note n : notes)
        { expectedScale.append(n.getName() + " "); }

        assertEquals(testScale.toString(), expectedScale.toString());

    }
}
