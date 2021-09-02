#Time complexity - O(N^2)
#Space complexity - O(1)
#Did this run in leetcode - yes

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        triplets = set()
        targetSum = 0
        for i in range(len(nums)-2):
            j = i+1
            k = len(nums)-1
            while j<k:
                currentSum =  nums[i] + nums[j] + nums[k]
                if currentSum == targetSum:
                    triplets.add((nums[i], nums[j], nums[k]))
                    j += 1
                    k -= 1
                elif currentSum < targetSum:
                    j += 1
                elif currentSum > targetSum:
                    k -= 1
        return triplets 