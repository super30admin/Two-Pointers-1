# // Time Complexity : O(N^3)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this :


# // Your code here along with comments explaining your approach

#Brute Force Approach

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        if nums == None or len(nums) < 3:
            return []
    
        result = list(list())
        hashSet = set()
        for i in range(len(nums)-2):
            for j in range(i+1,len(nums)-1):
                for k in range(j+1,len(nums)):
                    sum = nums[i] + nums[j] + nums[k]
                    if(sum == 0):
                        li = [nums[i] , nums[j] , nums[k]]
                        sortedList = sorted(li)
                        sortedTuple = tuple(sortedList)
                        if sortedTuple not in hashSet:
                            hashSet.add(sortedTuple)
                            result.append((list(sortedTuple)))
        return result


# // Time Complexity : O(N)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this :

# Two pointer after sorting the list
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        if nums == None or len(nums) < 3:
            return []
    
        # sort the nums list first
        nums = sorted(nums)
        n = len(nums)
        result = list(list())
        hashSet = set()
        for i in range(len(nums)-2):
            low = i + 1
            high = n - 1
            # outside duplicacy
            if i != 0 and nums[i] == nums[i-1]:
                continue
            #logic
            while(low<high):
                threeSum = nums[i] + nums[low] + nums[high]
                
                # move the low and high and check internal duplicacy
                if threeSum == 0:
                    li = [nums[i] , nums[low] , nums[high]]
                    result.append(li)
                    low += 1
                    high -= 1
                    
                    #internal duplicacy
                    while low < high and nums[low] == nums[low-1]:
                        low += 1
                    while low < high and nums[high]== nums[high+1]:
                        high -= 1    
                        
                #move the low to right    
                elif threeSum < 0:
                    low += 1
                    
                #move the high to left    
                else:
                    high -= 1
           
        return result

                
        