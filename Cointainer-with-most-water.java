// ## Problem3 (https://leetcode.com/problems/container-with-most-water/)
// You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

// Find two lines that together with the x-axis form a container, such that the container contains the most water.

// Return the maximum amount of water a container can store.

// Notice that you may not slant the container.


//Approach 1: Brute Force
// Time Complexity :O(n2)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :
// In this approach we are using 2 loops and we will maintain a max variable 
class Solution {
    public int maxArea(int[] height) {
        //Base Condition check
        if(height == null || height.length<2){
            return 0;
        }
        int max=0;
        int n=height.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                max=Math.max(max,(Math.min(height[i],height[j])*(j-i)));
            }
        }
        return max;
    }
    
}

// Approach 2: Two pointer approach
// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :
// In this approach we are using 2 pointers left and right and we will maintain a max variable 
// We will calculate max by Math.max(max,Math.min(height[left],height[right])* (right-left));


class Solution {
    public int maxArea(int[] height) {
        //Base condition check
        if(height == null || height.length<2){
            return 0;
        }
        int left=0;
        int right=height.length-1;
        int max=0;
        //While loop 
        while(left < right){
            //At this stage we are calculating new max and then compairing it with previous max and then max will hold the greater value 
            max=Math.max(max,Math.min(height[left],height[right])* (right-left));
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return max;
        
    }
}