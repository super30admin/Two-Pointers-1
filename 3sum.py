# Time Complexity : O(n^2)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this :
  
  
"""
start from index 0 and go through each element. while going through each element take low and high pointer, check if sum of three equal to 0, if not we can skip all
elements which is equal to prior elements, and later elements
continue to check if triplet is equal to 0. add it to final list arr. return the list

"""


class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:

        nums.sort()
        if nums[0] > 0:
            return []
        n = len(nums)
        arr = []
        for i in range(n):

            if i !=0 and nums[i] == nums[i - 1]:
                continue
            low = i + 1
            high = n - 1

            while low < high:
                triplet = nums[i] + nums[low] + nums[high]

                if triplet == 0:
                    arr.append([nums[i], nums[low], nums[high]])
                    low += 1
                    high -= 1
                    while low < high and nums[low] == nums[low - 1]:
                        low += 1
                    while low < high and nums[high] == nums[high + 1]:
                        high -= 1
                elif triplet >= 0:
                    high -= 1

                else:
                    low += 1


        return arr

                



