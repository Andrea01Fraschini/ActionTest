import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProgramTest {
    @Test
    void add() {
        assertEquals(-6, Program.add(2, -8));
    }

}