"Time Complexity is O(N^2)"
"Space Complexity is O(1)"

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        result = []
        
        for i in range(len(nums) - 2):
            # Skip duplicate elements for the first number in the triplet
            if i > 0 and nums[i] == nums[i - 1]:
                continue
            
            # Two-pointer approach to find the other two numbers
            left, right = i + 1, len(nums) - 1
            while left < right:
                total = nums[i] + nums[left] + nums[right]
                if total < 0:
                    left += 1
                elif total > 0:
                    right -= 1
                else:
                    result.append([nums[i], nums[left], nums[right]])
                    # Skip duplicates for the second and third numbers in the triplet
                    while left < right and nums[left] == nums[left + 1]:
                        left += 1
                    while left < right and nums[right] == nums[right - 1]:
                        right -= 1
                    # Move pointers after finding a valid triplet
                    left += 1
                    right -= 1
                    
        return result
        