#time Complexity : O(n*n)
#space Complexity :O(n)
#we are sorting the input first and then we select 1 element and find the other pair for the the given element 

class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        nums.sort()
        #creating set so that we only add a triplet once
        r=set()
        for i in range(0,len(nums)):
            j=i+1
            k=len(nums)-1
            while j< k:
                if (nums[i]+nums[j]+nums[k])==0:
                    r.add((nums[i],nums[j],nums[k]))
                    j=j+1
                    k=k-1
                    
                elif (nums[i]+nums[j]+nums[k])>0:
                    k=k-1
                elif (nums[i]+nums[j]+nums[k])<0:
                    j=j+1
        return r
                        
            
                