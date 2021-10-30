# This is Prof. Dijkstra's approach. Time complexity is O(n) and space complexity is O(1)
# The idea is to sort just two colors and the third one will automatically be sorted.
# Its a tricky approach.

def sort_colors(nums):
    if not nums:
        return
    low, mid, high = 0, 0, len(nums)-1
    while mid < high:
        if nums[mid] == 1:
            mid += 1
        elif nums[mid] == 0:
            nums[mid], nums[low] = nums[low], nums[mid]
            mid += 1
            low += 1
        else:
            nums[mid], nums[high] = nums[high], nums[mid]
            high -= 1
    return nums


nums = [2, 0, 2, 1, 1, 0]
print(sort_colors(nums))
