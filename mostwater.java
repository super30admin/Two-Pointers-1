// Time Complexity : o(n)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no




// Your code here along with comments explaining your approach

class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int max =0;
        while(left<right){
            max=Math.max(max,Math.min(height[left],height[right])*(right-left));
            if(height[left]>height[right]){
                right--;
            }else{
                left++;
            }
                
        }
        return max;
    }
}
