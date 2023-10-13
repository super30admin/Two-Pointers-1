# Time Complexity : O(n^2)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : No

# we are going to have two pointers and repeat the two sum keeping one index element fixed in nums.
class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        added=[]
        res=[]
        nums.sort()
        n=len(nums)
        if(n==3):
            if(nums[0]+nums[1]+nums[2]==0):
                res.append([nums[0], nums[1], nums[2]])
            return res
        for i in range(n-3):
            if(nums[i]==nums[i-1] and i>0):
                continue
            left=i+1
            right=n-1
            while(left<right):
                currsum=nums[i] + nums[left] + nums[right]
                if (currsum==0):
                    added=[nums[i], nums[left], nums[right]]
                    res.append(added)
                    left+=1
                    right-=1
                    while(nums[left]==nums[left-1] and left<right):
                        left+=1
                    while(nums[right]==nums[right+1] and left<right):
                        right-=1
                elif(currsum>0):
                    right-=1
                else:
                    left+=1
        return res