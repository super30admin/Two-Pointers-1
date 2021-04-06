/**Leetcode Question - 11 Container with most water */
/**Algorithm - Two Pointer Approach
 * Take high and low pointer starting from the start and the end of the array
 * Compute the area between them and then increment the low pointer if nums[low]<nums[high]
 * Maintan a max to store the max area and return that at that end
 */
/**TC- O(N)
 * SC- O(1)
 */
public class WaterContainer {
    class Solution {
        public int maxArea(int[] height) {
            int max = Integer.MIN_VALUE;
            int high = height.length-1;
            int low =0;
            int area = 1;
            while(low<high){
                area = Math.min(height[low],height[high])*(high-low);
                max= Math.max(area, max);
                if(height[low]<height[high]){
                    low++;
                }
                else{
                    high--;
                }
            }
            return max;
        }
    }
}
