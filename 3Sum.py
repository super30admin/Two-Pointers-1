# TC: O(N) since we are using 2 pointers to traverse the input array and find sum. N is the size of the input array. 
# SC: O(1) since we are not using any extra space.

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        if not nums or len(nums) == 0:
            return 
        result = []
        nums.sort()
        for i in range(len(nums) - 1):
            if i > 0 and nums[i] == nums[i - 1]:
                continue
            low = i + 1
            high = len(nums) - 1
            while low < high:
                addn = nums[i] + nums[low] + nums[high]
                if addn == 0:
                    result.append([nums[i], nums[low], nums[high]])
                    low += 1
                    high -= 1
                    while low < high and nums[low] == nums[low - 1]:
                        low += 1
                    while low < high and nums[high] == nums[high + 1]:
                        high -= 1
                elif addn > 0:
                    high -= 1
                else:
                    low += 1
        return result
