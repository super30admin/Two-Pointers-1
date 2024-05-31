# Time Complexity : O(n^2)
# Space Complexity : O(1)
class Solution:
    def threeSum(self, nums):
        if not nums or len(nums) == 0:
            return []
        
        nums.sort()  # Works only on sorted arrays
        result = []
        n = len(nums)
        
        for i in range(n):  # First Pointer
            # Avoiding duplicates in the outer loop
            if i > 0 and nums[i] == nums[i - 1]:
                continue
            if nums[i] > 0:
                break
            left, right = i + 1, n - 1  # Second and Third Pointers
            while left < right:
                total = nums[i] + nums[left] + nums[right]
                if total == 0:
                    result.append([nums[i], nums[left], nums[right]])
                    left += 1
                    right -= 1
                    # Avoiding duplicates in the inner loop
                    while left < right and nums[left] == nums[left - 1]:
                        left += 1
                    while left < right and nums[right] == nums[right + 1]:
                        right -= 1
                elif total > 0:
                    right -= 1
                else:
                    left += 1
        
        return result

# Example usage
solution = Solution()

# Example 1
nums1 = [-1, 0, 1, 2, -1, -4]
print(solution.threeSum(nums1))  # Expected output: [[-1, -1, 2], [-1, 0, 1]]

# Example 2
nums2 = [0, 0, 0, 0]
print(solution.threeSum(nums2))  # Expected output: [[0, 0, 0]]

# Example 3
nums3 = [-2, 0, 1, 1, 2]
print(solution.threeSum(nums3))  # Expected output: [[-2, 0, 2], [-2, 1, 1]]