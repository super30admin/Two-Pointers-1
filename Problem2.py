## Problem2 (https://leetcode.com/problems/3sum/)

# Method-1: Hashing
# Time Complexity : O(n ^ 2)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach in three sentences only
# For each element, keeping it as fix, we solve the two sum problem on the remaining array with a new target = -nums[i].
# Whenever we get a triplet we sort the triplet and add it to the set to avoid duplicates.

class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        # using hashset
        result = set()
        for i in range(len(nums) - 2):
            # for every element do two sum solution on remaining array with target = 0 - nums[i]
            # target = -nums[i] for two sum
            target = -nums[i]
            visited = set()
            for j in range(i + 1, len(nums)):
                # look for complement of new target in the set
                if((target - nums[j]) in visited):
                    # we got a valid triplet. sort it and add to the result set
                    triplet = [nums[i], target - nums[j], nums[j]]
                    triplet.sort()
                    result.add(tuple(triplet))
                    visited.discard((target - nums[j]))
                else:
                    # add j element to the set
                    visited.add(nums[j])

        return list(result)

sol = Solution()
print("Method1: Hashing")
print(sol.threeSum([2, 11, 6, 8, 5, -1, -1, 3, 5, 2, 4, 12, 14, 0]))
print(sol.threeSum([-1, -1, -1, -1, 1, 1, 1, 1, 6, 6, 6, 6]))
print(sol.threeSum([-3, -4, 2, 3, 0, 1, 2, 1, 0,-1, -1, 0, 0, 2, 3, 4, -1, 0, 0, 1, 2]))


# Method-2: Two Pointers
# Time Complexity : O(n*logn) -- sorting + O(n ^ 2) -- doing two sum using two pointers for each element = O(n ^ 2)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach in three sentences only
# For each element, keeping it as fix, we solve the two sum problem on the remaining array with a new target = -nums[i].
# Use two pointer as we put one pointer at first index and second at last index. Compare the sum of left and right pointer value to the
# target and move the pointers accordingly. If the sum matches the target, we append the triplet to the result. To avoid duplicates as our 
# nums is sorted, so instead of using hashset we skip the duplicates from left and from right till we find the next unique element. 
# Another optimization we did is no need to go further if (nums[left] > target), as all the numbers would be greater than target
# we would not be able to make the sum as target. To remove outer duplication we use the same concept of skipping duplicates till the 
# next unique element

class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        # using two pointers
        result = []
        nums.sort()
        i = 0
        # Note: whenever updating base condition parameters inside while loop check the 
        # base condition again

        while(i < (len(nums) - 2)):
            if(nums[i] > 0):
                # since it is sorted and already sum > 0, no need to check forward
                # no more pairs would exist
                break
            # for every element do two sum problem with target = -nums[i]
            target = -nums[i]
            left = i + 1
            right = len(nums) - 1
            while((left < right) and (nums[left] <= target)):# cannot be equal because we need to find pair. We can add one more case when left pointer value > target, then we would not have any pair remaining for the new target. we can break from there
                if(nums[left] + nums[right] == target):
                    # we got a triplet
                    result.append([nums[i], nums[left], nums[right]])
                    # shift both pointers
                    left += 1
                    right -= 1
                    # since sorted all the duplicates would be together
                    # skip duplicates from left pointer
                    while(((left < right) and (nums[left] <= target)) and (nums[left] == nums[left - 1])):
                        left += 1
                    # skip duplicates from right pointer
                    while(((left < right) and (nums[left] <= target)) and (nums[right] == nums[right + 1])):
                        right -= 1
                elif(nums[left] + nums[right] > target):
                    # move the right pointer
                    right -= 1
                    # skip duplicates from right pointer
                    while(((left < right) and (nums[left] <= target)) and (nums[right] == nums[right + 1])):
                        right -= 1
                else:
                    # nums[left] + nums[right] < target
                    # move the left pointer
                    left += 1
                    # skip duplicates from left pointer
                    while(((left < right) and (nums[left] <= target)) and (nums[left] == nums[left - 1])):
                        left += 1

            i += 1
            # checking for duplicates for outer loop
            while((i < (len(nums) - 2)) and (nums[i] == nums[i - 1])):
                i += 1

        return result


sol = Solution()
print("Method1: Two Pointers")
print(sol.threeSum([2, 11, 6, 8, 5, -1, -1, 3, 5, 2, 4, 12, 14, 0]))
print(sol.threeSum([-1, -1, -1, -1, 1, 1, 1, 1, 6, 6, 6, 6]))
print(sol.threeSum([-3, -4, 2, 3, 0, 1, 2, 1, 0,-1, -1, 0, 0, 2, 3, 4, -1, 0, 0, 1, 2]))


                    