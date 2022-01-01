"""
Approach

1. first we sort the array so that we can approach the problem with the help of 2 pointers technique
2. after sorting, we iterate through each number and find if there are any 2 numbers whose sum equals 0
3. we point the low pointer to the number after the current number and hight to the last number
4. if the sum of these three pointer equals zero then we increment high and decreament low so that we find different numbers
5. if the sum is less than 0 we increament low
6. if the sum is greater then we decreament high

"""


# Time Complexity : O(nlog(n)+n2) = O(n2)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes	
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        result = []
        n = len(nums)
        if n<3:
            return result
        nums.sort()
        for i in range(n-2):
            if ((i>0) and (nums[i-1]==nums[i])):
                continue
            low = i+1
            high = n-1
            while(low<high):
                threeSum = nums[i]+nums[low]+nums[high]
                if (threeSum==0):
                    result.append([nums[i],nums[low],nums[high]])
                    low+=1
                    high-=1
                    while(low<high and nums[low]==nums[low-1]):
                        low+=1
                    while(low<high and nums[high]==nums[high+1]):
                        high-=1
                elif(threeSum<0):
                    low+=1
                else:
                    high-=1
                
        return result      