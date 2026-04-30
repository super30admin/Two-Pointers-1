# Time Complexity --> O(n)
# Space Complexity --> O(1)
# Approach --> Using mid pointer as a fast pointer that traverses the list and swaps with low or high pointer accordingly
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n = len(nums)
        def swap(i,j):
            temp = nums[i]
            nums[i] = nums[j]
            nums[j] = temp
        
        low = 0
        mid = 0
        high = n-1
        while mid<=high:
            if nums[mid]==2:
                swap(mid,high)
                high=high-1
            elif nums[mid]==0:
                swap(mid,low)
                low = low+1
                mid = mid+1
            else:
                mid = mid+1
        
