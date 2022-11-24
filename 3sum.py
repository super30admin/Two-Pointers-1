class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        
        ## T.C = O(n.n)
        ## S.C = O(1)
        
        nums.sort()
        
        k = 0
        n = len(nums)
        res = []
        
        while k < n:
            if k-1 >= 0 and nums[k-1] == nums[k]:
                k += 1
                continue
            
            i, j = k + 1, n - 1
            
            while i < j:
                if nums[k] + nums[i] + nums[j] == 0:
                    res.append([nums[k], nums[i], nums[j]])
                    i += 1
                    j -= 1
                    
                    while i < j and nums[i-1] == nums[i]:
                        i += 1
                    
                    while i < j and nums[j] == nums[j+1]:
                        j -= 1
                
                elif nums[k] + nums[i] + nums[j] < 0:
                    i += 1
                
                else:
                    j -= 1
            
            k += 1

        return res