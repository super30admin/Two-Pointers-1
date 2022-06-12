#TC: O(n^2)
#SC: O(1)
class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        result=[]
        leng=len(nums)
        nums.sort()
        if nums==None or len(nums)==0: 
            return result
        for i in range(0,leng-2):
            if i>0 and nums[i]==nums[i-1]: continue
            if nums[i]>0 : break
            l=i+1
            h=leng-1
            while l<h:
                if (nums[l]+nums[h]+nums[i]==0): 
                    l1=[nums[i],nums[l],nums[h]]
                    result.append(l1) 
                    while (l<h and nums[l]==nums[l+1]): l=l+1 
                    while (l<h and nums[h]==nums[h-1]): h=h-1  
                    l = l + 1
                    h = h - 1
                    
                elif (nums[l]+nums[h]+nums[i])>0:
                    h=h-1
                elif (nums[l]+nums[h]+nums[i])<0:
                    l=l+1
        return result