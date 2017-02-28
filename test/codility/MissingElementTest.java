package codility;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Created by akhil on 30/1/17.
 */
public class MissingElementTest {

    MissingElement m = new MissingElement();

    @Test
    public void checkEmpty() {
        assertEquals(1, m.solution(new int[] {}));
    }

    @Test
    public void checkOne() {
        assertEquals(2, m.solution(new int[] {1}));
    }

    @Test
    public void checkMissing1() {
        assertEquals(1, m.solution(new int[] {2,5,3,4}));
    }

    @Test
    public void checkMissingNone() {
        assertEquals(5, m.solution(new int[] {1,3,2,4}));
    }

    @Test
    public void checkMissingLast() {
        assertEquals(3, m.solution(new int[] {1,2,4}));
    }

    @Test
    public void checkSample() {
        assertEquals(4, m.solution(new int[] {2,3,1,5}));
    }

    @Test
    public void checkSample2() {
        assertEquals(6, m.solution(new int[] {2,3,1,5,4,7,8,9,10,11}));
    }

}