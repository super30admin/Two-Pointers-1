'''
1. We sort the array in place using 3 pointers left, right and mid. We start with left and mid at 0 and right at n-1
2. We check if the mid element is 2, if yes, we swap it with the right element and decrement right
3. If the mid element is 0, we swap it with the left element and increment left and mid

TC: O(n)
SC: O(1)
'''
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        if nums==None or len(nums) ==0:
            return 

        n = len(nums)

        left = 0
        right = n-1
        mid = 0

        while (mid<=right):

            if nums[mid] == 2:
                nums[mid],nums[right] = nums[right],nums[mid]
                right -= 1
            elif nums[mid] == 0:
                nums[mid],nums[left] = nums[left], nums[mid]
                left += 1
                mid += 1
            else:
                mid += 1