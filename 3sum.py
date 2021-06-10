# Time Complexity: O(n2)
# Space Complexity: O(1)
class Solution(object):
    def threeSum(self, nums):
        #         Initialize output list
        result_list = []
        #     Sort array
        nums.sort()  # n logn
        for i in range(len(nums)):
            # pivot = i
            #             check if the current number is greater than 0 which means array is already sorted
            if nums[i] > 0:
                break
            #            Avoiding duplicate cases
            if i != 0 and nums[i] == nums[i - 1]:
                continue
            #           start left pointer with current element + 1
            #           and right as length of array  - 1
            left = i + 1
            right = len(nums) - 1
            #             Iterate in left and right range till left is less than right
            while left < right:
                #               Take sum of the current element and left pointer and right pointer element
                sum_val = nums[i] + nums[left] + nums[right]
                #
                #               if sum is 0 then add it to the result and update both left and right pointer
                if sum_val == 0:
                    curr_list = [nums[i], nums[left], nums[right]]
                    # print(curr_list)
                    result_list.append(curr_list)
                    left += 1
                    right -= 1
                    #                     Avoiding duplicate cases
                    while left < right and nums[left] == nums[left - 1]:
                        left += 1
                    while left < right and nums[right] == nums[right + 1]:
                        right -= 1
                #                    if sum is > 0 we will update right pointer
                elif sum_val > 0:
                    right -= 1
                #             els ewe will update left pointer
                else:
                    left += 1
        #                 retrun result list
        return result_list

        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
