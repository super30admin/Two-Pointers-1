#Time complexity - o(n*2)
#Space complexity - o(1)

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        result = []
        n = len(nums)

        for i in range(n-2):

            if i!=0 and nums[i]==nums[i-1]:
                continue

            if nums[i]>0:
                break
            left = i+1
            right = n-1

            while left < right:
                cur_sum = nums[i]+nums[left]+nums[right]
                if cur_sum == 0:
                    result.append([nums[i],nums[left],nums[right]])
                    left+=1
                    right-=1
                    while left < right and nums[left] == nums[left-1]:
                        left+=1
                    while left < right and nums[right] == nums[right+1]:
                        right-=1
                elif cur_sum > 0:
                    right-=1
                else:
                    left+=1

        return result
                
                
                
                    