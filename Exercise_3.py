# Time Complexity: O(n)
# Space Complexity: O(1)
# Were you able to run the code on Leetcode: Yes
# Any problem you faced while coding this: No

class Solution:
    def maxArea(self, height: List[int]) -> int:
        L = 0
        R = len(height)-1

        max_water = 0

        while (L < R):
            
            # Calculate the current water area between the two pointers
            curr_water= (R-L) * (min(height[L], height[R] ))

            max_water = max(max_water, curr_water)

            # Move the pointer pointing to the shorter height
            # This is because the area is limited by the shorter height
            # So, we try to find a taller height by moving the pointer
            # If the left height is greater than the right height, we move the right pointer
            if height[L] > height[R]:
                R-=1
            else:
                L+=1
                

        return max_water