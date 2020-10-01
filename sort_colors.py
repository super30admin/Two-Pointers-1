class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """

        # Time: O(N)
        # Space: O(1)

        fp = 0
        sp = 0
        tp = len(nums)-1

        while(sp <= tp):
            if nums[sp] == 2:
                nums[sp], nums[tp] = nums[tp], nums[sp]
                tp -= 1
            elif nums[sp] == 0:
                nums[fp], nums[sp] = nums[sp], nums[fp]
                fp += 1
                sp += 1
            else:
                sp += 1

        return nums
