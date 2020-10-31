//Container with most water 
//Time Complexity : O(n)

class Solution {
    public int maxArea(int[] height) {
        int low =0; 
        int high = height.length-1;
        int max = 0;
        while(low < high){
            if(height[low] < height[high]){
                max = Math.max(max, height[low]* (high-low));
                low++;
            }else{
                max = Math.max(max, height[high]*(high-low));
                high--;
            }
        }    
        return max;
    }
}