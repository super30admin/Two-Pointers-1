# Two-Pointers-1

## Problem1 (https://leetcode.com/problems/sort-colors/)
 class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        if (nums == None or len(nums)==0):
            return []
        low =0 
        high = len(nums)-1
        mid =0
        while (mid<=high):
            if(nums[mid]==2):
                self.swap(nums,mid,high)
                high -= 1
            elif(nums[mid]==0):
                self.swap(nums,low,mid)
                mid += 1
                low +=1
            else:
                mid +=1
        
        return
    
    def swap(self,nums,i,j):
        nums[i],nums[j]=nums[j],nums[i]

## Problem2 (https://leetcode.com/problems/3sum/)

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        if (nums == None or len(nums) < 3):
            return []

        nums.sort()                         
        final_list = []

        for i in range(0, len(nums) - 2):
            if (i > 0 and nums[i] == nums[i - 1]):  
                continue
            low = i + 1
            high = len(nums) - 1
            while (low < high):
                currentSum = nums[i] + nums[low] + nums[high]

                if (currentSum == 0):                                      
                    final_list.append([nums[i], nums[low], nums[high]])
                    low += 1
                    high -= 1
                    while (low < high and nums[low] == nums[low - 1]):      
                        low += 1
                    while (low < high and nums[high] == nums[high + 1]):
                        high -= 1
                elif (currentSum > 0):                                      
                    high -= 1
                else:                                                       
                    low += 1

        return final_list

        


## Problem3 (https://leetcode.com/problems/container-with-most-water/)
class Solution:
    def maxArea(self, height: List[int]) -> int:
        if len(height)<2 or height ==0:
            return 0
        l = 0
        r = len(height)-1
        maxi =0
        while(l<r):
            curr =  min(height[l],height[r])*(r-l)
            maxi = max(curr,maxi)
            if(height[l]<=height[r]):
                l=l+1
            else:
                r=r-1
        return maxi

