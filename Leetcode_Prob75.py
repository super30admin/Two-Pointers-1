#time: O(n)
#space: O(1)
#explaination: we have 3 pointers left, curr and right. left and curr are at the start of the array and right is at the end of the array.
#we iterate through the array and if we find 0 we swap it with left and increment left and curr. if we find 2 we swap it with right and decrement right.
#we increment curr if we find 1. we do this until curr is less than or equal to right.   

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        left, curr, right = 0, 0, len(nums) - 1
            
        while curr <= right:
            if nums[curr] == 0:
                nums[left], nums[curr] = nums[curr], nums[left]
                left += 1
                curr += 1
            elif nums[curr] == 2:
                nums[curr], nums[right] = nums[right], nums[curr]
                right -= 1
            else:
                curr += 1
