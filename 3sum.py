// Time Complexity : O(n**2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Mainting the edge cases took some time to adjust


// Your code here along with comments explaining your approach
In this Problem we start with three pointers one to traverse the whole list and the other two to traverse the remaining list when one element is selected.we see whether the sum is equal to zero or not.If yes we add it to the list and if not we traverse till the end of the list.

class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        if len(nums)==0 or len(nums)<3:
            return []
        out=[]
        nums=sorted(nums)
        i=0
        while i<len(nums)-2:
            if i>0 and nums[i]==nums[i-1]:
                i=i+1
                continue
            j=i+1
            k=len(nums)-1
            rem1=-1*nums[i]
            while j<k:
                if nums[i]+nums[j]+nums[k]==0:
                    out.append([nums[i],nums[j],nums[k]])
                    j=j+1
                    k=k-1
                    while  0<=j-1<len(nums)-1 and nums[j-1]==nums[j]:
                        j=j+1
                    while 0<k+1<=len(nums)-1 and nums[k]==nums[k+1]:
                        k=k-1
                elif rem1>nums[j]+nums[k]:
                    j=j+1
                else:
                    k=k-1
            i=i+1
        return(out)