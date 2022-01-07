# // Time Complexity : O(N)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this :


# // Your code here along with comments explaining your approach
# Three pointers to collect three numbers in the array
# low --> 0, mid --> 1, high --> 2

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        
        if nums == None and len(nums) == 0:
            return
        low = 0
        mid = 0
        high = len(nums) - 1
        
        while(mid <= high):
            if(nums[mid] == 0):
                self.swap(nums,mid,low)
                low += 1
                mid += 1
            
            elif(nums[mid]==2):
                self.swap(nums,mid,high)
                high -= 1
            else:
                mid += 1
                
        
        
    def swap(self,nums, i, j):
        temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp