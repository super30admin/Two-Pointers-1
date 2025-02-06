# Time : O(nlogn + n^2)
# SPace: O(1)
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        n = len(nums)
        result = []
        nums.sort() 
        for i in range(n):
            # Two sum using two pointer
            if i > 0 and nums[i-1] == nums[i]: continue
            l = i+1
            r = n-1
            while l < r:
                currSum = nums[i] + nums[l] + nums[r]
                if currSum == 0:
                    result.append([nums[i], nums[l], nums[r]])
                    l += 1
                    r -=1
                    while l < r and nums[l-1] == nums[l]:
                        l +=1
                    while l < r and nums[r] == nums[r+1]:
                        r -=1
                elif currSum > 0:
                    r -= 1
                else: l += 1
        return result    

# Time: O(n^2)  
# Space: O(n)     
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        n = len(nums)
        result = set()
        nums.sort() 
        for i in range(n):
            # Two sum using hashset
            target = 0 - nums[i]
            complimentSet = set()
            for j in range(i+1, n):
                diff = target - nums[j]
                if diff in complimentSet:
                    result.add((nums[i], nums[j], diff))
                else: complimentSet.add(nums[j])

        return [list(item) for item in result]
            
        