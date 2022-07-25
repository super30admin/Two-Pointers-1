# Time Complexity : O(N)  //Where n is the size of the array
#  Space Complexity : O(1)  //We are using the same nums to sort the colors
#  Did this code successfully run on Leetcode : Yes
#  Any problem you faced while coding this : N/A

#  Your code here along with comments explaining your approach

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        #Declare variables to do binary sort
        left = 0
        right = len(nums)-1
        mid = (left+right+1)//2
        i=0
        #While sorting swap the colors based on their inputs that is 0 or 2
        while  i <= right:
            if nums[i] == 0:
                nums[left], nums[i] = nums[i], nums[left]
                left+=1
            elif nums[i] == 2:
                nums[right], nums[i] = nums[i], nums[right]
                right-=1
                i-=1
            i+=1
