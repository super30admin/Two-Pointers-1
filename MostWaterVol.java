/*
Author: Akhilesh Borgaonkar
Problem: LC 11. Container With Most Water (Two-Pointers-1)
Approach: Using two-pointers approach here to find all the possible volumes by scaling the container size with the help of two pointers.
    The left or right pointer with lowest height is incremented or decremented resp for either of the lower heights to collect most of the volume.
Time Complexity: O(n) where n is number of elements in input array
Space complexity: O(1) constant
verified on IDE.
*/

class Solution {
    public int maxArea(int[] height) {
        
        int maxVol = 0, n = height.length;
        int left=0, right=n-1;
        
        while(left<=right){
            int currVol = Math.min(height[left],height[right]) * (right - left);    //finding the current volume
            maxVol = Math.max(maxVol, currVol);     //keep the max volume
            
            if(height[left] < height[right])        //incrementing left pointer if left element has lower height than right element
                left++;
            else
                right--;                            //else decrement right pointer
        }
        
        return maxVol;
    }
}