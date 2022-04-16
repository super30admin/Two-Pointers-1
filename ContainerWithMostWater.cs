// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
//https://leetcode.com/problems/container-with-most-water/submissions/
// 2) Left pointer at 0
// 3) Right pointer at n-1
// 4) So we are exloring container between left and right always
// 5) Take minimum of right and left, multiply with width, get container and update max if it is more than max
// 6) We have move pointer right or left, how to make decision
// 	a. When we move pinter width will decrease, so we will try to move pointer which is lower height
// 	So we can find bigger height
// 	b. If left height < right height, move eft pointer
// 	c. Else, move right pointer
public int MaxArea(int[] height) {
        
    if(height == null || height.Length == 0)
        return 0;
    
    int left = 0;
    int right = height.Length - 1;
    int max = 0;
    
    while(left < right)
    {
        int current = Math.Min(height[left], height[right]) * (right-left);
        max = Math.Max(max, current);
        if(height[left] <= height[right])
            left++;
        else
            right--;
    }
    return max;
}