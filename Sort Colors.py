class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n = len(nums)
        
        if n < 2:
            return
        
        curr, first, last = 0, 0, n-1
        
        while curr <= last:
            
            # Case 1: If 2 is encountered, swap with last pointer and decrement last
            if nums[curr] == 2:
                nums[curr], nums[last] = nums[last], nums[curr]
                last -= 1
                
            # Case 2: If 0 is encountered, swap with first pointer and increment first and current
            if nums[curr] == 0:
                nums[curr], nums[first] = nums[first], nums[curr]
                curr += 1
                first += 1
                
            # Case 3: If 1 is encountered, just increment current
            elif nums[curr] == 1:
                curr += 1
                
        return nums
        
### Complexity Analysis:
# Time Complexity: O(N) --> We iterate through the entire array once bringing the pointers closer at every iteration until termination
# Space Complexity: O(1) --> No extra space used.
