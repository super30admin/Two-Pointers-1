"""
TC -> O(n)
SC ->O(1)

Logic:
Use 3 pointers.
r pointer is used to move across the array and make decisions.Initially, l,r set to 0 and h sent to len(num)-1
Until r crosses h, iterate
If num[r] equals to 2, it means we have encountered 2 on the left side and has to be moved to the right. Swap with h index. When we
do the swap with h, we dont increment the r pointer but we will decrement h
If num[r] equals 0, it means we have to move the 0 to left side and can be done by swaping with l. This time we update l and r
If num[r ]=1, increment r
"""
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        l = 0
        r = 0
        h = len(nums) - 1
        while (r <= h):
            if nums[r] == 0:
                nums[l], nums[r] = nums[r], nums[l]
                l += 1
                r += 1
            elif nums[r] == 2:
                nums[r], nums[h] = nums[h], nums[r]
                h -= 1
            else:
                r += 1

