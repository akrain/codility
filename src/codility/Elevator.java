package codility;

import java.util.LinkedHashSet;

/**
 * Created by akhil on 1/2/17.
 */
public class Elevator {
    /*A = Weights array
      B = Target floor
      M = No of floors
      X = Max capacity
      Y = Max weight
      */
    public int solution(int[] A, int[] B, int M, int X, int Y) {
        if(A.length != B.length) {
            return 0;
        }
        int ans = solve(A,B,M,X,Y);
        return ans;
    }

    private int solve(int[] weights, int[] targetFloor, int totalFloors, int maxCap, int maxWeight) {
        int length = weights.length;
        int i = 0;
        int stops = 0;
        while(i < length) {
            long groupWeight = 0;
            int cap = 0;

            LinkedHashSet uniqueFloors = new LinkedHashSet();
            while(cap < maxCap && i < length && groupWeight + weights[i] <= maxWeight) {
                groupWeight = groupWeight + weights[i];
                uniqueFloors.add(targetFloor[i]);
                i++;
                cap++;
            }
            stops = stops + uniqueFloors.size() + 1;
        }
        return stops;
    }


}
