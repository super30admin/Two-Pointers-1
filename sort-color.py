# Approach (Dutch National Flag Algorithm)
# We use three pointers:

# r (red/0s boundary) starts at index 0.
# w (current index) traverses the array.
# b (blue/2s boundary) starts at the last index.
# We iterate through nums and swap elements to ensure:

# 0s are moved to the left (r boundary).
# 1s stay in the middle.
# 2s are moved to the right (b boundary).
# Time & Space Complexity
# Time Complexity:O(n) (Single pass through the array).
# Space Complexity:O(1) (In-place sorting using constant extra space).
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        r, w, b = 0, 0, len(nums) - 1
        while w <= b:
            if nums[w] == 0:
                nums[r], nums[w] = nums[w], nums[r]
                r += 1
                w += 1
            elif nums[w] == 1:
                w += 1
            else:
                nums[w], nums[b] = nums[b], nums[w]
                b -= 1