import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ProgramTest {

    @Test
    public void shouldAddFiles() {
        int result = Program.add(2, -8);
        assertEquals(-6, result);
    }
}