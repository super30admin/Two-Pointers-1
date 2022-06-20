# Time Complexity : O(n^2)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this :No
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums=sorted(nums)
        print(nums)
        result=set()
        n=len(nums)
        for i in range(n):
            # if nums[i] has become more thans zero and list is sorted that means it cannot be zero
            if nums[i]>0:
                break
            # soto remove outer(i loop) duplicates 
            if i>0 and nums[i]==nums[i-1]:
                continue
            x=0-nums[i]
            j=i+1
            k=n-1
            
            while j<k:
                two_sum= nums[j]+nums[k]
                if two_sum == x:
                    triplet=[nums[i],nums[j],nums[k]]
                    result.add(tuple(triplet))
                    j=j+1
                    k=k-1
#                    To remove internal duplicacy
                    while j<k and nums[j]==nums[j-1]:
                        j+=1
                    while j<k and nums[k]==nums[k+1]:
                        k-=1
                elif two_sum<x:
                    j+=1
                else:
                    k-=1
                
        return result