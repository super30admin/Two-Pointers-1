# // Time Complexity : O(n) 
# // Space Complexity : O(1)   
# // Did this code successfully run on Leetcode : yes
# // Any problem you faced while coding this : yes i was not able to initially think of an approach which will modify it inplace.

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        low = 0
        mid = 0
        high = len(nums) - 1

        while mid <= high:
            if nums[mid] == 0:
                nums[low],nums[mid] = nums[mid],nums[low]
                low += 1
                mid += 1
            elif nums[mid] == 2:
                nums[high],nums[mid] = nums[mid],nums[high]
                high -= 1
            else:
                mid += 1

#     Approach:
#     1. We will use three pointers low, mid and high.
#     2. low will point to the first 0, mid will point to the current element
#     3. high will point to the last.
#     4. We will iterate through the array and if the current element is 0, we
# will swap it with the element at low and increment low and mid.
# 5. If the current element is 2, we will swap it with the element at
# high and decrement high.
# 6. else we will increment mid

         