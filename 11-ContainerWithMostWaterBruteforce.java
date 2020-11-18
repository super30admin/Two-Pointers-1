/**LC-11
 * Time Complexity : worst case: O(N^2)
 * Space Complexity : O(1)
 * Did this code successfully run on Leetcode : Yes
 * Any problem you faced while coding this : No
 *
 Algorithm:

 Simply looping over every container.
 */
package TwoPointers;

public class containerWithMostWaterBruteforce {

    public int maxArea(int[] height) {

        int max = 0;
        for(int i = 0; i < height.length - 1; i++){
            for(int j = i+1; j < height.length; j++){

                max = Math.max(max, Math.min(height[i], height[j]) * (j - i));
            }
        }
        return max;
    }
}
