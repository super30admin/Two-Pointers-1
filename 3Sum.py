# 15. 3Sum (https://leetcode.com/problems/3sum/)

# Approach: 2-pointer approach. We have used a 2-pointer apporach in this one. So the very first requirement to do that is the array should be sorted. So we first sort the array. Then we check for the triplets in the sorted array.

# Now in this we will maintain two pointers, low and high, which will be incremented/decremented depending on the following conditions.
# Sum = nums[i] + nums[low] + nums[high] where i points to the element before low in the begining.
# 1) summ == 0. Sum found! Add to the result and inc low and dec high
# 2) summ < 0. Sum is lower than 0. Inc low
# 3) Sum > 0. Sum is higher tha 0. Dec high

# Time complexity: O(nlogn) + O(n^2) = O(n^2)
# Time complexity: O(1)

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
            n = len(nums)
            result = []
            if nums == None or n == 0:
                return result
            
            nums.sort()
            
            # Why upto n-2? Because 3 elements
            for i in range(n-2):
                
                # No point in going ahead as the array is sorted
                if nums[i] > 0:
                    break
                
                # Skipping the same element
                if (i > 0 and nums[i] == nums[i-1]):
                    continue
                
                low = i+1
                high = n-1
                
                while(low < high):
                    summ = nums[i] + nums[low] + nums[high]
                    
                    if summ == 0:
                        result.append([nums[i], nums[low], nums[high]])
                        low += 1
                        high -= 1
                        
                        # Avoid duplicacy
                        while low < high and nums[low] == nums[low-1]:
                            low += 1
                        while low < high and nums[high] == nums[high+1]:
                            high -= 1
                        
                    elif summ < 0:
                        low += 1
                    else:
                        high -= 1
            return result
                