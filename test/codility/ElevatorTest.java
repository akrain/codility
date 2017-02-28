package codility;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by akhil on 1/2/17.
 */
public class ElevatorTest {

    Elevator p = new Elevator();

    @Test
    public void checkZero() {
        assertEquals(0, p.solution(new int[] {}, new int[] {}, 0, 0, 0));
    }

    @Test
    public void checkBasic() {
        assertEquals(5, p.solution(new int[] {60, 80, 40}, new int[] {2,3,5}, 5, 2, 200));
    }

    @Test
    public void checkBasic2() {
        assertEquals(6, p.solution(new int[] {40, 40, 100, 80, 20}, new int[] {3,3,2,2,3}, 3, 5, 200));
    }

    @Test
    public void checkExactCap() {
        assertEquals(2, p.solution(new int[] {40, 40, 100, 80, 20}, new int[] {3,3,3,3,3}, 3, 5, 280));
    }

    @Test
    public void checkBigWeight() {
        assertEquals(10, p.solution(new int[] {1000000000, 999999999, 999999999, 999999999, 999999999}, new int[] {3,3,2,2,3}, 3, 5, 1000000000));
    }

}
