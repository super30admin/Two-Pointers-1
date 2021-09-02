#Time complexity - O(N)
#Space complexity - O(1)
#Did this run in leetcode - yes

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        left = 0
        mid = 0
        right = len(nums)-1
        
        while mid<=right:
            if nums[mid] == 0:
                self.swap(nums, mid, left)
                mid += 1
                left += 1
            elif nums[mid] == 2:
                self.swap(nums, mid, right)
                right -= 1
            else:
                mid += 1
                
    def swap(self, nums, mid, index):
        temp = nums[mid]
        nums[mid] = nums[index]
        nums[index] = temp