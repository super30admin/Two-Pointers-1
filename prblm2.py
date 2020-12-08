class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        res=[]
        sumi=-1
        if len(nums)<3:
            return res
        n=len(nums)
        #sorting is imp to run
        nums.sort()
        #stop 2 values before end
        for i in range(0,n-2):
            #duplicacy>>if found same values>>>skip
            if i>0 and nums[i]==nums[i-1]:
                continue
            l=i+1#2nd pointer
            h=n-1#right pointer
            while l<h:
                #find sum
                sumi=nums[i]+nums[l]+nums[h]
                #if sum==0 >>found pairs,move pointers
                if sumi==0:
                    res.append((nums[i],nums[l],nums[h]))
                    l+=1
                    h-=1
                    #if found same values check bounds and skip
                    while l<h and nums[l]==nums[l-1]:
                        l+=1
                    while l<h and nums[h]==nums[h+1]:
                        h-=1
                #if negative sum, need to increase 2nd pointer to move towards positive side
                elif sumi<0:
                    l+=1
                #reverse action
                else:
                    h-=1
        return res
#O(N^2)
#O(1)