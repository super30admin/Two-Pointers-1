//TC: O(n)
//SC: O(1)

//https://leetcode.com/problems/container-with-most-water
class Solution {
    public int maxArea(int[] height) {
        if(height == null || height.length < 2){
            return 0;
        }

        int n = height.length;
        int low = 0;
        int high = n-1;
        int max = 0;

        while(low < high){
            max = Math.max(max, Math.min(height[low], height[high])*(high-low));
            if(height[low] < height[high]){
                low++;
            }else{
                high--;
            }
        }

        return max;

    }
}
