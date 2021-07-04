# Time Complexity :O(n^2)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no


# Your code here along with comments explaining your approach
class Solution:
    def threeSum(self, nums):
        sol = []
        nums.sort()
        #for each element in nums
        for i in range(len(nums)):
            # if it is a number that is not a 0 or a -ve number leave the loop
            if nums[i] > 0:
                break
            #if duplicate pass it
            if i>0 and nums[i] == nums[i-1]:
                continue
            left = i+1
            right = len(nums) - 1
            target = -nums[i]
            # make a two some search in rest of array
            while left<right:
                if nums[left]+ nums[right] == target:
                    sol.append([nums[i],nums[left],nums[right]])
                    #pass all duplicates and keep the while loop condition
                    while left<right and nums[left] == nums[left+1]:
                        left+=1
                    #pass all duplicates and keep the while loop condition
                    while left < right and nums[right] == nums[right-1]:
                        right -=1
                    left +=1
                    right -=1
                    continue
                if(nums[left]+ nums[right] ) > target:
                    right-=1
                elif(nums[left]+ nums[right] ) < target:
                    left+=1
        return sol