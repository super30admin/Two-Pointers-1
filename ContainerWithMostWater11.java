//Time Complexity : O(n)
//Space Complexity: O(1)
class Solution {
    public int maxArea(int[] height) {
        if(height == null || height.length == 0){
            return 0;
        }
        int low =0;
        int high = height.length-1;
        int max = Integer.MIN_VALUE;
        while(low<high){
            if(height[low] < height[high]){
                max = Math.max(max, height[low] * (high-low));
                low++;
            }
            else{
                 max = Math.max(max, height[high]*(high-low));
                 high--;
            }
        }
        return max;
        
    }
}
