# Time Complexity :O(n)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no


# Your code here along with comments explaining your approach
class Solution(object):
    def swap(self,nums,i,j):
        temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp
    def sortColors(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        low = 0
        mid = 0
        high = len(nums)-1
        #loop until mid passes high
        while mid <= high:
            #if == 0 swap with low increase mid and low
            if nums[mid] == 0:
                self.swap(nums,low,mid)
                low +=1
                mid+=1
            # if ==1 this is the right thing just go to next position increase mid
            elif nums[mid] == 1:
                mid +=1
            else:
                #if == 2 replace with high and decrease only high
                self.swap(nums,high,mid)
                high -=1