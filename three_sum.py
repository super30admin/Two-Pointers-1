
#Time Complexity: O(N^2).
#Auxiliary Space: O(1)
#Did this code successfully run on leetcode :Yes


class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """

        n = len(nums)
        nums.sort()
        result = []

        for i in range(n):
            if nums[i]>0:
                break
            if i==0 or nums[i-1]!=nums[i]:
                self.twosum(nums,i,n,result)
        return result
    
    def twosum(self,nums,i,n,result):
        target = -1 * nums[i]
        j = i+1
        high = n-1
        while (j<high):
            mid = nums[j]+nums[high]
            if mid==target:
                result.append([nums[i],nums[j],nums[high]])
                j = j+1
                high = high -1
                while j<high and nums[j]==nums[j-1]:
                    j=j+1
                
                
            elif mid<target:
                j = j+1
                while j<high and nums[j]==nums[j-1]:
                    j=j+1
                
            else:
                high = high -1
            
        
            