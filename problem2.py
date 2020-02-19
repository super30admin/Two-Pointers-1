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
        l = set()

        nums.sort()
        print(nums)
        for i in range(0, len(nums) - 2):
            j = i + 1
            k = len(nums) - 1
            while j < k:
                sum1 = nums[i] + nums[j] + nums[k]

                if sum1 == 0:
                    l.add((nums[i], nums[j], nums[k]))
                    j += 1
                    k -= 1
                elif sum1 > 0:
                    k -= 1
                elif sum1 < 0:
                    j += 1

        return l

