import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProgramTest {
    private static final Program program = new Program();

    @Test
    void add_SHOULD_FAIL() {
        try{
            throw new RuntimeException("MESSAGGIO");
        }catch (Exception e){

        }

        assertEquals(6, program.add(2, -8));
    }

    @Test
    void add2_SHOULD_PASS() {
        assertEquals(489, program.add(69, 420));
    }

    @Test
    void shouldPass() {
        assertEquals(-6, -6);
    }

}
