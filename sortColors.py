class Solution:
    def sortColors(self, nums: List[int]) -> None:
        # Time complexity : O(N) 
        # Space complexity : O(1)

        # Initialize three pointers
        low = 0  
        mid = 0  
        high = len(nums) - 1  

        # Process elements in the array until mid pointer surpasses high
        while mid <= high:
            # If the current element is 2
            if nums[mid] == 2:
                # Swap it with the element at the high pointer
                nums[mid], nums[high] = nums[high], nums[mid]
                # Decrement the high pointer
                high -= 1

            # If the current element is 0
            elif nums[mid] == 0:
                # Swap it with the element at the low pointer
                nums[mid], nums[low] = nums[low], nums[mid]
                # Increment both low and mid pointers
                mid += 1
                low += 1

            # If the current element is 1
            else:
                # Just move to the next element
                mid += 1
