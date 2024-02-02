import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Program {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static int add(int a, int b){
        return a+b;
    }

    @Test
    void add() {
        assertEquals(-6, add(2, -8));
    }

    @Test
    void shouldPass() {
        assertEquals(-6, -6);
    }
}
