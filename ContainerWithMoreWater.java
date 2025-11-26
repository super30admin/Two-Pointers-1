// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
class Solution {
    public int maxArea(int[] height) {
        int left =0;
        int right = height.length-1;
        int area = 0;
        while(left<right){
            int length = 0;
            int breadth = right-left;
            if(height[right]<height[left]){
                length = height[right];
                right--;
            }
            else{
                length = height[left];
                left++;
            }
            area = Math.max(area,length*breadth);
        }
        return area;
    }
}
