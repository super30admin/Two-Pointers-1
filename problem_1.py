# TC: O(n)
# SC: O(1)

def sortColors(nums):
        """
        Do not return anything, modify nums in-place instead.
        """

        def swap(a, i, j):
            a[i], a[j] = a[j], a[i]
            return a
        if len(nums) > 1:
            l, m, r = 0, 0, len(nums) - 1
            while m <= r:
                if nums[m] == 2:
                    nums = swap(nums, m, r)
                    r -= 1
                elif nums[m] == 0:
                    nums = swap(nums, l, m)
                    l += 1
                    m += 1
                elif nums[m] == 1:
                    m += 1
        print(nums)

nums1 = [2,0,2,1,1,0]
sortColors(nums1)


nums1 = [2,0,1]
sortColors(nums1)