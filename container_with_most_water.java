// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
// take a left and right pointer and find its capacity, find the min among 
// left and right and if left is min, increase left by 1, if right is min, decrease it by one
// return maxsum
class Solution {
    public int maxArea(int[] height) {
        int left =0;
        int right= height.length-1;
        int maxsum = 0;
        while(left<right){
            maxsum= Math.max(maxsum,(right-left)*Math.min(height[left],height[right]));
            if(height[left]<=height[right]){
                left+=1;
            }
            else{
                right-=1;
            }

        }
        return maxsum;
    }
}