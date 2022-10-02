class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        
        # Brute force way is to sort directly with time nlog(n)
        # Another way is to get the count of 0,1 and 2 and then do it inplace. Here the time will be O(n) and space will be O(1). But this won't be ONE PASS solution
        
         # This problem is a bit different and bit difficult to understand
            
        # Again we take three pointers here
        
        low = 0 # keeps track of 0
        mid = 0 # Keeps track of 1
        high = len(nums) - 1 # Keeps track of 2
        
        while mid <= high:
            if nums[mid] == 0:
                nums[low], nums[mid] = nums[mid], nums[low]
                low += 1
                mid += 1 # Because 0s are always in the beginning
            elif nums[mid] == 2:
                nums[mid], nums[high] = nums[high], nums[mid]
                high -= 1 # Because we places 2 at high index
            else:
                mid += 1
                
        
        
    # TC: O(n)
    # SC: O(1)
            
                