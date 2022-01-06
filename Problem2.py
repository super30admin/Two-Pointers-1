# Time Complexity : O(n^2) where n is the length of list.
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes.
# Any problem you faced while coding this : Class Solution.
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        result = []
        for i in range(len(nums)-2):
            if (i!=0 and nums[i-1] == nums[i]):
                continue
            low = i + 1
            high = len(nums) -1
            while(low<high):
                sum = nums[low] + nums[high] + nums[i]
                if sum == 0:
                    result.append([nums[low],nums[high],nums[i]])
                    low += 1
                    high -=1
                    while(low<high and nums[low] == nums[low-1]):
                        low += 1
                    while(low<high and nums[high] == nums[high+1]):
                        high -= 1
                        
                elif sum < 0:
                    low += 1
                else:
                    high -= 1
        return result
