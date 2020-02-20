'''
Time Complexity :O(n)
Space Complexity: O(1)
Did this code successfully run on Leetcode : Yes
Explanation:
Create 2 pointers with high and low, with low = 0 and high = len(arr)-1
find the height using min(nums[high], mus[low]) and the difference between the indexes as the width
Save this in a variable max and check this max everytime. The movement to left or right would depend on the height of the
bar. If the height [low] > height[high] if true then increase low by 1 else increase high by -1
'''

class Solution:
    def maxArea(self, height: List[int]) -> int:
        max1 = 0
        low = 0
        high = len(height) - 1
        while low < high:
            height1 = min(height[low], height[high])
            width = high - low
            max1 = max(max1, height1 * width)
            if height[low] < height[high]:
                low += 1
            else:
                high -= 1

        return max1
