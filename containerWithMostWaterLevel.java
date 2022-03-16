// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No 


// Your code here along with comments explaining your approach

class Solution {
    public int maxArea(int[] height) {
        
        int maxa=0;
        int left=0;
        int right=height.length-1;
        while(left<right){
            if(height[left]<height[right]){
                maxa=Math.max(maxa,height[left]*(right-left));
                left++;
            }
            else{
                maxa=Math.max(maxa,height[right]*(right-left));
                right--;
            }
        }
        return maxa;
    }
}