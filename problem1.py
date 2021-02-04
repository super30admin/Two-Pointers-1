// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution:   
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """          
        curr=0                  //take three pointers: lef wil shift towards right when the element is 0, right will move left when the element is 2 otherwise curr will move forward as the element will be 1
        left=0
        right=len(nums)-1
        while curr<=right:
            if nums[curr]==0:                 //element is 0 => increment left and current
                self.swap(nums,left,curr)
                curr+=1
                left+=1
            elif nums[curr]==2:             //element is 2 => decrement right
                self.swap(nums,curr,right)
                right-=1
            else:                         //element is 1 =>just increment curr 
                curr+=1                   
            
    def swap(self,nums,a,b):
        nums[a],nums[b]=nums[b],nums[a]
