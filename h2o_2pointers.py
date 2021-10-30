# T.C is O(n) and S.C is O(1)
# The idea behind this solution is that we use 2 pointers and move the pointer
# which is smaller in value. We know the max_area is calculated by min(value) * diff of the indices.
# So no matter which pointer we move the diff is going to go down. In order to get the max area we can hope to get a better value only if
# we find a better value than the smaller height.

def max_area(nums):
    max_water = 0
    p, q = 0, len(nums)-1
    while p < q:
        water = min(nums[p], nums[q]) * (q - p)
        max_water = max(water, max_water)
        if nums[p] <= nums[q]:
            p += 1
        else:
            q = q - 1
    return max_water


height = [1, 8, 6, 2, 5, 4, 8, 3, 7]
print(max_area(height))

