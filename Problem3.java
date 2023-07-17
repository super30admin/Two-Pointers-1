// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
// Using 2 pointer from starting and the ending of the arr, minimum height is considered and area is 
//calculate by multiplying minimum heigh and the width (difference of indexs)
//max_area is calculated at each run.
class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int a_pointer = 0;
        int b_pointer = height.length-1;
        while(a_pointer < b_pointer){
            int current_area =0;
            if(height[a_pointer] < height[b_pointer]){
                current_area = height[a_pointer] * (b_pointer-a_pointer);
                a_pointer++;
            }else{
                current_area = height[b_pointer] * (b_pointer-a_pointer);
                b_pointer--;
            }
            maxArea = Math.max(maxArea,current_area);
        }
        return maxArea;
    }
}