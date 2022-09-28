class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        
        # A two pointer appraoch with sorting the array
        nums = sorted(nums)
        result = []
        
        for i in range(len(nums)):
            left = i + 1
            right = len(nums) - 1
            
            # If the same value repeats then skip it because we already have the pairs for it
            if (nums[i] == nums[i-1]) and i != 0:
                continue
            
            # Two pointer after getting the first value
            while left < right:
                summation = nums[i] + nums[left] + nums[right]
                
                if summation == 0:
                    li = [nums[i], nums[left], nums[right]]
                    result.append(li)
                    left += 1
                    right -= 1
                    
                    # Check here if the same value repeats because nums[i] is the same and if nums[left] is repeated then we need to change it because then it will be same combinations
                    while (nums[left] == nums[left - 1]) and (left < right):
                        left += 1
                elif summation<0:
                    left += 1
                else:
                    right -= 1
        return result
    
    # Time Complexity: O(n^2). Actually it will be O(nlogn) (sorting) + O(n^2) (two loops)
    # Space Complexity: O(1). Because no extra space is used over here
                    