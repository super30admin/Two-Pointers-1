# Time Complexity: O(n^2)
# Space Complexity: O(1)

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        answer = list()
        nums.sort()
        for index,val in enumerate(nums):
            if index > 0 and nums[index] == nums[index-1]:
                continue
            left,right = index+1,len(nums)-1
            
            while left < right:
                if nums[index] + nums[left] + nums[right] == 0:
                    answer.append([nums[index],nums[left],nums[right]])
                    left += 1
                    while nums[left] == nums[left-1] and left < right:
                        left += 1
                elif nums[index] + nums[left] + nums[right] < 0:
                    left += 1
                else:
                    right -= 1
        return answer
            
            