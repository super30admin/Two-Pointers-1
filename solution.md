# Problem 1
## Time Complexity :
O(logn)

## Space Complexity :
O(1)

## Did this code successfully run on Leetcode :
Yes.
## Any problem you faced while coding this :
No. 

## Your code here along with comments explaining your approach
### Solution:
        class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        # Initializing low, mid and high
        low = 0
        mid = 0
        high = len(nums)-1
        # Edge case
        if len(nums)!=0:
            # Making sure, mid is always equal to or lesser than high
            while(mid<=high):
                # Case 1 - Value of mid is equal to 0
                if nums[mid]==0:
                    #Swapping mid and low values
                    nums[mid],nums[low]=nums[low],nums[mid]
                    #Incrementing mid and low index
                    mid+=1
                    low+=1
                # Case 2 - Value of mid is equal to 1
                elif nums[mid]==1:
                    # Incrementing mid index
                    mid+=1
                # Case 3 - Value of mid is equal to 2
                else:
                    #Swapping mid and high values
                    nums[mid],nums[high]=nums[high],nums[mid]
                    #Decrementing high index
                    high-=1
 # Problem 2
## Time Complexity : 
O(log   n)

## Space Complexity :
O(1)

## Did this code successfully run on Leetcode :
N/A

## Any problem you faced while coding this :
No. 

## Your code here along with comments explaining your approach
### Solution:
        class Solution:
            def threeSum(self, nums: List[int]) -> List[List[int]]:
                result = []
                nums=sorted(nums)
                if len(nums)<3:
                    return result
                else:
                    for i in range(len(nums)-2):
                        if nums[i]>0:
                            break
                        #Checking for duplicate
                        if(i>0 and nums[i]==nums[i-1]):
                            continue
                        low = i+1
                        high = len(nums)-1
                        #Checking condition so low is less than high
                        while(low<high):
                            sum = nums[i]+nums[low]+nums[high]
                            #Adding the numbers if the sum equals 0
                            if sum==0:
                                result.append([nums[i],nums[low],nums[high]])
                                low+=1
                                high-=1
                                #Avoiding duplicates
                                while(low<high and nums[low]==nums[low-1]):
                                    low+=1
                                while(low<high and nums[high]==nums[high+1]):
                                    high-=1
                            elif sum<0:
                                low+=1
                            else:
                                high-=1
                    return result

 # Problem 3
## Time Complexity : 
O(logn)

## Space Complexity :
O(1)

## Did this code successfully run on Leetcode :
Yes.

## Any problem you faced while coding this :
No. 

## Your code here along with comments explaining your approach
### Solution:
        class Solution:
            def maxArea(self, height: List[int]) -> int:
                if len(height)==0:
                    return 0
                #initializing pointers
                max_area=0
                low=0
                high=len(height)-1
                #checking to make sure low doesnot overlap high
                while(low<high):
                    #logic to find highest area
                    max_area = max(max_area,min(height[low],height[high])*(high-low))
                    if height[low]<=height[high]:
                        low+=1
                    else:
                        high-=1
                return max_area
