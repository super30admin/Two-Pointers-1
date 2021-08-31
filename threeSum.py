# Time Complexity : O(N^2) for quick sort
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : No
# Any problem you faced while coding this : I was not able to figure out the logic properly

def twoSum(self, nums: List[int], target: int) -> List[int]:
        
    res = {}
    for i in range(len(nums)):
        if (target - nums[i]) in res:
            return [nums[i], nums[res[target - nums[i]]]]
        res[nums[i]] = i
        
def threeSum(self, nums: List[int]) -> List[List[int]]:
        
    res = []
    for i in range(len(nums)):
        
        mid_val = self.twoSum(nums, -1)
        if nums[i] + sum(mid_val) == 0:
            mid_val.append(nums[i])
            res.append(mid_val)
    return res