# Using Two Pointers without Hashset
#TimeComplexity:O(n)
#SpaceComplexity:O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this :No
#Used Two Pointers approach to solve the problem
class Solution:
    
    def maxArea(self, height: List[int]) -> int:
        
        low = 0
        nums = height
        high = len(nums)-1
        maxarea = 0
        while(low <= high):
                print(low,high)
                if nums[low] > nums[high]:
                    temparea = nums[high]*(high - low)
                    if temparea > maxarea:
                        maxarea = temparea
                    high = high -1
                elif nums[low]< nums[high]:
                        temparea = nums[low]*(high -low)
                        if temparea > maxarea:
                            maxarea = temparea
                        low+=1
                else:
                    temparea = nums[low]*(high - low)
                    if temparea > maxarea:
                        maxarea = temparea
                    low +=1
                    # high -=1
                # print("calc" ,temparea)
                # break
        
        print(maxarea)
        return maxarea
                    
                
            
        