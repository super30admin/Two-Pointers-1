# Intuition: Brute force
# fix each number and then find two other numbers that adds up to the complement of first number i.e. total sum = 0
# do this for each number in the array.
# 3 loops required: TC: O(n^3)
# SC: O(1)

# Intuition 2: Fix first number, do 2 sum on the rest of the array
# 2 sum can be done using 2 ptrs such that fix left at curr idx +1 and right at last element
# if the idx to be fixed is equal to the previous idx, then just increment curr idx to next until you find unique. Once you find the unique, fix it and do two sum on the rest.
# while doing two sum, if you find a triplet and then come across a duplicate number, skip over it until you find unique
# TC: n * TC of 2 sum using 2 ptrs = n * [n+nlogn] = n*(nlogn) = O(n^2 log n) if array is non-sorted. If it is - O(n^2)
# SC: O(1)

class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """

        nums = sorted(nums)
        n = len(nums)
        result = []

        # if n == 3:
        #     sum = 0
        #     for i in range(n):
        #         sum = sum + nums[i]
        #     if sum == 0:
        #         result.append([nums[0], nums[1], nums[2]])
        #         return result

        for i in range(n-1):
            target = 0 - (nums[i])

            # if outer duplicacy, ignore and move on
            if nums[i] == nums[i - 1] and i > 0:
                continue

            # else : fix idx and set left to next idx, right to last
            left = i+1
            right = n-1
            while left < right:
                currSum = nums[left] + nums[right]
                if currSum > target:  # decrease right ptr if currSum > tgt that is move to lower side
                    right -= 1
                elif currSum < target:  # increase left ptr if currSum < tgt that is move to greater side
                    left += 1
                else:  # if currSum == target, increase left by 1, decrease right by 1
                    result.append([nums[i], nums[left], nums[right]])
                    left += 1
                    right -= 1
                    # handle inner duplicacy if triplet found, that is increase/decrease until next unique found from both ends
                    while left < right and nums[left] == nums[left - 1]:
                        left += 1
                    while left < right and nums[right] == nums[right + 1]:
                        right -= 1

        return result


obj = Solution()
res = obj.threeSum([0, 0, 0, 0])
print(res)
