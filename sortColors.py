# Time Complexity :O(n)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode :Yes       
# Any problem you faced while coding this :No

class Solution(object):
    def sortColors(self, nums):
        (l,m)=(0,0)
        h=len(nums)-1
        while(m<=h):
            if(nums[m]==2):
                (nums[m],nums[h])=(nums[h],nums[m])
                h-=1
            elif(nums[m]==0):
                (nums[m],nums[l])=(nums[l],nums[m])
                m+=1
                l+=1
            else:
                m+=1
        return (nums)

