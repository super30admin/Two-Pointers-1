class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        i = 0
        answer = []
        nums.sort()
        while (i < len(nums) - 2):   
            l = i+1
            r = len(nums) - 1
            
            while l < r:
                if nums[l] == nums[l+1]:
                    l+=1
                    continue
                if nums[r-1] == nums[r]:
                    r-=1
                    continue
                sum = nums[l] + nums[i] + nums[r]
                if sum == 0:
                    arr = [nums[i], nums[l], nums[r]]
                    if arr not in answer:
                        answer.append(arr)
                    l+=1
                    r-=1
                elif sum < 0:
                    l += 1
                else:
                    r -= 1
            i+=1
        return answer
                    
        