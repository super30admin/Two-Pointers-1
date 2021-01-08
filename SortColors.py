# TC = O(n)
# SC = O(1)
# We will be using three pointers. Curr to index elements of the array and current element under consideration. Ultimate motive of p0 and p2 pointers is to point them at the last instance of 0 and first instance of 2 respectively. Initially we set p0 to first element and p2 to last element. We traverse through the array- each time we find 0 element we swap this with p0 and when we find 2, we swap with p2. We traverse until p2. curr pointer is used to indicate last instance of 1. If we encounter 1, all good- proceed to next element.

def sortColors(nums):
    curr, p0, p2 = 0, 0, len(nums)-1
    while curr <= p2:
        if nums[curr] == 0:
            nums[p0], nums[curr] = nums[curr], nums[p0]
            p0 += 1
            curr += 1
        elif nums[curr] == 2:
            nums[curr], nums[p2] = nums[p2], nums[curr]
        else:
            curr += 1
    return nums

nums = [2,0,2,1,1,0]
print(sortColors(nums))
