// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach

class Solution {
    public int maxArea(int[] height) {
        if(height==null||height.length==0){
            return 0;
        }
        int n= height.length;
        int left=0;
        int right= n-1;
        int max=0;
        
        while(left<right){
            int width= right -left;
            max= Math.max(max, Math.min(height[left], height[right]) * width);
            if(height[left]< height[right]){
                left++;
            }else{
                right--;
            }
        }
        return max;
    }
}