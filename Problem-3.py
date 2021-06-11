"""
Approach:
This is similar to the 2 sum approach. If we were to implement the solution without using any additional space, we can
use the 2 pointers method.
1) break the problem into two sum approach. At each element you'll go through the result of the array on your right and
try to find the compliment of the first element. ie sum of 3 elements is zero
2) you need to make sure that you do not capture the duplicates so you sort the array first and skip and duplicate
elements along the process
3) for the inner sub array, you'd move your pointers based on the current sum. This way you can check for the possible
sum in O(n) time
4) you do this for each element, so your final solution would be O(n^2)

"""

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        n = len(nums)
        result = []
        if n < 3:
            return result
        nums.sort()
        for out in range(n):
            # outer duplicate check....
            if out != 0 and nums[out] == nums[out - 1]: continue
            left = out + 1
            right = n - 1
            while (left < right):
                sum_ = nums[out] + nums[left] + nums[right]
                if sum_ == 0:
                    result.append([nums[out], nums[left], nums[right]])
                    left += 1
                    right -= 1

                    while 0 < left < n and left < right and nums[left] == nums[left - 1]:
                        left += 1

                    while 0 <= right < n - 1 and left < right and nums[right] == nums[right + 1]:
                        right -= 1

                elif sum_ < 0:
                    left += 1

                else:
                    right -= 1

        return result

"""
TC: O(n^2)
SC: O(1)
"""