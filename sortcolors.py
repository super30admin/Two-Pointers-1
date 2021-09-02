# Time Complexity : O(N), traversisng elements in array
# Space Complexity : O(1),
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no

class Solution(object):
    def sortColors(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        left,right,mid = 0,len(nums)-1,0
        
        while(mid <= right):
            if nums[mid] == 0:
                self.swap(nums,mid,left)
                mid += 1
                left += 1
            elif nums[mid] == 2:
                self.swap(nums, mid, right)
                right -= 1
            else:
                mid += 1
        
    def swap(self, nums, mid , index):
        temp = nums[mid]
        nums[mid] = nums[index]
        nums[index] = temp
        
        