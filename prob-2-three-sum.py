class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        """
        Time complexity: O(n2) + O(nlogn) for sorting = O(n2)
        Space complexity: O(n)
        Solution: We will use the 2-pointers solution to solve this
        Did this code successfully run on Leetcode: Yes
        Any problem you faced while coding this: No
        """
        nums.sort()
        result = []

        for i in range(len(nums)):
            if nums[i] > 0:
                break
            if i == 0 or nums[i - 1] != nums[i]:
                self.sum2(nums, i, result)
        return result

        
    def sum2(self, nums: List[int], i, result: List[List[int]]):
        lo, hi = i + 1, len(nums) - 1
        while (lo < hi):
            sum = nums[i] + nums[lo] + nums[hi]
            if sum < 0:
                lo = lo + 1
            elif sum > 0:
                hi = hi - 1
            else:  # sum = 0
                result.append([nums[i], nums[lo], nums[hi]])
                lo += 1
                hi -= 1
                while lo < hi and nums[lo] == nums[lo - 1]:
                    lo += 1
    
