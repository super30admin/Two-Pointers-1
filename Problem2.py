# Time Complexity : O(n*n) where n is the length of list nums
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No



class Solution:
    def threeSum(self, nums):

        sol = set()
        nums.sort()
        for i in range(len(nums) - 2):
            j = i + 1
            k = len(nums) - 1

            if nums[i] > 0:
                break

            if i > 0 and nums[i] == nums[i - 1]:
                continue

            while j < k:
                s = nums[j] + nums[k] + nums[i]
                if s > 0:
                    k -= 1
                elif s < 0:
                    j += 1
                else:
                    sol.add((nums[i], nums[j], nums[k]))
                    while j < k and nums[j] == nums[j + 1]:
                        j += 1
                    while j < k and nums[k] == nums[k - 1]:
                        k -= 1
                    j += 1
                    k -= 1

        return list(sol)

#First I checked if the first number is positive then sum can never be 0 as the list is sorted. Then I checked if the present element is same as previous element
#then it will give same result, so saved computation there. Then after iterating over all numbers, i maintained 2 pointers to track the sum. If the sum was found
#then I added it to set else adjusted the pointers accordingly.