# // Time Complexity : O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : YES
# // Any problem you faced while coding this : Followed approach from class
# // Your code here along with comments explaining your approach
# Sort Colors    
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        left,i = 0,0
        temp = 0
        right = len(nums)-1
        while(i<=right):
            if nums[i] == 0:
                temp = nums[left]
                nums[left] = nums[i]
                nums[i] = temp
                left += 1
                i += 1
            elif nums[i] == 1:
                i +=1
            elif nums[i] == 2:
                temp = nums[right]
                nums[right] = nums[i]
                nums[i] = temp
                right -= 1
                
        
        
        