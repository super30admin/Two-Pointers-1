// Time Complexity : O (n) 
// Space Complexity : O (1) no extra space
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Minor issues, compared lo and hi instead of height[lo] and height[hi]
public class prob3 {
    
    public static int mostWater(int[] height){
        if(height == null || height.length == 0) return 0;
        int lo = 0; int hi = height.length - 1;
        int maxArea = Integer.MIN_VALUE;
        while(lo < hi){
            maxArea = Math.max(maxArea, (hi - lo) * Math.min(height[lo], height[hi]));
            if(height[lo] < height[hi]) lo++;
            else hi--;
            
        }
        return maxArea;
    }

    
    public static void main(String[] args) {
        
    }
}
