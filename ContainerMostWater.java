// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

// Your code here along with comments explaining your approach
class Solution {
    public int maxArea(int[] height) {
        
        int n = height.length;
        if(height  == null || n == 0)
            return 0;
        int maxArea = 0;
        int low = 0;
        int high = n -1;
        int area = 0;
        while(low < high){
             area = (high - low )* Math.min( height[low] , height[high]);
            maxArea = Math.max(area,maxArea);
             if(height[low] <  height[high])
                 low++;
            else
                high--;
       
        }
   
        return maxArea;
    }
}