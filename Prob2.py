# Time Complexity - O(n^2)
# Space Complexity - O(1)
# Did this work on Leetcode - Yes
# Explain your logic in few word-
# We converted the 3Sum problem into a 2Sum, by sorting the array and then iterating over entire array from left to right and each element, using element+target as the new target with the rest of the array on the right hand side.
# Also, in order to get rid of duplicates, while iterating, if arr[cur]==arr[curr-1] we simply move ahead and not do 2sum calculation again. - This is to take care of outer duplicacy cases.
# Also, if arr[cur]>0, then end the iteration, since target is 0 in this problem, 0 can't be achieved by 3 positive numbers
# Then, within 2sum, we solve it using 2 pointer approach. 
# If sum<0 low++, if sum>0 high--
# If sum==0, add 3 elements to the res array, low--,high++. Also, if arr[low]==arr[low-1] we simply move ahead and not do 2sum calculation again for arr[low] and if arr[high]==arr[high+1] we simply move ahead and not do 2sum calculation again for arr[high] - This is to take care of inner duplicacy cases.

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        res=[]
        n=len(nums)
        for i in range(n-2):
            if i!=0 and nums[i]==nums[i-1]: continue #Outer duplicacy case
            low=i+1
            high=n-1
            if nums[i]>0: break  #0 can't be achieved by 3 positive numbers
            while low<high:
                sum=nums[i]+nums[low]+nums[high]
                if sum==0:
                    res.append([nums[i],nums[low],nums[high]])
                    low+=1
                    high-=1
                    #Below - Inner duplicacy case 
                    while low<high and nums[low]==nums[low-1]: #check while loop condition again since low and high were altered in line 26,27
                        low+=1
                    while low<high and nums[high]==nums[high+1]: #check while loop condition again since low and high were altered in line 26,27
                        high-=1 #No need to check, while loop will take care here
                elif sum<0:
                    low+=1
                else:
                    high-=1
        return res

