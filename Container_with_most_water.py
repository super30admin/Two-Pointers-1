# Logic -
# loop throught the heights and find the min of the heights
# we then calculate the max with the min * (right_end - left_end)
# then follow the 2 pointer approach for updating max and checking the left, right values.

# Time - O(n)
# Space - O(1)

def maxArea(self, height: List[int]) -> int:
    # base condition
    if len(height) < 2:
        return []
    left = 0
    right = len(height) - 1
    maxi = 0
    #         2 pointer approcah
    while left < right:
        mini = min(height[left], height[right])
        maxi = max(maxi, mini * (right - left))
        if height[left] < height[right]:
            left += 1
        else:
            right -= 1
    return maxi

    # time - O(n^2)
    # space - o(1)

#         ans = 0
#         for i in range(len(height)):
#             for j in range(1,len(height)):
#                 mini = min(height[i], height[j])
#                 ans = max(ans, mini * (j-i))
#         return ans
