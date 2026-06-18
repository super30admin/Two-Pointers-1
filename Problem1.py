## Problem1 (https://leetcode.com/problems/sort-colors/)
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        
        Time Complexity: O(N) 
            Where N is the length of the nums array. We scan through the 
            unsorted portion of the array at most twice (once for 0s, once for 1s).
            
        Space Complexity: O(1) 
            The sorting is done entirely in-place. We only use three integer 
            pointers (target, l, r) which require constant extra memory.
        """
        """
        # 2 Pass Solution
        # 'target' represents the color we are currently grouping:
        # We start by targeting 0 (red), then move to 1 (white).
        target = 0 
        
        # 'l' points to the index where the next 'target' element should be placed
        l = 0
        
        # 'r' is the scanning pointer used to explore the array
        r = 0
        
        # We only need to explicitly place 0s and 1s. 
        # Once they are in place, the 2s will naturally end up at the back.
        while target < 2:
            
            # Scan the array starting from our current 'r' pointer
            while r < len(nums):
                if nums[r] == target:
                    # We found the target color! Swap it to the 'l' boundary
                    nums[r], nums[l] = nums[l], nums[r]
                    # Advance both the boundary and scanning pointers
                    l += 1
                    r += 1
                else:
                    # Not the target color, just keep scanning forward
                    r += 1
            
            # Move on to grouping the next color (change target from 0 to 1)
            target += 1
            
            # Reset 'r' to start from 'l'. 
            # Everything before 'l' is already sorted with previous targets (like 0s),
            # so we only need to scan the remaining unsorted portion.
            r = l
            """
        
        # 1 Pass solution
        """
        Do not return anything, modify nums in-place instead.
        
        Time Complexity: O(N)
            Where N is the length of the array. We process each element 
            exactly once, making this a true 1-pass solution.
            
        Space Complexity: O(1)
            Done entirely in-place using only three integer pointers.
        """
        # 'low' keeps track of where the next 0 should go (front of the array)
        low = 0
        
        # 'mid' is our current scanning pointer
        mid = 0
        
        # 'high' keeps track of where the next 2 should go (back of the array)
        high = len(nums) - 1
        
        # We scan until our 'mid' pointer crosses the 'high' pointer.
        # Anything past 'high' is already correctly placed as a 2.
        while mid <= high:
            
            if nums[mid] == 0:
                # We found a 0. Swap it to the 'low' boundary.
                nums[low], nums[mid] = nums[mid], nums[low]
                # Since the element swapped from 'low' is guaranteed to be a 1 
                # (or we just swapped a 0 with itself), we can safely advance both pointers.
                low += 1
                mid += 1
                
            elif nums[mid] == 1:
                # We found a 1. It's already in the correct "middle" area.
                # Just leave it there and advance the scanning pointer.
                mid += 1
                
            else: # nums[mid] == 2
                # We found a 2. Swap it to the 'high' boundary at the back.
                nums[mid], nums[high] = nums[high], nums[mid]
                # We decrement 'high' to shrink the back boundary.
                # IMPORTANT: We do NOT increment 'mid' here because the new element 
                # we just swapped from the back is unexamined and could be a 0, 1, or 2.
                high -= 1