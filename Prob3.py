# Time Complexity - O(n)
# Space Complexity - O(1)
# Did this work on Leetcode - Yes
# Explain your logic in few word-
# Intially,since we can't necessarily control the height of my rectangle, but we can control the width, let's use 2 pointers, one at 0th index and then at nth index.
# Then, we can observe that min height of 2 indices will be the limiting factor.
# So, we move the pointer with the lesser height till they cross each other and update the max_area variable.

class Solution:
    def maxArea(self, height: List[int]) -> int:
        # Method 1 - Brute Force - Time Complexity - O(n^2), Space Complexity - O(1)
        # max_area=0
        # for left in range(len(height)-1):
        #     for right in range(left+1,len(height)):
        #         width=right-left
        #         max_area=max(max_area,min(height[left],height[right])*width)
        # return max_area

        # Method 2 - 2 Pointer
        max_area=0
        left=0
        right=len(height)-1

        while left<right:
            width=right-left
            if height[left]<=height[right]:
                max_area=max(max_area,height[left]*width)
                left+=1
            else:
                max_area=max(max_area,height[right]*width)
                right-=1
        return max_area
        
