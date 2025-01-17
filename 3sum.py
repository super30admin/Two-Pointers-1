# Time Complexity : O(nlogn) + O(n^2), n log n - sorting, n^2 because 2 loops (i and left/right), 
# Space Complexity : O(1), not using any extra space
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : NA 

# Your code here along with comments explaining your approach:
# 3 elements that sum to 0
# fixing i for every element in the list, and then doing two sum
# for every i, checking if n[left] + n[right] == remaining sum, or all 3 equal to 0
# if so, we store in result and move to next element
# we have to make sure there are no duplicates, so both at i level and left/right level, if the new value is same as previous
# we move to the next value

class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        if nums is None:
            return []
        
        result = []
        nums = sorted(nums)
        n = len(nums)
        # traversing through the list
        # to fix all elements as the first element (i) one by one
        for i in range(n):
            if i > 0 and nums[i] == nums[i - 1]:
                # if this value of i is same as the previous one, we just move on to the next one
                # simply i++
                continue
            if nums[i] > 0:
                # no combinations possible with this element and upcoming elements
                # because the list is sorted
                # and if there as -ves and that can make the total = 0
                # we would have already explored those combinations
                break

            left = i + 1
            right = n - 1
            # now tarversing through rest of the list for j and k
            # and checking all combinations with this specific i
            while(left < right):
                sum = nums[i] + nums[left] + nums[right]
                if sum == 0:
                    # found a triplet, add to the result list
                    result.append([nums[i], nums[left], nums[right]])
                    # moving left and right, because we already have a combination at these values
                    # of left and right
                    left += 1
                    right -= 1
                    # now we keep on moving until we find a different value of left/right
                    # this is done to prevent duplicates, if the value is same as previous, we just move to next
                    while (left <= right and nums[left] == nums[left - 1]):
                        left += 1
                    while (left <= right and nums[right] == nums[right + 1]):
                        right -= 1

                # now if sum < 0
                if sum < 0:
                    # this means we need to move right, to reach closer to 0
                    left += 1
                elif sum > 0:
                    # this means we need to reduce our values, and move left
                    right -= 1

        return result   
