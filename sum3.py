class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        
        # TC O(n^2) = O(nlogn) + O(n^2)
        if nums is None or len(nums) == 0:
            return []
        n = len(nums)
        nums.sort()
        result = []
        for i in range(n):
            if nums[i] > 0:
                break
            if i != 0 and nums[i] == nums[i-1]:
                continue
            low = i +1
            high = n - 1
            while ( low < high):
                sums = nums[i] + nums[low]+ nums[high]
                if sums == 0:
                    result.append([nums[i] , nums[low],nums[high]] )
                    low += 1
                    high -= 1
                    while( low < high) and (nums[low] == nums[low -1]):
                        low += 1
                    while( low < high) and (nums[high] == nums[high + 1]):
                        high -= 1
                    
                
                elif sums > 0:
                    high -= 1
                else:
                    low += 1
        return result
        
        
         # Brute force TC O(n^3) Time limit exceeded
#         n = len(nums)
#         sets =set()
#         mainli = []
#         for i in range(n-2):
#             for j in range(i+1, n-1):
#                 for k in range(j+1, n):
#                     if nums[i] + nums[j]+ nums[k] == 0:
#                         li = [nums[i] , nums[j],nums[k]]
#                         li.sort()
#                         # mainli.append(li)
#                         sets.add(tuple(li))
      
#         for i in sets:
#             mainli.append(list(i))
#         return mainli
                    
