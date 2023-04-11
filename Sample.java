Sort Colors
TC:O(n)
Sc:)(1)
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        left = 0
        right = len(nums)-1
        current = 0
        while current <= right:
            if nums[current] == 0:
                nums[current], nums[left] = nums[left], nums[current]
                left += 1
                current += 1
            elif nums[current] == 2:
                nums[current], nums[right] = nums[right], nums[current]
                right -= 1
            else:
                current += 1

##3Sum 
Tc: o(n)
sc:0(n)
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
# First sort the array
        nums.sort()
        # Initialize result list
        result = []
        # Loop through the array to find the three elements
        for i in range(len(nums) - 2):
            # Skip the duplicates
            if i > 0 and nums[i] == nums[i - 1]:
                continue
            # Initialize the two pointers, one from the current position and one from the end of the array
            left, right = i + 1, len(nums) - 1
            # Loop through the array until the two pointers meet
            while left < right:
                # Get the sum of the three elements
                sum_ = nums[i] + nums[left] + nums[right]
                # If the sum is zero, add the elements to the result list
                if sum_ == 0:
                    result.append([nums[i], nums[left], nums[right]])
                    # Skip the duplicates
                    while left < right and nums[left] == nums[left + 1]:
                        left += 1
                    while left < right and nums[right] == nums[right - 1]:
                        right -= 1
                    # Move the pointers
                    left += 1
                    right -= 1
                # If the sum is less than zero, move the left pointer to the right
                elif sum_ < 0:
                    left += 1
                # If the sum is greater than zero, move the right pointer to the left
                else:
                    right -= 1
        # Return the result list
        return result



## Container With Most Water
## TC: o(n)
## space complexcity : o(1)
class Solution:
    def maxArea(self, height: List[int]) -> int:
        if len(height) == 0:
            return 
        area = 0
        n = len(height)
        left = 0
        right = n-1
        while left <= right:
            area = max(area, min(height[left],height[right])*abs((left-right)))
            if height[left] <= height[right]:
                left += 1
            else:
                right -= 1
        return area