/*
 *  Time Complexity: O(N) Where N is the size of height array.
 *  Space Complexity: O(1) Since we do not use any additional space.
 *
 *  Did this code successfully run on Leetcode : Yes
 *  Any problem you faced while coding this : Design the approach to hold the min element.
 *
 *  Explanation: We can use a two pointer approach for this problem. We can initialize the low pointer to 0 and hight to last element in array. Now we compute the volume and update the max volume if we find a greater volume. Now we shift the pointer with the minimum heigth.
 */
class Solution {
    public int maxArea(int[] height) {
        if(height==null || height.length==0) return 0;
        int maxArea=0;
        int low=0, high=height.length-1;
        while(low<high){
            maxArea = Math.max(maxArea,(high-low)*Math.min(height[low],height[high]));
            if(height[high]>height[low]){
                low++;
            }else{
                high--;
            }
        }
        return maxArea;
    }
}
