# // Time Complexity :O(n)
# // Space Complexity :O(1)
# // Did this code successfully run on Leetcode :Yes
# // Any problem you faced while coding this :NO


# // Your code here along with comments explaining your approach
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        l = 0
        m = 0
        h = len(nums)-1
        temp = 0
        # def swap(i,j):
        #     temp = i
        #     i=j
        #     j=temp
        while m<=h:
            if nums[m]==2:
                nums[m],nums[h] = nums[h],nums[m]
                h-=1
            elif nums[m]==0:
                nums[m],nums[l] = nums[l],nums[m]
                m+=1
                l+=1
            elif nums[m]==1:
                m+=1