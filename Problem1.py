class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        
        """
        curr = front =0
        rear = len(nums)-1
        while curr<=rear:
            if nums[curr]==0:
                nums[front], nums[curr]= nums[curr],nums[front]
                front +=1
                curr +=1
            elif nums[curr]==2:
                nums[curr],nums[rear]=nums[rear],nums[curr]
                rear -= 1
            else:
                curr=curr+1
        
        
    """
    TC- O(n)
    SC- O(1)
    Did this code successfully run on Leetcode- Yes :
    Any problem you faced while coding this- No :
    """
        