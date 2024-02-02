import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProgramTest {
   // private static final Program program = new Program();
    private int aiuto = Program.testicolo;
    @Test
    void add() {
        System.out.println(aiuto);
        assertEquals(-6, Program.add(2, -8));
    }

    @Test
    void add2() {
        assertEquals(-6, Program.add(2, -8));
    }

    @Test
    void shouldPass() {
        assertEquals(-6, -6);
    }

}