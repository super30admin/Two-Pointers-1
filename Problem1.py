'''
Problem1 (https://leetcode.com/problems/sort-colors/)
'''
'''
Time Complexity : O(N)
Space Complexity : O(1)
'''
'''
Approach : 
using three pointer low,mid,high
if we encounter mid as 0 
then we swap low and mid and then low ++ and mid ++
if we encounter mid as 1 then we do mid ++
if we encounter mid as 2 then we swap mid and high and high --
'''
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        
        low = 0
        high = len(nums)-1
        mid = 0
        while(mid<=high):
            if(nums[mid]==0):
                nums[low],nums[mid] = nums[mid],nums[low]
                mid = mid + 1
                low = low + 1
                
            elif(nums[mid]==1):
                mid = mid + 1
            else :
                nums[mid],nums[high]= nums[high],nums[mid]
                high = high - 1
    
