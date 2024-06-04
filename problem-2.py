# Time Complexity
# O(n^2)
# Space Complexity
# O(1)


# Approach :

# outer for loop, is for the first element in the sum order
# for a given i, left is i+1 and right is always initialised to n-1
# break the loop if nums[i] > 0
# if the sum of ith left and right th index is negative, increment left
# if positive, decrement right
# if zero, increment left and right and check if there are duplicates so that no duplicates are present.

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:

        if not nums:
            return [[]]

        right = len(nums)-1
        left = 0
        sumElem = 0

        listElement = []

        nums.sort()

        for i in range(len(nums)):

            if (i > 0 and nums[i] == nums[i-1]):
                continue

            if nums[i] > 0:
                break

            left = i+1
            right = len(nums)-1

            while (left < right):

                sumElem = nums[i] + nums[left] + nums[right]

                if sumElem < 0:

                    left = left+1

                elif sumElem == 0:

                    listElement.append([nums[i], nums[left], nums[right]])
                    left = left+1
                    right = right-1

                    while (left < right and nums[left] == nums[left-1]):
                        left = left+1

                    while (left < right and nums[right] == nums[right+1]):
                        right = right-1

                else:
                    right = right-1

        return listElement
