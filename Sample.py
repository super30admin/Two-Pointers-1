# Time Complexity :O(n)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach

'''
took three pointers low, mid and high

set low and mid to 0 and high = len-1

checked if the value at mid is 0 the swapped the value at mid with alue at low so that 0 can come at the start
checked if the value at mid is 1 then moved ahead and incresed mid pointer
checked if value at mid is 2 then swapped the value at mid with the value at high and reduced high index

'''

class Solution:
    def sortColors(self, nums):
        low=0
        mid = 0
        high = len(nums)-1
        

        
        while(mid<=high):
            if(nums[mid]==0):
                nums[mid],nums[low] = nums[low],nums[mid]
                mid+=1
                low+=1
            elif(nums[mid]==1):
                mid+=1
            else:
                nums[high],nums[mid] = nums[mid],nums[high]
                high-=1
        return(nums)

#************************************************************************************

#Problem2:

# Time Complexity :O(n^2)
# Space Complexity :O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach

'''
sorting the array and setting two pointer low = i+1 and high = len-1
checking if the sum of element at i, low and high position is equal to 0 then save it in a result list
if the same numbers are repeating we ignore them and move ahead
'''

class Solution:
    def threeSum(self, nums):
        # nums= sorted(nums)
        list1=[]
        nums = sorted(nums) # sorting the array
        for i in range(len(nums)-2): # traversing the array to len-1
            if(nums[i]=>0):
                break
            # duplicate in index
            
            if(i>0 and (nums[i] == nums[i-1])): # if the two elements are the same then we continue
                continue
            low = i+1 
            high = len(nums)-1
            while(low<high):
                
                if(nums[i]+ nums[low] + nums[high])<0:
                    low+=1
                elif(nums[i]+ nums[low] + nums[high])==0: # if the sume ==0 we add it to the list
                    list1.append([nums[i],nums[low],nums[high]])
                    low+=1
                    high-=1
                    while(low<high and (nums[low]== nums[low-1])): # if the numbers are dumplicate we move ahead
                        low+=1
                    while(low<high and (nums[high+1] == nums[high])): # if the numbers are duplicate we move ahead
                        high-=1
                else:
                    high-=1
                
        return list1


#***************************************************************************************
#Problem 3

#Time Complexity :O(n)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach
'''
Taking two pointer one at 0 position and one at the end
calcuting the area between the two heights and saving it
Checking for the constraining height and moving ahead.
'''

class Solution:
    def maxArea(self, height: List[int]) -> int:
        max_area = 0
        
        if(len(height) ==0 or height == None):
            return 0
        
        low =0
        high = len(height)-1
        
        while(low<high):
            
            max_area = max(max_area, (min(height[low], height[high]))*(high-low)) # calculating the area
            if(height[low]< height[high]): # checking for the constraining height and moving the pointer accordingly
                low+=1
            else:
                high-=1
                
               
        return(max_area)


             
                
           
                
           

                
        