// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

public class Problem3 {
    public int maxArea(int[] height) {

        int low = 0, high = height.length - 1, area = 0;

        while(low < high){
            if(height[low] < height[high]){
                area = Math.max(area, (high-low)*height[low]);
                low++;
            }
            else{
                area = Math.max(area, (high-low)*height[high]);
                high--;
            }
        }
        return area;
        
    }
}
