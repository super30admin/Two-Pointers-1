# Time Complexity :
# O(N)

# Space Complexity :  
# O(1)  ,  In place manipulation of the array approach



# Approach:
# ===> Since there are only three numbers in the array, we take three pointers 
#      left, mid and right to ensure the positions of 0s, 1s and 2s are mainitained relatively while sorting.


class Solution(object):
    def sortColors(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        if not nums or len(nums)==0:
            return

        left = 0
        right = len(nums)-1
        mid = 0

        while(mid <= right):
            if nums[mid] == 2:
                self.swap(nums, mid, right)
                right-=1  
            elif nums[mid] == 0:
                self.swap(nums, mid, left)
                left+=1
                mid+=1
            else:
                mid+=1

        return nums


    def swap(self, nums, i, j):
        temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp  