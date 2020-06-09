
//Sort colors
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None


// Your code here along with comments explaining your approach

class Solution {
    public void sortColors(int[] nums) {
       
        int i=0; // boundary for 0
        int j=nums.length-1; // boundary for 2
        int k=0; // current element
        while(k<=j) // traverse till current pointer does not reach the boundary of 2
        {
            if(nums[k] == 0) // if curr element is 0 (to sort zeros)
            {
                   int temp= nums[k]; // swap elements k and i
                   nums[k] = nums[i]; 
                   nums[i] = temp;
                    i++;   // increment both pointers
                    k++;
            }
            
           else if(nums[k] == 2) // if curr element is 2 ( to sort ones)
            {
                   int temp= nums[k]; // swap elements k and j
                   nums[k] = nums[j];
                   nums[j] = temp;
                    j--;    // decrement j
            }
            else
                k++; // if current element is 1, increase k as 1 will automatically be sorted
            
        }
        
    }
    
    
}

//Container with most water
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None


// Your code here along with comments explaining your approach


class Solution {
    public int maxArea(int[] height) {
        int i=0; // left pointer
        int j=height.length-1; // right pointer
        int max = Integer.MIN_VALUE; // to calculate max area found
        while(i<j) // till the two pinters dont cross each other
        {
           int water = Math.min(height[i], height[j]) * (j-i);  // caluclating the area by considering min between the two heights as that would be the amount of water filled
           max = Math.max(max, water); // find max between previous found max and current water area
           if(height[i] <height[j]) // to maximize the area we increase i if it is less than j 
        
        return max;
    }
}