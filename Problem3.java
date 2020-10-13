// Time Complexity :O(n) - traversing the array only once
// Space Complexity :O(1) - not using extra space
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach

class Solution {
    /** We use two pointers-  one from the start, one from the end and keep calculating
     *  area between the two heights. We change pointers based on which has minimum height
     *  of the two and move forward accordingly. **/
    public int maxArea(int[] height) {
        if(height==null || height.length<=1){
            return 0;
        }
        int left=0;
        int right=height.length-1;

        int max_area = -1;
        int current_area;
        while(left<right){
            current_area = Math.min(height[left],height[right])*(right-left);

            if(current_area>max_area){
                max_area = current_area;
            }

            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }

        }return max_area;
    }
}