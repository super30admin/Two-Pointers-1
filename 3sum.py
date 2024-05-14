# time complexity: O(n^2)
# space complexity: O(1)
# Approach: 
# sort the array
# use a for loop and inside for loop run a two pointer from next index to last index
# if all three values add up to 0, add to the result list
# increment left pointer of the sum is < 0 and decrement right pointer if sum is >0


class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        n = len(nums)
        nums = sorted(nums)
        result = []
        for i in range(0,n):
            if(i>0 and nums[i]==nums[i-1]):
                continue
            left = i+1
            right = n-1
            while left < right:
                sum1 = nums[i] + nums[left] + nums[right]
                if sum1 == 0:
                    list1 = [nums[i], nums[left], nums[right]]
                    result.append(list1)
                    left = left+ 1
                    right = right -1
                    while((left < right) and (nums[left] == nums[left-1])):
                        left = left + 1
                    while((left < right) and (nums[right] == nums[right+1])):
                        right = right -1
                elif sum1 < 0:
                    left = left + 1
                elif sum1 > 0:
                    right = right - 1
        return result
                    
                    
                    
        