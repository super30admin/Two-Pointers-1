#Time Complexity: O(n*2)
#Space Complexity: O(1)

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        i = 0
       
        lst = []
        nums.sort()
        while i<len(nums)-2:
            if i!=0 and nums[i] == nums[i-1]:
                i += 1
                continue
            j = i+1
            k = len(nums)-1
            while j<k:
                
                if nums[i] +nums[j]+nums[k] == 0:
                    lst.append([nums[i],nums[j],nums[k]])
                    j += 1
                    k -= 1
                    while j<k and nums[j] == nums[j-1]:
                        j += 1
                    while j<k and nums[k] == nums[k+1]:
                        k -= 1
                    
                elif nums[i] + nums[j] + nums[k] < 0:
                    j += 1
                    
                else:
                    k -=1
                    
            i += 1
                    
        return lst