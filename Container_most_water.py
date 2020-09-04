// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach: using 2 pointer approach and storing max value



class Solution:
    def maxArea(self, height: List[int]) -> int:
        maxi = 0
        left = 0
        right = len(height)-1
        while left<right:
                maxi = max(maxi, min(height[left],height[right])*(right-left))
                if height[left]<height[right]:
                    left += 1
                else:
                    right -= 1            
        return maxi  
