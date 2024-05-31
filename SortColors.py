# Time Complexity : O(n)
# Space Complexity : O(1)
class Solution:
    def swap(self, nums, i, j):
        nums[i], nums[j] = nums[j], nums[i]

    def sortColors(self, nums):
        if not nums or len(nums) == 0:
            return
        
        left, mid, right = 0, 0, len(nums) - 1
        
        while mid <= right:
            if nums[mid] == 0:
                self.swap(nums, mid, left)
                left += 1
                mid += 1
            elif nums[mid] == 2:
                self.swap(nums, mid, right)
                right -= 1
            else:
                mid += 1

# Example usage
solution = Solution()

# Example 1
nums1 = [2, 0, 2, 1, 1, 0]
solution.sortColors(nums1)
print(nums1)  # Expected output: [0, 0, 1, 1, 2, 2]

# Example 2
nums2 = [2, 0, 1]
solution.sortColors(nums2)
print(nums2)  # Expected output: [0, 1, 2]

# Example 3
nums3 = [1, 2, 0, 1, 0, 2, 1]
solution.sortColors(nums3)
print(nums3)  # Expected output: [0, 0, 1, 1, 1, 2, 2]

