class Solution:
    def sortColors(self, nums: List[int]) -> None:
        n = len(nums)  # Get the length of the array
        low = 0  # Pointer for the boundary of 0s
        high = n - 1  # Pointer for the boundary of 2s
        mid = 0  # Pointer for current element

        # Traverse the array once
        while mid <= high:
            if nums[mid] == 2:
                # If the element is 2, swap it with the element at high and decrease high
                self.swap(nums, mid, high)
                high -= 1  # Decrease high pointer
            elif nums[mid] == 0:
                # If the element is 0, swap it with the element at low and move both low and mid forward
                self.swap(nums, mid, low)
                low += 1  # Increase low pointer
                mid += 1  # Move to next element
            else:
                # If the element is 1, just move mid forward
                mid += 1

    def swap(self, nums: List[int], i: int, j: int) -> None:
        # Swap elements at indices i and j
        temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp


# time complexity :O(n)
# space complexity :O(1)
