# 3sum
"""
Time Complexity = O(n^2 logn) n^2 because of 2 loops. log n becuase skipping of same elements
Space Complexity = O(1)

Keeping a element fixed and performing 2sum on rest elements using two pointers.
"""


class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        target = 0
        result = list()

        # size less than 3
        if len(nums) < 3:
            return []

        # normal size

        # sorting aray first since index is not required.
        nums.sort()

        # itterating through all elements by keeping one fix and doing 2sum on rest.

        # keeping 1st element fix
        f = 0

        # iterating through rest elements and with new target

        while (f < len(nums) - 1):
            # print("-------------")
            # print(nums[f])

            new_target = target - nums[f]
            # now, we only have to solve for new target. This is just 2sum now.
            l = f + 1
            h = len(nums) - 1

            # another loop tp solve 2sum using 2 pointers (not binary search)
            while (l < h):

                temp_sum = nums[l] + nums[h]
                # print(nums[l], nums[h], temp_sum)

                # temp_sum is less then new_target, this means we must search in lower side.
                if temp_sum > new_target:
                    # to search in lower side, we will reduce higher pointer

                    h = h - 1

                # temp_sum is more then new_target, this means we must search in higher side.
                elif temp_sum < new_target:
                    # to search in higher side, we will increase lower pointer

                    l = l + 1

                # target is achieved. Store elements in result array
                else:
                    result.append([nums[f], nums[l], nums[h]])
                    h = h - 1
                    l = l + 1
                    # skip same values of l and h
                    while l < h and nums[l] == nums[l - 1]:
                        l = l + 1
                    while l < h and nums[h] == nums[h + 1]:
                        h = h - 1

            # skip same values of f
            while True:
                # print(f)
                if f == len(nums) - 1:
                    return result

                # print("here")

                f = f + 1
                # print(nums[f], nums[f-1])
                if nums[f] != nums[f - 1]:
                    break
                if f == len(nums) - 1:
                    return result

        # print(result)

        return result


