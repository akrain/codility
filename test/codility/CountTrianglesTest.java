package codility;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Created by akhil on 30/1/17.
 */
public class CountTrianglesTest {

    CountTriangles c = new CountTriangles();


    @Test
    public void emptyArray() {
        assertEquals(0, c.solution(new int[] {}));
    }

    @Test
    public void arrayLessThan3() {
        assertEquals(0, c.solution(new int[] {1,2}));
    }


    @Test
    public void smallArray() {
        assertEquals(1, c.solution(new int[] {3,4,5}));
    }

    @Test
    public void basicArray() {
        assertEquals(4, c.solution(new int[] {10,2,5,1,8,12}));
    }
}
