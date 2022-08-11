'''
Time Complexity: O(n^2)
Space Complexity: O(1)
'''


class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        n = len(nums)
        nums.sort()
        result = []
        for i in range(0, n-2):
            if (i != 0 and nums[i] == nums[i-1]):
                continue
            low = i+1
            high = n-1
            while(low < high):
                total = nums[i] + nums[low] + nums[high]
                if total == 0:
                    result.append([nums[i], nums[low], nums[high]])
                    low += 1
                    high -= 1
                    while(low < high and nums[low] == nums[low-1]):
                        low += 1
                    while(low < high and nums[high] == nums[high+1]):
                        high -= 1
                elif total > 0:
                    high -= 1
                else:
                    low += 1
        return result
