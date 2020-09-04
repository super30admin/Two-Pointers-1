# Logic
# if the curr value is 0 --> swap current with left , increment left and current
# if the curr value is 1 --> increment the current value
# if the curr value is 2 --> swap current with right, decrement right

# Time - O(n)
# Space - O(1)


def sortColors(self, nums: List[int]) -> None:
    """
    Do not return anything, modify nums in-place instead.
    """

    left = 0
    right = len(nums) - 1
    curr = 0

    # check the base case for empty list
    if len(nums) == 0 or nums == None:
        return []

    # two pinter approach

    while curr <= right:
        if nums[curr] == 0:
            nums[curr], nums[left] = nums[left], nums[curr]
            curr += 1
            left += 1

        elif nums[curr] == 2:
            nums[curr], nums[right] = nums[right], nums[curr]
            right -= 1

        elif nums[curr] == 1:
            curr += 1

    print(nums)




