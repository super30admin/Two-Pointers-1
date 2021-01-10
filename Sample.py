class Solution:
    
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        
        """
		Problem 1
		
		Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? 
		- Find all unique triplets in the array which gives the sum of zero.
		
        Approach: 
        - Sort the array, Use 2-pointers to pick the result
        - Ensure non-duplicacy of the results
        - Optimize by conditions like when number > 0 -> break the loop
        
        Time Complexicity: O(n^2)
        Space Complexicity: O(1) # No extra space used
        
        """
        
        if len(nums) == 0: return [] # edge case
    
        nums = sorted(nums) # Sort the array to simplify
        result = [] # Initialize result array
        
        for i in range(len(nums)-2):
            if nums[i] <= 0:
                if i != 0 and nums[i] == nums[i-1]: continue
                low = i + 1; high = len(nums) - 1
                while low < high:
                    Sum = nums[i] + nums[low] + nums[high] 
                    if Sum == 0:
                        group = [nums[i], nums[low], nums[high]]
                        if not group in result:
                            result.append(group)
                        low += 1; high -= 1
                    elif Sum > 0:
                        high -= 1
                    else:
                        low += 1
                    
        return result
		
class Solution:
    
    def sortColors(self, nums: List[int]) -> None:
        
        """
		Problem 2:
		
		- Given an array nums with n objects colored red, white, or blue, 
		- sort them in-place so that objects of the same color are adjacent, 
		- with the colors in the order red, white, and blue.
		- use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
		
        Do not return anything, modify nums in-place instead.
        
        Approach: 
        1. 2-Pass solution using a dictionary
        2. Single pass solution using 3 pointers 
        
        Time Complexicity: O(n) for both #1 and #2
        Space Complexicity: O(1) for both #1 and #2
        
        Try: 2 pass solution:
        
        if len(nums) == 0: return []
        
        num_dict = {}
        for num in nums:
            if not num in num_dict.keys():
                num_dict[num] = 1
            else:
                num_dict[num] += 1
                
        result = []
        for i in range(0, 3):
            for k in range(num_dict[i]):
                result.append(i)
                
        return result
        """
        # Use a single-pass solution:
        
        def swap(nums, low, high):
            nums[high], nums[low] = nums[low], nums[high]
        
        if len(nums) == 0: return
        low = mid = 0; high = len(nums) - 1
        while mid <= high:
            if nums[mid] == 1:
                mid += 1
            elif nums[mid] == 2:
                swap(nums, mid, high)
                high -= 1
            else:
                swap(nums, low, mid)
                low += 1; mid += 1
                
        return nums
                
                
class Solution:
    
    def maxArea(self, height: List[int]) -> int:
        
        """
        Problem 3: 
        
        Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai)
        - Find two lines, which, together with the x-axis forms a container, such that the container contains the most water.
        
        Approach:
        - Use 2 pointers 
        - Initialize variable max_area, 
          - Calculate area based on height comparisons from each end and lowering the distance
          - Increase the max_area if better value is found until left and right pointers cross each other
          
        Time Complexicity: O(n), where n = lenght of array "height"
        
        Space Complexicity: O(1)
        
        """
        if len(height) == 0: return 0
        left = 0; right = len(height) - 1; max_area = 0
        while left < right:
            min_height = min(height[left], height[right])
            if min_height * (right - left) > max_area:
                max_area = min_height * (right - left)
            if min_height == height[left]:
                left += 1
            else:
                right -= 1
                
        return max_area
