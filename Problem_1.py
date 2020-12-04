# Sort Colors

# Time Complexity : O(N)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes, Runtime: 24 ms and Memory Usage: 13.4 MB
# Any problem you faced while coding this : Initally yes, After class understanding no.
# Your code here along with comments explaining your approach
# Approach
"""
The brute foce would be quick sort which is not optimised. So using Two pointers
this problem is solved by initializing low and mid to first element and
high to last element. The cases encountered are established that Case 1: if nums[mid]==0
than swap(low,mid) and increment low and mid; Case 2: if nums[mid]==1 than only
mid will be incremented and moving towards right and Case 3:  if nums[mid]==2
than swap(high,mid) and decrement high i.e moving towards left. The condition
to stop will be when mid<=high.

"""
class Solution(object):
    def sortColors(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        if(nums==None or len(nums)==0): # Edge Cases
            return 0
        low=0
        high=len(nums)-1
        mid=0
        while(mid<=high):
            if(nums[mid]==0): # Case 1
                temp=nums[low] # Swapping values
                nums[low]=nums[mid] 
                nums[mid]=temp
                low=low+1
                mid=mid+1
            elif(nums[mid]==1): # Case 2
                  mid=mid+1
            else:
                temp=nums[high]  # Case 3
                nums[high]=nums[mid]
                nums[mid]=temp
                high=high-1
        return nums  