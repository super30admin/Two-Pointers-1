//Time complexity: O(N)
//Space Complexity:O(1)
//In this problem, I'll be initializing my left and the right pointer to be equal to 0 and length of the array -1 respectively. I'll also be initializing maxarea to be equal to 0 initially. I'll iterate through the array and update my value of maxarea, if i find any product between the minimum of left and right element with the difference between right and left index. 
//This code was successfullt executed and got accepted in leetcode.

class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int maxarea=0;
        for(int i=0;i<height.length;i++){
            maxarea=Math.max(maxarea,Math.min(height[l],height[r])*(r-l));
            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return maxarea;
    }
}