# Time Complexity: O(n)
# Space Complexity: O(1)

def sortColors(nums):
    if nums is None or len(nums) == 0:
        return
    
    low =0
    high = len(nums) - 1
    mid = 0

    while mid <= high:
        if nums[mid] == 0:
            swap(nums,mid,low)
            mid += 1
            low += 1
        elif nums[mid] == 1:
            mid += 1
        else:
            swap(nums, mid,high)
            high += 1


def swap(nums, i, j):
    nums[i], nums[j] = nums[j], nums[i]
