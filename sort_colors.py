#// Time Complexity :O(n)
#// Space Complexity :O(1) in place 
#// Did this code successfully run on Leetcode : Yes
#// Any problem you faced while coding this :None


#// Your code here along with comments explaining your approach
#As we see that there are only three digits 0,1,2.2 should be at the farther end ,0 at the start and 1 in between 0 and 2.so for this we #maintain three pointers low,mid and high each pointing to we then check the value of mid.If it is 2 we swap it with the value at the high 
#pointer.If it is 1 we increment mod by 1 .If it is 0 we swap with high.The resultant nums array gives the nums values in sorted order.

class Solution(object):
    def sortColors(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        low=0
        mid=0
        high=len(nums)-1
        if len(nums)==0 or nums==None:
            return nums
        while (mid<=high):
            if nums[mid]==2:
                nums[mid],nums[high]=nums[high],nums[mid]
                high=high-1
            elif nums[mid] ==1:
                mid=mid+1
            else:
                nums[low],nums[mid]=nums[mid],nums[low]
                low=low+1
                mid=mid+1
        return nums
        
        