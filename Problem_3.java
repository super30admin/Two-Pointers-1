// Time Complexity : O(n) , n = length of array height
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

public class Problem_3 {
	
	public int maxArea(int[] height) {
        int low = 0, high = height.length - 1;
        int max = 0;
        while(low < high){
            int area = Math.min(height[low], height[high]) * (high - low);
            max = Math.max(max, area);
            if(height[low] < height[high]){
                low++;
            }else{
                high--;
            }
        }
        return max;
    }
}
