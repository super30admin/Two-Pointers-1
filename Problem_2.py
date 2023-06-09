"""
Problem : 2

Time Complexity : O(n^2)
Space Complexity : O(1)

Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No


sorting the input array, in order to store the result triplet in chronological order in order
to avoid duplicates. Iterating over each element once and performing two sum approach to
get remaining two elements which results to an addition of zero
"""

# Three sum


# Using two pointers
class Solution(object):
    def threeSum(self, nums):

        res=[]
        n=len(nums)
        nums.sort()

        for i in range(n-2):
            if nums[i]>0:
                break
            if nums[i]==nums[i-1] and i>0:
                continue
            l=i+1
            r=n-1
            while l<r:
                summ=nums[i]+nums[l]+nums[r]
                if summ==0:
                    li=[nums[l],nums[r],nums[i]]
                    res.append(li)
                    l+=1
                    r-=1
                    while(l<=r and nums[l]==nums[l-1]):
                        l+=1
                    while(l<=r and nums[r]==nums[r+1]):
                        r-=1

                elif summ>0:
                    r=r-1
                else:
                    l+=1
        return res


        
# Using hashing
class Solution(object):
    def threeSum(self, nums):
        res=set()
        for i in range(len(nums)):
            target=-nums[i]
            dct={}
            for j in range(0,len(nums)):
                diff=target-nums[j]

                if diff in dct and i!=j and i!=dct[diff]:
                    newarr=[diff,nums[j],nums[i]]
                    newarr.sort()
                    res.add(tuple(newarr))
                else:
                    dct[nums[j]]=j
        return res


        


# Using bruteforce approach
class Solution(object):
    def threeSum(self, nums):

        res=set()

        for i in range(len(nums)):
            for j in range(i+1,len(nums)):
                for k in range(j+1,len(nums)):
                    if nums[i]+nums[j]+nums[k]==0:
                        arr=[nums[i],nums[j],nums[k]]
                        arr.sort()
                        res.add(tuple(arr))
        return res