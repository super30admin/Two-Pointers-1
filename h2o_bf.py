# The B.F solution. We use two loops to iterate through the entire array and compute all
# the possible values, we pick the max out of those values
# Time complexity is O(n^2) and Space complexity is O(1)

def max_area(nums):
    if not nums: return 0
    max_water = 0
    for i in range(len(nums)- 1):
        for j in range(i+1, len(nums)):
            water = min(nums[i], nums[j]) * (j-i)
            max_water = max(max_water, water)
    return max_water


height = [1, 8, 6, 2, 5, 4, 8, 3, 7]
print(max_area(height))



