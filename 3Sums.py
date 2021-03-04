#Brute Force Approach
# Time Complexity: O(n^3)
# Space Complexity: O(1)
'''
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        res = []
        li = []
        subarraycount = 0
        if nums == None or len(nums) == 0:
            return res
        for i in range(len(nums) - 2):
            for j in range(i + 1, len(nums)):
                for k in range(j + 1, len(nums)):
                    Sum = nums[i] + nums[j] + nums[k]
                    if Sum == 0:
                        li = [nums[i], nums[j], nums[k]]
                        li.sort()
                        if li not in res:
                            res.append(li)

        return res
'''
# Optimised Approach
# Time Complexity: O(n^2)
# Space Complexity: O(1)
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        res = []
        if nums == None or len(nums) == 0:
            return res
        nums.sort()
        for i in range(len(nums) - 2):
            if nums[i] == nums[i - 1] and i > 0:
                continue
            low = i + 1
            high = len(nums) - 1
            while (low < high):
                Sum = nums[i] + nums[low] + nums[high]
                if Sum == 0:
                    li = [nums[i], nums[low], nums[high]]
                    low += 1
                    high -= 1
                    res.append(li)
                    while nums[low] == nums[low - 1] and low < high:
                        low += 1
                    while nums[high] == nums[high + 1] and low < high:
                        high -= 1

                elif Sum < 0:
                    low += 1
                else:
                    high -= 1
        return res