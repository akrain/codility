package codility;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Created by akhil on 30/1/17.
 */
public class IterationsTest {

    @Test
    public void checkZero() {
        Iterations s = new Iterations();
        assertEquals(0, s.solution(0));
    }

    @Test
    public void checkOne() {
        Iterations s = new Iterations();
        assertEquals(0, s.solution(1));
    }

    @Test
    public void checkNine() {
        Iterations s = new Iterations();
        assertEquals(2, s.solution(9));
    }

    @Test
    public void check1041() {
        Iterations s = new Iterations();
        assertEquals(5, s.solution(1041));
    }

    @Test
    public void checkTrailingZeroes() {
        Iterations s = new Iterations();
        assertEquals(2, s.solution(328));
    }

    @Test
    public void check1162() {
        Iterations s = new Iterations();
        assertEquals(3, s.solution(1162));
    }

}