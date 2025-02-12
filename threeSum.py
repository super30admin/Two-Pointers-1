# TP Approach --
# TC = O(n log n) {sort} + (n^2) ==> O(n^2)
# Refer notes

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        if nums is None or len(nums) == 0: return 0

        n = len(nums)
        nums.sort()
        rtnArr = []
        sum = 0

        for i in range(n):  # O(n)
            # this is to compare if the elements are equal to each other,
            # so we dont process the same elemnets repetitively
            if i > 0 and nums[i] == nums[i - 1]: continue

            # if num[i] {fixed element} becomes greater than 0, then we won't get the sum as 0
            # because, we already sort the elements in asc order. The further we move, the nums go
            # from negative to positive
            if nums[i] > 0: break
            # to establish range we set two pointers left and right
            left = i + 1
            right = n - 1
            while left < right:  # O(n)
                sum = nums[i] + nums[left] + nums[right]
                if sum == 0:
                    temp = (nums[i], nums[left], nums[right])
                    rtnArr.append(temp)
                    left += 1
                    right -= 1
                    while (left < right and nums[left] == nums[left - 1]):
                        left += 1
                    while (left < right and nums[right] == nums[right + 1]):
                        right -= 1
                elif sum < 0:
                    left += 1
                else:
                    right -= 1
        return rtnArr

        # Brute force approach - TC - O(n^3) and SC = O(1)
        # if nums is None or len(nums) == 0: return 0

        # n = len(nums)
        # hset = set()
        # rtnArr = []

        # for i in range(n):
        #     for j in range(i+1, n):
        #         for k in range(j+1, n):
        #             sum = nums[i] + nums[j] + nums[k]
        #             if sum == 0:
        #                 # li is a tuple since if list is used,
        #                 # we get the “TypeError: unhashable type: 'list'” error
        #                 li = (nums[i], nums[j], nums[k])
        #                 # if tuple is added below, since if not added,
        #                 # we get the “TypeError: unhashable type: 'list'” error
        #                 sorted_= tuple(sorted(li))
        #                 if sorted_ not in hset:
        #                     rtnArr.append(sorted_)
        #                     hset.add(sorted_)
        # return rtnArr
