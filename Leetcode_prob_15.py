# Problem name: 15. 3Sum
#time: O(n^2)
#space: O(1)
#explaination: we sort the array and then iterate through the array. we have 3 pointers i, l and r. i is the current element, l is i + 1 and r is the last element. 
#we check if the sum of the 3 elements is greater than 0, if it is we decrement r. if the sum is less than 0 we increment l. if the sum is 0 we add it to the result array.
#we then increment l until it is not equal to the previous element. we do this until i is the last element.
#we also have a check to make sure that the current element is not equal to the previous element.   


class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        res = []

        for i, a in enumerate(nums):
            if i > 0 and a == nums[i-1]:
                continue

            l, r = i + 1, len(nums) - 1
            while l < r:
                curSum = a + nums[l] + nums[r]

                if curSum > 0:
                    r -= 1
                elif curSum < 0:
                    l += 1
                else:
                    res.append([a, nums[l], nums[r]])

                    l += 1
                    while l < r and nums[l] == nums[l - 1]:
                        l += 1

        return res



