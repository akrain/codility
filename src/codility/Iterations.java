package codility;

import java.util.Arrays;
import java.util.TreeMap;
import java.util.TreeSet;

class Iterations {
    public int solution(int N) {
        String s = Integer.toBinaryString(N);
        System.out.println(s);
        int gap = 0;
        int maxGap = 0;
        int length = s.length();
        boolean gapStart = false;

        for(int i=0; i< length; i++) {
            char ch = s.charAt(i);
            if(ch == '1') {
                gapStart = true;
                if(gap > maxGap) {
                    maxGap = gap;
                }
                gap = 0;

            } else if(ch == '0' && gapStart) {
                ++gap;
            }
        }

        return maxGap;
    }

    public static void main(String[] args) {
        TreeSet<String> t = new TreeSet<>(Arrays.asList("10C", "9C","10D", "9D"));
        System.out.println(t);
    }
}