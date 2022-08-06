#  15. 3Sum
'''
Leetcode all test cases passed: Yes
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        n is the length of nums
        Space Complexity: O(1)
        Time Complexity: O(n ^ 2)
'''
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        
        first = 0
        res = []
        nums.sort()
        while nums[first] <= 0 and first < len(nums) - 2: 
            l = first + 1
            r = len(nums) - 1
            while l < r:
                total = nums[first] + nums[l] + nums[r]
                if total == 0:
                    res.append([nums[first],nums[l],nums[r]])
                    l += 1
                    r -= 1
                    while  l < r and nums[l] == nums[l-1]:
                        l += 1
                    while  l < r and nums[r] == nums[r+1]:
                        r -= 1
                elif total < 0:
                    l += 1
                    while  l < r and nums[l] == nums[l-1]:
                        l += 1
                elif total > 0:
                    r -= 1
                    while  l < r and nums[r] == nums[r+1]:
                        r -= 1
            first += 1
            while nums[first] <= 0 and first < len(nums) - 2 and nums[first] == nums[first - 1]:
                first += 1
        return res
                
