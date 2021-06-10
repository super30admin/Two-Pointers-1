from typing import List

class Solution:
    def sortColors(self, nums: List[int]) -> List[int]:
        if nums == None or len(nums) == 0:
            return
        left = 0
        mid = 0
        right = len(nums) - 1
        while mid <= right:
            if nums[mid] == 0:
                # self.swap(nums, mid, left)
                nums[mid], nums[left] = nums[left], nums[mid]
                mid += 1
                left += 1
                
            if mid <= right and nums[mid] == 1: 
                mid += 1
            
            if mid <= right and nums[mid] == 2:
                # self.swap(nums, mid, right)
                nums[mid], nums[right] = nums[right], nums[mid]
                right -= 1

        return nums
            
    def swap(self, nums: List[int], i: int, j: int) -> None:
        temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp

obj = Solution()
print(obj.sortColors([2,0,2,1,1,0]))
print(obj.sortColors([2,0,1]))
print(obj.sortColors([0]))

# Time Complexity: O(n)
# Space Complexity: O(1)