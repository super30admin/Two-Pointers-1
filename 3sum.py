'''
Sort the input array to enable efficient two-pointer traversal.
Iterate through each number a in the array, and for each a, use two pointers (l and r) to find pairs such that a + nums[l] + nums[r] == 0.
Skip duplicate values for both the main element and within the two-pointer loop to avoid duplicate triplets in the result.

Time Complexity: O(n2)
Space Complexity: O(1)
'''
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        result = []
        nums.sort()

        for i, a in enumerate(nums):
            if i > 0 and a == nums[i-1]:
                continue
            
            l = i+1
            r = len(nums) -1
            while l < r:
                threeSum = a + nums[l] + nums[r]

                if threeSum > 0:
                    r-=1
                elif threeSum < 0:
                    l+=1
                else:
                    result.append([a, nums[l], nums[r]])
                    l+=1
                    while l < r and nums[l] == nums[l-1]:
                        l+=1
        
        return result
