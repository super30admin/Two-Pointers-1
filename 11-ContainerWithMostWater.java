/**LC-11
 * Time Complexity : worst case: O(N)
 * Space Complexity : O(1)
 * Did this code successfully run on Leetcode : Yes
 * Any problem you faced while coding this : No
 *
 Algorithm:
 Here, in two Pointer method, we increment or decrement any one of the pointer. This method help reduce the time complexity
 from N^2 to N.
 1. We move the pointer which currently points to the lower height among the two lines pointed by low and high.
 2. By doing this we remove the nested operations from that pointer(the one which we will be moving) to pointer before the other pointer.
 */
package TwoPointers;

public class containerWithMostWater {
        public int maxArea(int[] height) {

            if(height == null || height.length == 0) return 0;

            int low = 0;
            int high = height.length - 1;
            int max = 0;
            while(low < high){

                if(height[low] < height[high]){
                    max = Math.max(max, height[low] * (high - low));
                    low++;
                }

                else{
                    max = Math.max(max, height[high] * (high - low));
                    high--;
                }
            }
            return max;
        }
}
