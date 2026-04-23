# // Time Complexity : O(nlogn + n^2) => O(n^2)
# // Space Complexity : sorting takes O(n) 
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : I was trying to do twosum with just rest of the array and taregt as 0-nums[i]. 
# It was hard to get to the point where I should try and form the result set of 3 numbers while handling 2 sum, instead of just getting the 2 nums other than i and then figuring out to remove duplicates. 

class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        resultset=[]
        nums.sort()
        i=0
        while i<len(nums):
            if nums[i]>0: break
            if i!=0 and nums[i-1]==nums[i]:
                i+=1
            else:
                start=i+1
                end=len(nums)-1
                while start< end:
                    s=nums[i]+nums[start]+nums[end]
                    if s==0:                        
                        resultset.append([nums[i],nums[start],nums[end]])
                        start+=1
                        end-=1
                        while start<end and nums[start]==nums[start-1]:
                            start+=1
                    elif s <0:
                        start+=1
                    else:
                        end-=1
                i+=1

        return resultset