// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : None


// Your code here along with comments explaining your approach
class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length-1;
        int area = 0;
        while(i<j){
            area = Math.max(area,Math.min(height[i],height[j]) * (j-i));
            if(height[i] < height[j]){
                i++;
                continue;
            }else j--;
        }
        return area;
    }
}
