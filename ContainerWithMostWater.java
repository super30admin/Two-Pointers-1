// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
/*

This code efficiently solves the Container With Most Water problem using the two-pointer approach.
It initializes two pointers at the leftmost and rightmost indices and calculates the area between them
using the minimum height of the two bars.
To maximize the area, the pointer pointing to the shorter bar moves inward, as increasing the width
 while maintaining a taller bar gives a chance for a larger area.
 The algorithm continues until the two pointers meet, ensuring an O(n) time complexity with O(1) space.
 This greedy approach efficiently finds the maximum water that can be trapped between two lines.
* */
class ContainerWithMostWater {


    public int maxArea(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int max=0;
        while(left<right)
        {
            int area=Math.min(nums[left],nums[right]) * (right - left);
            max=Math.max(area,max);
            if(nums[left]>nums[right])
                right--;
            else
                left++;
        }
        return max;
    }
}