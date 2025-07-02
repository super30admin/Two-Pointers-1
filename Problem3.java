// Time Complexity : O(n) where n is the length of the input array height
//  Space Complexity : O(1) : no extra space used
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No
// Three line explanation of solution in plain english:
//1. We use a two-pointer approach to find the maximum area of water that can be trapped between the heights.
//2. The two pointers start at the beginning and end of the array, and we calculate the area between them.
//3. We move the pointer pointing to the shorter height inward, as this will potentially increase

class Solution {
    public int maxArea(int[] height) {
        int slow=0;
        int h=height.length-1;
        // Initialize the fast pointer to the end of the array
        int fast=h;
        int val=0;
        int maxAmt=0;

        // Use two pointers to find the maximum area    
        while (slow<fast){
            // Calculate the area between the two pointers
            // The area is determined by the shorter height and the distance between the pointers
            val=Math.min(height[fast],height[slow]);
            // Update the maximum area found so far
            maxAmt=Math.max(maxAmt,val*(fast-slow));
            // Move the pointer pointing to the shorter height inward
            // This is because the area is limited by the shorter height, so we try to find a taller height
            if(height[slow]>height[fast]){
                // Move the pointer pointing to the shorter height inward
                fast--;
            }
            // If the height at the slow pointer is less than or equal to the height at the fast pointer,
            // we move the slow pointer inward to potentially find a taller height
            else{
                slow++;
            }
            

        }
        // Return the maximum area found
        return maxAmt;
    }
}