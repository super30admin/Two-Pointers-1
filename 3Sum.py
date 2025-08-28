# Time Complexity : O(N ^ 2)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes      
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach: This code solves the 3Sum problem in O(n²) time using the two-pointer approach. It first sorts the array, then fixes one number (nums[i]) and uses two pointers (low, high) to find pairs that sum with it to zero, skipping duplicates to avoid repeated triplets. If the sum is too small, it moves low forward; if too large, it moves high backward; otherwise, it records the triplet and adjusts both pointers.

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        n = len(nums)
        result = []

        for i in range(n):
            if i != 0 and nums[i] == nums[i - 1]:
                continue
            
            if nums[i] > 0:
                break
            low = i + 1
            high = n - 1

            while low < high:
                total = nums[i] + nums[low] + nums[high]
                if total == 0:
                    result.append([nums[i], nums[low], nums[high]])
                    low += 1
                    high -= 1

                    while low < high and nums[low] == nums[low - 1]:
                        low += 1
                    
                    while low < high and nums[high] == nums[high + 1]:
                        high -= 1
                    
                elif total > 0:
                    high -= 1
                else:
                    low += 1
            
        return result
