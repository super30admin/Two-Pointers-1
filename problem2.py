#3Sum
# Time Complexity: O(n^2)
# Space Complexity: O(1)

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        res = []
        nums.sort()

        for i in range(len(nums)):
            if nums[i] > 0:
                break
            if nums[i] != nums[i-1] or i == 0:
                self.twoSum(nums, i, res)
        return res
    
    def twoSum(self, nums:List[int], i: int, res: List[List[int]]):
        lo = i +1
        hi = len(nums) - 1
        sum = 0
        while lo<hi:
            sum = nums[i] + nums[lo] + nums[hi]
            if sum < 0:
                lo += 1
            elif sum > 0:
                hi -= 1
            else:
                res.append([nums[i],nums[lo], nums[hi]])
                lo += 1
                hi -= 1
                while lo < hi and nums[lo] == nums[lo-1]:
                    lo += 1
                
        