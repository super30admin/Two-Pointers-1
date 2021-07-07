
#time complexity = O(NlogN) for sorting and O(N) for iterating
#space complexity =O(N)
#passed the test cases.



class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        nums=sorted(nums)
        result=[]
        for l in range(0,len(nums)-2):
            i=l+1
            r=len(nums)-1
            while i<r and i>l:
                a=nums[l]+nums[r]+nums[i]        
                if a>0:
                    r-=1
                elif  a<0:
                    i+=1
                else:
                    a=[nums[l],nums[i],nums[r]]
                    result.append(a)
                    while i<r and  nums[i+1]==nums[i]:
                        i=i+1
                    i=i+1
                    while r>i and nums[r-1]==nums[r]:
                        r=r-1
                    r=r-1
                    
        return list(set(map(tuple,result)))