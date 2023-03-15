// Time Complexity :O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
 * Keep two pointers low and high. 
 * Multiply the width(high-low) with the minimum between height[low] and height[high]
 * If height[low] is lesser than high, try to maximize the value by moving to next value on the left. 
 * Else reduce right to maximize value. 
 */
class Problem3 {
    public int maxArea(int[] height) {
        int n = height.length; 
        int low = 0; 
        int high = n - 1;
        int temp = 0;
        int max =0;
        while(low < high){
        for(int i =0; i < n; i++){
            temp = (high -low) * Math.min(height[high],height[low]);
            max = Math.max(temp, max);
            if(height[low] == height[high]){
                low++;
                high--;
            }
            else if(height[low]< height[high])  
                low++;
            else 
                high--;
        }
        }
        return max;
    }
}