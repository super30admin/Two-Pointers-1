// space complexity - o(1)
    //time - o(n)
    //Ran on Leetcode successfully : Yes
    // Problem faced  : No
    //Approach : Use two pinter Approach from left and right, for current left and right water stored will be less of nums[left/rifgt]*right-left
    // whichever left or right is smaller , move it t the other direction until you come acroos the opposite side being smaller.
class Solution {
    public int maxArea(int[] height) {

        int res = Integer.MIN_VALUE;

        int start = 0 ;
        int end = height.length - 1;

        while(start < end){

            if(height[start] < height[end]){
                res = Math.max(res, height[start]*(end - start));
                start++;
            }
            else{
                res = Math.max(res, height[end]*(end - start));
                end--;
            }

        }
        return res;
    }
}
