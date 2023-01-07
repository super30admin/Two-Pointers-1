// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
//Approach : In this approach we maintain two pointer and mininum of them gives the length and their diff gives the width. Whichever is smaller
//if left is then we increment left otherwise we decrement right pointer. We calculate the max area from both current and previous and return the answer.
class Solution {
    public int maxArea(int[] height) {
        if(height == null || height.length == 0) return 0;
        int  n = height.length;
        int left=0;
        int right=n-1;
        int result =0;

        // Brute force

        // for(int i =0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(height[i]<height[j]){
        //             result = Math.max(result, height[i]*(j-i));
        //         }else{
        //             result = Math.max(result, height[j]*(j-i));
        //         }
        //     }
        // }
        while(left<right){
            if(height[left]<height[right]){
                result = Math.max(result, height[left]*(right-left));
                left++;            
            }else{
                result = Math.max(result, height[right]*(right-left));
                right--;
            }
        }
        return result;
    }
}