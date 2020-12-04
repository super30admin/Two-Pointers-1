'''
Time complexity :O(N^2)
Space complexity : O(1)
'''

class Solution:
    def threeSum(self, nums):
        lis =[]
        nums.sort()
        for i in range(len(nums)-2):
            j = i+1
            k = len(nums)-1
            
            while ( j < k):
                
                s = nums[i]+nums[j]+nums[k]
                
                if s == 0:
                    lis.append((nums[i],nums[j],nums[k]))
                    j = j+1
                    k = k-1
                    
                if s > 0:
                    k = k-1
                    
                if s < 0:
                    j = j+1
                    
        
        return list(set(lis))
                
s = Solution()
print(s.threeSum([-1,0,1,2,-1,-4]))           
            
            