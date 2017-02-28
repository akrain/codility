package codility;

/**
 * Created by akhil on 31/1/17.
 */
public class MissingElement {

    public int solution(int[] A) {
        int expectedSum = sumExpected(A.length+1);
        int actualSum = sumActual(A);
        return expectedSum -actualSum;
    }

    private int sumActual(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        return sum;
    }

    private int sumExpected(long n) {
        return new Long(n*(n+1)/2).intValue();
    }
}
