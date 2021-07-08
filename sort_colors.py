
#Time Complexity: O(N).
#Auxiliary Space: O(1)
#Did this code successfully run on leetcode :Yes



class Solution(object):
    def swap(self,nums,a,b):
        temp = nums[a]
        nums[a] = nums[b]
        nums[b] = temp 
        
    def sortColors(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        low = 0
        high = len(nums)-1
        mid = 0
        while(mid<=high):
            if nums[mid]==0:
                self.swap(nums,mid,low)
                mid = mid+1
                low = low+1
                
            elif nums[mid]==2:
                self.swap(nums,mid,high)
                high = high-1
            else:
                mid = mid+1
                
        