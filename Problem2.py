## Problem2 (https://leetcode.com/problems/3sum/)
class Solution:
    def threeSum(self, nums: list[int]) -> list[list[int]]:
        """
        Time Complexity: O(N^2)
        - Sorting the array takes O(N log N) time.
        - The outer loop runs O(N) times, and the inner two-pointer while loop 
          takes O(N) time in the worst case. 
        - Overall time: O(N log N) + O(N^2) = O(N^2).
        
        Space Complexity: O(1) to O(N)
        - We only use a few pointers (O(1) auxiliary space).
        - However, Python's built-in sort (Timsort) takes O(N) space in the 
          worst case. (The result array space is generally not counted towards 
          auxiliary space).
        """
        n = len(nums)
        result = []
        
        # Sort the array first to use two-pointers and easily skip duplicates
        nums.sort()
        
        # We stop at n-2 because we need at least 3 elements to form a triplet
        for i in range(n - 2):
            # Skip duplicates for the 1st element to avoid duplicate triplets
            if i > 0 and nums[i] == nums[i - 1]:
                continue
                
            # Early exit: if our smallest number is > 0, it's impossible to sum to 0
            if nums[i] > 0:
                break

            # Initialize left and right pointers
            l, r = i + 1, n - 1
            
            while l < r:
                sum3 = nums[i] + nums[l] + nums[r]
                
                if sum3 == 0:
                    # Found a valid triplet
                    result.append([nums[i], nums[l], nums[r]])
                    l += 1
                    r -= 1
                    
                    # Skip duplicates for the 2nd element (left pointer)
                    while l < r and nums[l] == nums[l - 1]:
                        l += 1
                        
                    # Skip duplicates for the 3rd element (right pointer)
                    while l < r and nums[r] == nums[r + 1]:
                        r -= 1
                        
                elif sum3 < 0:
                    # Sum is too small, move left pointer right to increase value
                    l += 1
                else:
                    # Sum is too large, move right pointer left to decrease value
                    r -= 1
                    
        return result