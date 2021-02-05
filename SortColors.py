# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : YES
# Any problem you faced while coding this : NO


# Your code here along with comments explaining your approach
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        l,curr,r = 0,0,len(nums)-1
        
        def swap(curr,x):
            temp = nums[curr]
            nums[curr]=nums[x]
            nums[x]=temp
        
        while(curr<=r):
            if nums[curr] == 2:
                swap(curr,r)
                r-=1
            elif nums[curr] == 0:
                swap(curr,l)
                l+=1
                curr+=1
            else :
                swap(curr,l)
                curr+=1
                
        
        