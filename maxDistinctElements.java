import java.util.*;

class Solution {
    public int maxDistinctElements(int[] nums, int k) {
        Arrays.sort(nums);
        long curr = Long.MIN_VALUE;
        int count = 0;

        for (int num : nums) {
            long start = (long) num - k;
            long end = (long) num + k;

            if (curr < start) curr = start;  // jump to start of range
            if (curr <= end) {
                count++;
                curr++;  // assign and move to next possible number
            }
        }

        return count;
    }
}
