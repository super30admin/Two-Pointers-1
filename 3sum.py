# 2 pointer approach
# Time = O(nlogn)(for sorting) + O(n*n) = O(n*n), Space = O(1) 
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        result = []
        n = len(nums)
        nums.sort()

        for i in range(n-2):
            if i != 0 and nums[i] == nums[i-1]: # outside duplicacy
                continue
            if nums[i] >0:
                break
            low = i + 1
            high = n - 1

            while (low < high):
                summ = nums[i] + nums[low] + nums[high]

                if summ == 0:
                    result.append([nums[i], nums[low], nums[high]])
                    low += 1
                    high -= 1
                    # inside duplicates
                    while(low < high and nums[low] == nums[low-1]):
                        low += 1
                    while (low < high and nums[high] == nums[high+1]):
                        high -= 1
                elif summ <0:
                    low += 1
                else:
                    high -= 1
        return result
        