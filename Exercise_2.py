class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        # Brute Force
        # Time: O(n*n*n)
        # Space: O(1)
        
#         n= len(nums)
#         hash_table = set()
#         for i in range(n-2):
#             for j in range(i+1, n-1):
#                 for k in range(j+1, n):
#                     if nums[i] + nums[j]+ nums[k] == 0:
#                         temp_arr= [nums[i], nums[j], nums[k]]
#                         temp_arr.sort()
#                         hash_table.add(tuple(temp_arr)) 
                        
#         return hash_table
        
    
        #Sort Array
            
        #Time complexity : O(n*n)
        #Space complexity : O(1)

        n = len(nums)
        nums.sort()
        arr = []
    
        for i in range(n-2):
            
            if(nums[i] == nums[i-1] and i !=0 ):
                continue
                
            left = i+1
            right = n-1
            while(left<right):
                sum_value = nums[i]+nums[left]+nums[right]
                if sum_value == 0:
                    arr.append([nums[i], nums[left], nums[right]])
                    left += 1
                    right -=1
                    while(left<right and nums[left]==nums[left-1]):
                        left += 1
                    while(left<right and nums[right]==nums[right+1]):
                        right -= 1
                elif sum_value > 0:
                    right -=1
                else:
                    left += 1
                    
        return arr
