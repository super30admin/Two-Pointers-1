# Time Complexity: O(n) where n is the number of heights
# Space Complexity: O(1) - only two pointers used
# Did this code run on Leetcode: YES
# Any issues: No

from typing import List

class Solution:

    def maxArea(self, height: List[int]) -> int:


        max_water = 0
        l = 0
        r = len(height) - 1

        while l < r:
            water = min(height[l], height[r]) * (r - l)
            max_water = max(max_water, water)
            if height[l] < height[r]:
                l += 1
            else:
                r -=1

        return max_water
    

        #Naive Approach    
        # max_water = 0

        # n = len(height)

        # for i in range(n):
        #     for j in range(i + 1, n):
        #         water = min(height[i], height[j]) * (j - i)
        #         max_water = max(max_water, water)

        # return max_water



if __name__ == "__main__":
    sol = Solution()

    # Test Case 1
    print(sol.maxArea([1,8,6,2,5,4,8,3,7]))  # Output: 49

    # Test Case 2
    print(sol.maxArea([1,1]))  # Output: 1

    # Additional Test Case
    print(sol.maxArea([4,3,2,1,4]))  # Output: 16