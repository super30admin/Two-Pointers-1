#Time Complexity: O(nlogn) sorting and traversing n element
#Space Complexiy : O(1)
#did your run on leetcode = yes

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        if nums == [] or nums== [0]: return []
        
        nums.sort()
        n = len(nums)
        result = []
        for i in range(n-1):
            if i > 0 and nums[i] == nums[i-1]: continue
            
            left = i + 1 
            right = n - 1
            
            while(left < right):
                current = nums[i] + nums[left] + nums[right]
            
                if current == 0:
                    li = [nums[i],nums[left],nums[right]]
                    result.append(li)
                    left +=1
                    right -=1
                    
                    while(left < right and nums[left] == nums[left - 1]): left += 1
                    while(left < right and nums[right] == nums[right + 1]): right -= 1
                elif current < 0:
                    left +=1
                    
                else: right-=1
        return result
