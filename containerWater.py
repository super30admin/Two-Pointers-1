# Time Complexity: O(n)
# Space Complexity: O(1)

# For this approach, as an optimization over the Brute Force, we consider two pointers: At the end and start. We start moving the pointer 
# in the direction where we find the constraining height. Eg: between 1 & 7, 1 is the constraining height (Decreasing pointer 7 will just give us the same height and lower width)

# With that we forgo all unnecessary comparisons and reduce time complexity to O(n)

class Solution:
    def maxArea(self, height: List[int]) -> int:
        if height is None or height == 0 :
            return 0
        n = len(height)
        low = 0
        high = n - 1
        maximum = 0
        while (low < high):
            maximum = max(maximum, min(height[low], height[high]) * (high - low))

            if(height[low] <= height[high]):
                low += 1
            else:
                high -= 1
        
        return maximum

# Time Complexity: O(n)
# Space Complexity: O(1)

# Similar solution, just that we can find out the indices of the two heights found with the maximum area

class Solution:
    def maxArea(self, height: List[int]) -> int:
        if height is None or height == 0 :
            return 0
        n = len(height)
        low = 0
        high = n - 1
        maximum = 0
        start = 0
        end = 0
        while (low < high):
            current_area = max(maximum, min(height[low], height[high]) * (high - low))

            if (maximum < current_area):
                maximum = current_area
                start = low
                end = high

            if(height[low] <= height[high]):
                low += 1
            else:
                high -= 1
        
        return maximum


# Time Complexity: O(n ^ 2)
# Space Complexity: O(1)

# This is the Brute Force Solution. For this case, I test all possible combinations of the Water and Return the Maximum Area

class Solution:
    def maxArea(self, height: List[int]) -> int:
        if height is None or height == 0 :
            return 0
        n = len(height)
        maximum = 0

        for i in range(n):
            for j in range(i+1, n):
                maximum = max(maximum, min(height[j], height[i]) * (j - i))
        
        return maximum
