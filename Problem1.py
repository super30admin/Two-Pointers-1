#Time Complexity : O(n) 
#Space Complexity :O(1)
#Did this code successfully run on Leetcode :Yes
#Any problem you faced while coding this :No

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        
        l, r= 0, len(nums)-1
        i =0
        def swap (i,j):
            nums[i], nums[j] = nums[j], nums[i]
            
        while i <= r:
            if nums[i]==0:
                swap(l, i)
                l+=1
                
            elif nums[i]==2:
                swap(i,r)
                r-=1
                i-=1
            i+=1
