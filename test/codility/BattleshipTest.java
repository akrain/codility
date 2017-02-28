package codility;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Created by akhil on 1/2/17.
 */
public class BattleshipTest {
    Battleship p = new Battleship();

    @Test
    public void checkZero() {
        assertEquals("", p.solution(12, "1A 2A,12A 12A,4A 5B,7E 9E", "12A"));
    }

}
