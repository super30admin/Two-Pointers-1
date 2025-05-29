"""
I implemented this using the two-pointer approach. I first sorted the array, then selected a pivot and performed the two-pointer technique on the remaining elements. I skipped duplicate elements to avoid producing the same output.
Time Complexity: O(n²)
Space Complexity: O(1)
"""
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        length = len(nums)
        if length < 3:
            return []
        result = []
        for i in range(length):
            if nums[i] > 0:
                break
            if i > 0 and nums[i] == nums[i-1]:
                continue
            low, high = i+1, length-1
            while(low < high):
                total_sum = nums[i] + nums[low] + nums[high]
                if total_sum == 0:
                    result.append([nums[i], nums[low], nums[high]])
                    low += 1
                    high -= 1
                    while(low < high) and nums[low] == nums[low-1]:
                        low += 1
                    while(low < high) and nums[high] == nums[high+1]:
                        high -= 1
                elif total_sum > 0:
                    high -= 1
                else:
                    low += 1
        return result