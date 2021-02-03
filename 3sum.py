#TimeComplexity:O(N*N) 
#SpaceComplexity: No extra space used
#Did this code successfully run on Leetcode : Yes 
#Any problem you faced while coding this : No
class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        #similar to 2sum after taking first element and target is -(first element)
        if len(nums)<3 or nums==None:
            return []
        nums.sort()
        output=[]
        for i in range(len(nums)-2):
            if i>0 and nums[i]==nums[i-1]:
                continue
            j=i+1;k=len(nums)-1
            target= -nums[i]
            while j<k:
                if nums[j]+nums[k]<target:
                    j+=1
                    while j<k and nums[j]==nums[j-1]:
                        j+=1
                elif nums[j]+nums[k]>target:
                    k-=1
                    while j<k and nums[k]==nums[k+1]:
                        k-=1
                else:
                    output.append([nums[i],nums[j],nums[k]])
                    j+=1
                    k-=1
                    while j<k and nums[j]==nums[j-1]:
                        j+=1

                    while j<k and nums[k]==nums[k+1]:
                        k-=1
        return output