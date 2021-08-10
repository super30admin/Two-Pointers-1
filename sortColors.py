#Leetcode problem: 75
#Two pointer
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        # nums.sort()
        # return(nums)
        p0=curr=0
        p2=len(nums)-1
        
        while curr<=p2:
            if nums[curr]==0:
                nums[p0],nums[curr]=nums[curr],nums[p0]
                p0+=1
                curr+=1
            elif nums[curr]==2:
                nums[p2],nums[curr]=nums[curr],nums[p2]
                p2-=1
            else:
                curr+=1

#TC: O(n)
#SC: O(1)