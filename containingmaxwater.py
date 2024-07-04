#time= O(n)
#space= O(n)
def max_area(nums):
    n = len(nums)
    l,r = 0, n-1
    max_area= 0
    while l<r:
        cur_area = min(nums[l], nums[r]) * (r-l)
        max_area = max(cur_area, max_area)
        if nums[l]<=nums[r]:
            l+=1
        else:
            r-=1
    return max_area


# Example usage:
height = [1, 8, 6, 2, 5, 4, 8, 3, 7]
print(max_area(height))  # Output should be 49