class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        '''// Time Complexity : O(n^2 log n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes 
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach '''
        if len(nums)==0 or len(nums)<3:
            return None
        
        nums.sort() #nlogn
        result=[]
        n=len(nums)
        for i in range(n):
            #Taking care of outside duplicates
            if i > 0 and nums[i]==nums[i-1]:
                continue
            if nums[i]>0:
                break
            l=i+1
            h=n-1
            while l<h:
                currsum=nums[i]+nums[l]+nums[h]
                if currsum==0:
                    result.append([nums[i], nums[l], nums[h]])
                    l+=1
                    h-=1
                    #Check for internal duplicates
                    while l<h and nums[l]==nums[l-1]:
                        l+=1
                    while l<h and nums[h]==nums[h+1]:
                        h-=1
                elif currsum>0:
                    h-=1
                else:
                    l+=1
        return result
