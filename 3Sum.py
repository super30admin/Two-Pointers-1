# Time complexity is O(n^2) one loop set element and second is for two pointer sum
# Space complexity is O(1)

class Solution:
    def threeSum(self, nums: list[int]) -> list[list[int]]:
        nums.sort()
        result = []
        numsLen = len(nums)
        # In this solution I will find 3 sum by using two sum appraoch
        # First I will sort the array
        # I will fix one element and then run two pointer to find the other two element
        # I will skip duplicates with while loop
        # Example : arr = [-4, -1, -1, 0, 1, 2]
        # fix element = -4
        # other two pointer find two number whose sum with fix element gives me zero.
        # target = 4 any two element whose sum = 0
        i = 0
        for i in range(numsLen-2):
            if i != 0 and nums[i] == nums[i-1]:
                continue
            target = - nums[i]
            leftPtr = i+1
            rightPtr = numsLen - 1

            while leftPtr < rightPtr:
                if nums[leftPtr] + nums[rightPtr] > target:
                    rightPtr -= 1

                elif nums[leftPtr] + nums[rightPtr] < target:
                    leftPtr += 1

                else:
                    temp = [nums[i], nums[leftPtr], nums[rightPtr]]
                    result.append(temp)
                    rightPtr -= 1
                    leftPtr += 1
                    while leftPtr < rightPtr and nums[leftPtr] == nums[leftPtr - 1]:
                        leftPtr += 1
                    while leftPtr < rightPtr and nums[rightPtr] == nums[rightPtr + 1]:
                        rightPtr -= 1

        return result
