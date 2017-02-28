package codility;

import java.util.Arrays;

/**
 * Created by akhil on 30/1/17.
 */
public class CountTriangles {
    public int solution(int[] A) {
        if(A.length < 3)
            return 0;

        return countTriangles(A);
    }

    private int countTriangles(int[] a) {
        int count =0;
        for(int i=0; i < a.length -2; i++) {
            count = count + count2(a[i], Arrays.copyOfRange(a, i+1, a.length));
        }

        return count;
    }

    private int count2(int first, int[] rest) {
        if(rest.length < 2)
            return 0;
        int length = rest.length;
        int count = 0;
        for(int i=0; i<length-1; i++) {
            int second = rest[i];
            count = count + count3(first, second, Arrays.copyOfRange(rest, i+1, rest.length));

        }
        return count;
    }

    private int count3(int first, int second, int[] rest) {
        int count = 0;
        int length = rest.length;
        for(int i=0; i<length; i++) {
            int third = rest[i];
            if(first + second > third && first + third > second && second + third > first) {
                ++count;
            }

        }
        return count;
    }

}
