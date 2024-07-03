# Time Complexity : O(n)
# Space Complexity : O(1)
class Solution:
    def maxArea(self, height: list[int]):
        l, r = 0 , len(height) - 1
        maxArea = 0

        while l < r:
            area = (r - l) * min(height[l], height[r])
            maxArea = max(area, maxArea)
            if height[l] < height[r]:
                l += 1
            else:
                r -= 1
        return maxArea
        

if __name__ == "__main__":
    solution = Solution()
    
    # Test case 1
    height = [1,8,6,2,5,4,8,3,7]
    print(f"Maximum area for heights {height} is: {solution.maxArea(height)}")  # Output: 49

    # Test case 2
    height = [1,1]
    print(f"Maximum area for heights {height} is: {solution.maxArea(height)}")  # Output: 1

