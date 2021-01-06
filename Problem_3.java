// Time Complexity :O(n^2)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class Solution {
    public int maxArea(int[] height) {
        int maxValue=0;
        int min=0;
        for(int i=0;i<height.length;i++){
            for(int j=i+1;j<height.length;j++){
                min=Math.min(height[i],height[j]);
                if((min*(j-i))>maxValue){
                    maxValue=min*(j-i);
                }
            }
        }
        return maxValue;
    }
}