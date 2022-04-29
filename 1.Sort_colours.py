// Time Complexity : O(n) 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        if len(nums)==0: return 0
        low=0
        mid=0
        high=len(nums)-1
        
        while mid<=high:
            
            if nums[mid]==1: 
                mid=mid+1
            elif nums[mid]==2:
                nums[mid],nums[high]=nums[high],nums[mid]
                high=high-1
                
            else:
                nums[mid],nums[low]=nums[low],nums[mid]
                mid=mid+1
                low=low+1
        return nums
            
                
                