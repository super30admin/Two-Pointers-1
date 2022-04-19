#Sort colors
# // Time Complexity : O(n)
# // Space Complexity : O(1) as we are not using any extra space
# // Did this code successfully run on Leetcode : yes
# // Any problem you faced while coding this :no

      

def sortColors( nums):
    low=0
    mid=0
    high=len(nums)-1
    while(mid<=high):
        if(nums[mid]==0):
            nums[mid], nums[low] = nums[low], nums[mid]
            low+=1
            mid+=1
        elif(nums[mid]==2):
            nums[mid], nums[high] = nums[high], nums[mid]
            high-=1
        else:
            mid+=1

#testing
nums = [2,0,2,1,1,0]
print(nums)
(sortColors(nums))
print(nums)