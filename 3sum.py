#TC = O(n*n)
#SC = O(n)
#Compiled and run on Leetcode


class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:

        nums.sort()
        triplets = []

        for i in range(len(nums) - 2):

            if i > 0 and nums[i] == nums[i - 1]: continue #remove duplicates

            left = i + 1
            right = len(nums) - 1

            while (left < right):

                currentsum = nums[i] + nums[left] + nums[right]
                #2 sum logic
                if currentsum == 0:
                    triplets.append([nums[i], nums[left], nums[right]])

                    while left < right and nums[left] == nums[left + 1]:
                        left += 1
                    while left < right and nums[right] == nums[right - 1]:
                        right -= 1

                    left += 1
                    right -= 1

                elif currentsum < 0:
                    left += 1

                else:
                    right -= 1

        return triplets