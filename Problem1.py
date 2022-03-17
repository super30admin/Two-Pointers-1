#Time Complexity : O(n)
#Space Complexity : O(1)
#Did this code successfully run on Leetcode : YES
#Any problem you faced while coding this : NO
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        
        start = 0
        mid = 0
        last = len(nums) - 1
        while mid <= last:
            if nums[mid] == 2:
                nums[mid], nums[last] = nums[last], nums[mid]
                last -=1
            elif nums[mid] == 0:
                nums[mid], nums[start] = nums[start], nums[mid]
                start += 1
                mid +=1
            else:
                mid +=1
                
        return nums
                
        
        
            
               