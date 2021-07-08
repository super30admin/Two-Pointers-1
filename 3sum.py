"""
// Time Complexity : O(n2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None
// Your code here along with comments explaining your approach
Algorithm explanation
1. Sort the array
2. Iterate from i=0 to n-3
3.     Initiatlize start and end pointers to track down the elements in rest part of the array
4.   Iterate while start < end
       If sum of elem of i + start + end == 0 then append to list
       if sum < 0
            while arr of start == arr of start -1: increment start
       else:
            while arr of end == arr of end + 1: decrement start
4. return the result
"""

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        """
        1. Sort the array
        2. Iterate from i=0 to n-3
        3.     Initiatlize start and end pointers to track down the elements in rest part of the array
        4.   Iterate while start < end
               If sum of elem of i + start + end == 0 then append to list
               if sum < 0
                    while arr of start == arr of start -1: increment start
               else:
                    while arr of end == arr of end + 1: decrement start
        4. return the result
        """
        nums.sort()
        n = len(nums)
        result = []
        for i in range(0,n-2):
            if i > 0 and nums[i] == nums[i-1]:
                continue
            start,end = i+1,n-1 #initial configuration
            while start < end:
                ele = [nums[i],nums[start],nums[end]]
                sum_ele = sum(ele)
                if sum_ele == 0: #update the result
                    result.append(ele)
                    start+=1
                    end-=1
                    #increment the start to avoid duplicate pairing
                    while start < end and nums[start] == nums[start-1]:
                        start+=1
                    #decrement the start to avoid duplicate pairing
                    while start < end and nums[end] == nums[end+1]:
                        end-=1
                elif sum_ele < 0: #increment start similarly as above
                    start+=1
                    while nums[start] == nums[start-1] and start < end:
                        start+=1
                else: #decrement end similarly as above
                    end-=1
                    while nums[end] == nums[end+1] and start < end:
                        end-=1
        return result