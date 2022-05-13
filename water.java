// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length-1;
        int i=0;
        int j =end;
        int max=0;
        while(start<=end){
            int cur = Math.min(height[start],height[end])*(end-start);
            if(cur>max){
                i=start;
                j=end;
                max=cur;
            }
            if(height[start]<height[end]){
                start++;
            }else{
                end--;
            }
            
        }
        return max;
        
    }
}