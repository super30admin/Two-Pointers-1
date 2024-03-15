# Time Complexity : O(n)
# Space Complexity : 0(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def findDisappearedNumbers(self, nums: List[int]) -> List[int]:
        result = []
        #Nums[i] belongs to i-1 index in array or range[1,n] when you find a number go to that index where no should be belonged and make that num negative
        for i in range(len(nums)):
            idx = abs(nums[i])-1
            if nums[idx]>0:
                nums[idx]=-nums[idx]
        for i in range(len(nums)):
            if nums[i]>0:
                result.append(i+1)
        return result