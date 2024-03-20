# Time Complexity : O(n^2)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach
from typing import List
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        result = set()
        n = len(nums)
        nums.sort()

        for i in range(n-2):
            if nums[i]>0: break

            if(i != 0 and nums[i] == nums[i-1]):
                continue
            l = i+1
            h = n-1
            while(l<h):
                currSum = nums[i]+nums[l]+nums[h]
                if currSum == 0:
                    result.add((nums[i], nums[l], nums[h]))
                    l+=1
                    h-=1
                    while(l < h and nums[l] == nums[l-1]):
                        l+=1
                    while(l < h and nums[h] == nums[h+1]):
                        h-=1
                elif(currSum < 0):
                    l+=1
                else:
                    h-=1
                
        return result

sc = Solution()
nums = [-1,0,1,2,-1,-4]
print(sc.threeSum(nums))
        