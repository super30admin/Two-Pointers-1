class Solution(object):
    def sortColors(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        :time complexity:O(n)
        :space complexity:O(1)
        """
        if nums is None or len(nums)==0:return
        left=0
        current=0
        right = len(nums)-1
        
        while(current<=right):
            if nums[current]==0:
                self.swap(nums, left, current)
                left+=1
                current+=1
            elif nums[current]==2:
                self.swap(nums, right, current)
                right-=1
            else:
                current+=1
    # swap
    def swap(self, nums, i, j):
        temp=nums[i]
        nums[i]=nums[j]
        nums[j]=temp
