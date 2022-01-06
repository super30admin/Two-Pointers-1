"""

Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] 
such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.

"""

# Time Complexity : O(n2)
# Space Complexity : O(n)
# Did this code successfully run on leetCode : Yes
# Any problem you faced while coding this :  No

from typing import List

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        
        # sorting array to use pointers
        nums.sort()
        result = []

        # coidition if we find 2 adjacent elements that are equal
        for i in range (len(nums) -2):
            if i > 0 and nums[i] == nums[i-1]:   #[i-1] because we are starting 1st element of nums on the left
                continue

            n0 = i + 1                      # lower pointer
            n2 = len(nums) -1               # higher pointer

            while n0 < n2:
                
                # setting up a target which equals sum of 3 elements to form unique triplet
                sum = nums[i] + nums[n0] + nums[n2]
                # sum = nums[i-1] + nums[i] + nums[i+1]

                # if sum is less than 0 in sorted array, we need to find higher number
                # move to the right by incrementing lower pointer
                if sum < 0:
                    n0 += 1

                # if sum is greater than 0, target element that makes sum close to 0 must be smaller
                # decrement higher pointer to find lower elementt
                elif sum > 0:
                    n2 -= 1

                # if sum == 0, store the triplet in result
                elif sum == 0:
                    result.append([nums[i], nums[n0], nums[n2]])

                     # after storing one triplet, we need to find next triplet
                    # increment/decrement pointers accordingly as long as there are still elements in nums
                    while n0 < (len(nums) - 1) and nums[n0] == nums[n0 + 1]:
                        n0 += 1

                    while n2 > 0 and nums[n2] == nums [n2 - 1]:
                        n2 -= 1

                # if no triplet found, still increment/decrement pointers
                n0 += 1
                n2 -= 1
        return result

ob1 = Solution()
print(ob1.threeSum([-1,0,1,2,-1,-4]))