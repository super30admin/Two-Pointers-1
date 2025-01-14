// Time Complexity : O (n)
// Space Complexity : O (m) (where m is number of colors)
// Did this code successfully run on Leetcode : Yes

/*
* 2 approaches:
* 1. Simply count number of each color and fill accordingly
* 2. Use 3 pointers left, mid, right.
*       When mid = 2 swap with right; right--
*       When mid = 0 swap with left; left++; mid++
*       When mid = 1 mid++;
* */
public class SortColors {
    private static final int NUM_COLORS = 3;
    public void sortColors(int[] nums) {
        int[] colors = new int[NUM_COLORS];
        for(int n: nums) {
            colors[n]++;
        }
        int i = 0;
        for(int j = 0; j < NUM_COLORS; j++) {
            while(colors[j]-- > 0) nums[i++] = j;
        }
    }
}
