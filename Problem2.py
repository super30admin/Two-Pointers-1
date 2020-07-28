## Problem2 (https://leetcode.com/problems/3sum/)
#Time Complexity : O(n*n + n log n)
# Space Complexity : O(1) 
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

#Approach: sort the given array and loop through the array and cacluate the sum of three pointers 
#low, high and current index and append to result array if it is zero.

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        result=[]
        if len(nums)<3:
            return result
        arr=sorted(nums)
        #current=[]
        for i in range(len(arr)-2):
            if i>0 and (arr[i-1]==arr[i]):
                continue
            low=i+1
            high=len(arr)-1
            while(low<high):
                sum=arr[i]+arr[low]+arr[high]
                if sum==0:
                    current=[arr[i],arr[low],arr[high]]
                    result.append(current)
                    low+=1
                    high-=1
                    while(low<high and arr[low]==arr[low-1]):
                        low+=1
                    while(low<high and arr[high]==arr[high+1]):
                        high-=1
                elif sum<0:
                    low+=1
                else:
                    high-=1
        return result
                    
            