import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProgramTest {
    private static final Program program = new Program();
    @Test
    void add() {
        assertEquals(-6, program.add(2, -8));
    }

    @Test
    void shouldPass() {
        assertEquals(-6, -6);
    }

}