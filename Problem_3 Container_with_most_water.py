# // Time Complexity : O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode :Yes
# // Any problem you faced while coding this : No
#
#
# // Your code here along with comments explaining your approach


class Solution:
    def maxArea(self, height: List[int]) -> int:
        maxi=0
        left = 0
        right = len(height)-1
        while(left < right):
            maxi = max(maxi, (right-left) * min(height[left], height[right]))
            if height[left] < height[right]:
                       left += 1
            else:
                       right -= 1
        return maxi