# Runs on leetcode
# Runtime complexity:  O(n)
# Memory Complexity: O(1)

'''
1. Initialized two pointers left at 0 and right at len(nums)-1.

2. Considering left and right as extremes, the area between them is calculated by multiplying distance between left & right with 
   minimum value of nums[left] and nums[right]

3. At each iteration, the present area is compared with past maximum area and the maximum area is updated if required.

4. At each iteration, minimum of nums[left] and nums[right] is retarded as we need the maximum area.
'''

class Solution:
    def maxArea(self, nums):
        if not nums:
            return 0
        area = 0
        left = 0
        right = len(nums)-1
        
        while(left <= right):
            area = max(area, min(nums[left],nums[right]) * (right-left))
            if nums[left] < nums[right]:
                left += 1
            else:
                right -= 1
            
        return area
