#Time Complexity : O(n) since we iterate through the height array once
#Space Complexity : O(1) since we are not using any extra space
#Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this :No

#Approach: We use two pointer method (left and right pointers). We calculate the area using these two pointers and compare it with
# the max_area. If the height of left is less than right, we move left pointer by 1. if height of right is less than left, we move
# the right pointer by -1. return max_area


class Solution:
    def maxArea(self, height: List[int]) -> int:
        n = len(height)
        max_area = 0
        l = 0
        r = n-1
        while l < r:
            max_area = max(max_area, min(height[l], height[r])*(r-l))
            if height[l] < height[r]:
                l += 1
            else:
                r -= 1
        return max_area