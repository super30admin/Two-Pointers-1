#3sum
# // Time Complexity : O(n^2)
# // Space Complexity : O(1) as we are returning the same list we create
# // Did this code successfully run on Leetcode : yes
# // Any problem you faced while coding this :no

      


def threeSum( nums):
    nums.sort()
    res=[]
    for i in range(len(nums)):
        if(i>0 and i<len(nums) and nums[i]==nums[i-1]):         #if the previous number is same as this one, just move to the next one
            continue
        low=i+1
        high=len(nums)-1
        while(low<high):
            if(nums[i]+nums[low]+nums[high]==0):                
                res.append([nums[i], nums[low], nums[high]])
                low+=1
                high-=1
                while(low<high and nums[low]==nums[low-1]):               #if the last left is same as new left, then keep incrementing
                    low+=1
                while(low<high and nums[high]==nums[high+1]):              #if last high is same as new high, then keep decrementing
                    high-=1
                    
            elif (nums[i]+nums[low]+nums[high] >0):                         #if the sum is greater than 0, then decrement the high pointer
                high-=1
            else:                                                               #is sum is less than 0, then increment the low pointer
                low+=1
    return res


print(threeSum([-1,0,1,2,-1,-4]))