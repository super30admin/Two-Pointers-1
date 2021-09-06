# Time complexity
0(N)

# Space complexity 
0(1)

# yes it worked succesfully on leetcode

class Solution(object):
    def sortColors(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        l=i=0
        h = len(nums)-1
        # print(h)
        
        while i <= h:
            if nums[i] ==2:
                nums[i], nums[h]= nums[h],nums[i]
                h-=1
            elif nums[i]==0:
                nums[i],nums[l]=nums[l],nums[i]
                l+=1
                i+=1
            else:
                i+=1
            
