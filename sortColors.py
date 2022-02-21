# // Time Complexity :o(n)
# // Space Complexity :O(1)
# // Did this code successfully run on Leetcode :yes
# // Any problem you faced while coding this :no

class Solution:
    def sortColors(self, nums):
        """
        Do not return anything, modify nums in-place instead.
        """
        

        l=0
        r=len(nums)-1
        i=0

        while i<=r:
            if nums[i]==0:
                # swap(l,i)
                nums[i],nums[l]=nums[l],nums[i]

                i+=1
                l+=1
            elif nums[i]==1:
                i=i+1
            
            else:
                # swap(r,i)
                nums[i],nums[r]=nums[r],nums[i]
                
                r=r-1
         
            