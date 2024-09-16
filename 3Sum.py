#Time Complexity : O(n*n)

#Space Complexity : If result is not considered as extra space then O(1) 

#Did this code successfully run on Leetcode : Yes

#Any problem you faced while coding this :None

# =============================================================================
# Solution: Sort the array first, now take 3 pointers current,start and end. start is at current +1 and end at last index.
#Now check if sum of elements at these position make sum of 0, if yes return the elements if not check id=f sum is >0 then decrement end else increment start
#Duplicate Check - if element and next element are equal then increment your pointer.
# =============================================================================

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        l1 = []
        l2 = []
        if(nums is None or len(nums) == 0):
            return l1
        nums.sort()
        for i in range(0,len(nums)-2):
            if(i == 0 or nums[i] > nums[i-1]):
                start = i+1
                end = len(nums) - 1
                while(start < end):
                    if(nums[i] + nums[start] + nums[end] == 0):
                        l2.append(nums[i])
                        l2.append(nums[start])
                        l2.append(nums[end])
                        l1.append(l2)
                        l2 = []
                        start += 1
                        end -= 1
                        while(start < end and nums[start] == nums[start-1]):
                            start += 1
                        # currend = end
                        while(start < end and nums[end] == nums[end+1]):
                            end -= 1
                    elif(nums[i] + nums[start] + nums[end] < 0):
                        start += 1
                    else:
                        end -= 1  
        return l1

