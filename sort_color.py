# Time Complexity : O(n)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : No

# we have three pointers since we have three elements -0,1,2
# one pointer each to collect its respective elements.
# update the values of these three pointers accordingly to sort the array eventually
def swap(nums, i, j):
        temp=nums[i]
        nums[i]=nums[j]
        nums[j]=temp
class Solution(object):
    def sortColors(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        n=len(nums)
        low, mid, high = 0, 0, n-1
        while (mid<=high):
            if(nums[mid]==0):
                swap(nums, mid,low)
                low+=1
                mid+=1
            elif(nums[mid]==2):
                swap(nums, mid, high)
                high-=1
            else:
                mid+=1
        