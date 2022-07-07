

#Time Complexity : O(n)
#Space Complexity : O(1)
#Did this code successfully run on Leetcode : Yes

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        left=0
        curr=0
        right=len(nums)-1
        while(curr<=right):
            if nums[curr]==0:
                nums[curr],nums[left]= nums[left],nums[curr]
                curr+=1
                left+=1
            elif nums[curr]==2:
                nums[curr],nums[right]=nums[right],nums[curr]
                right-=1
            else:
                curr+=1
                
                