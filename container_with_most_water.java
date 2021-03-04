// Time Complexity : O(n^2) for first approach, O(n) for second approach
// Space Complexity : O(1) for both approaches
// Did this code successfully run on Leetcode : Approach 1 didn't run. Time limit exceeded. Approach 2 ran successfully
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
---------------------------------------------------------------- Approach 1 -----------------------------------------------------------
  //Brute-Force
class Solution {
    public int maxArea(int[] height) {
        if(height==null || height.length==0) return 0;
        int max=0;
        for(int i=0;i<height.length-1;i++){
            for(int j=i+1;j<height.length;j++){
                max = Math.max(max,Math.min(height[i],height[j])*(j-i));
            }
        }
        return max;
    }
}

------------------------------------------------------------- Approach 2 -----------------------------------------------------------------
 class Solution {
    public int maxArea(int[] height) {
        //Basic checking
        if(height==null || height.length==0) return 0;
        
        int low=0; int high = height.length-1;
        int max=0;
        //Binary search approach
        //At every point we move away from the lower height to increase our chances of                  maximizing the area
        while(low<=high){
           //Area should be calculated as prouduct of min between two heights and diff b/w indices
           max = Math.max(max,Math.min(height[low],height[high])*(high-low));
           //If high is less, move away from high;
           if(height[low]>height[high]){
               high--;
           }
           else{
               low++;
           }
        }
        return max;
    }
}
