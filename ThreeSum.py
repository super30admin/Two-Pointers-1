# Time Complexity : O(n**2) where n is the number of elements in nums, due to the sorting step and the nested loop with two pointers
# Space Complexity : O(k) where k is the number of unique triplets found, as the result stores those triplets.
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : N/A

# Your code here along with comments explaining your approach
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        #Assign the required variables
        result=[]
        n = len(nums)
        #Sort the array
        nums.sort()
        #Iterate through nums
        for i in range(0,n):
            #Eliminate the duplicates of the outer target element (First Element of the pair)
            if(i>0 and nums[i]==nums[i-1]):
                continue
            #As this is a sorted array if the first element of pair itself is greater than 0 and the next pair is obvious to make a sum of greater than 0
            if(nums[i]>0):
                break
            #Assign low and high to find second and third element
            low=i+1
            high=n-1
            while(low<high):
                target=nums[i]+nums[low]+nums[high]
                #Append the triplets to result set whose sum is 0
                if(target==0):
                    result.append([nums[i],nums[low],nums[high]])
                    low+=1
                    high-=1
                    #To remove duplcates of second element low and check for boundary condition
                    while(low<high and nums[low]==nums[low-1]):
                        low+=1
                    #To remove duplcates of third element high and check for boundary condition
                    while(low<high and nums[high]==nums[high+1]):
                        high-=1
                #If sum is less than 0, increment low
                elif(target<0):
                    low+=1
                #If sum is greater than 0, decrement high
                else:
                    high-=1
        return result
                    