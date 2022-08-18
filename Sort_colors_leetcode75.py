class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        # One pass TC - O(n) SC - O(1)
        n = len(nums)
        c = 0
        l = 0
        r = n - 1
        while c <= r:
            if nums[c] == 0:
                nums[c], nums[l] = nums[l], nums[c]
                c += 1
                l += 1

            elif nums[c] == 2:
                nums[c], nums[r] = nums[r], nums[c]
                r -= 1

            else:  # if c == 1 then just move c pointer
                c += 1

        '''
        # Easy - Using 2 pass, counting R, W, B and overwriting nums
        # TC - O(n) SC - O(1)
        R = 0
        W = 0
        B = 0
        n = len(nums)
        for i in range(len(nums)):
            if nums[i] == 0:
                R += 1
            elif nums[i] == 1:
                W += 1
            elif nums[i] == 2:
                B += 1

        i = 0
        while R > 0 and i < n:
            R -= 1
            nums[i] = 0
            i += 1
        while W > 0 and i < n:
            W -= 1
            nums[i] = 1
            i += 1
        while B > 0 and i < n:
            B -= 1
            nums[i] = 2
            i += 1
        '''

