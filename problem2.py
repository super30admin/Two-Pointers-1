'''
Time Complexity :O(n^2)
Space Complexity: O(n^2)
Did this code successfully run on Leetcode : Yes
Explanation: Create a Set with lists inside to take care of repeated combinations.
Sort the array.
Create 2 pointers one for the index + 1 and one for the index from the end.
Check if the next element + current element + last element is == 0:
if yes then move the the next element pointer by 1 and reduce the end of array pointer by 1. Add elements as list in set.
If sum1 > 0 then reduce the end pointer by 1.
If sum1 <0 then increase the j by pointer by 1.
'''

class Solution:

    def threeSum(self, nums: List[int]) -> List[List[int]]:
        l = []

        nums.sort()
        for i in range(0, len(nums) - 2):
            low = i + 1
            high = len(nums) - 1

            if i > 0 and nums[i] == nums[i - 1]:
                continue

            while low < high:
                sum1 = nums[i] + nums[low] + nums[high]

                if sum1 == 0:
                    l.append([nums[i], nums[low], nums[high]])
                    low += 1
                    high -= 1
                    # low<high to make sure we don't overflow and leave the loop
                    # used for duplicates

                    while low < high and nums[low] == nums[low - 1]:
                        low += 1

                    while low < high and nums[high] == nums[high + 1]:
                        high -= 1

                elif sum1 > 0:
                    high -= 1
                elif sum1 < 0:
                    low += 1

        return l

