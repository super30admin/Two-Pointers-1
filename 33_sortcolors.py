# S30 Big N Problem #33 {Medium}

# An array of n objects of colurs red white or blue you need to sort them in place and make sure that objects of the same colour are adjacent with the colours in the order red then white and at last blue. here we wil use integer values 0,1 and 2 to represent the color red , white and blue respectively. and you cannot use the library's sort function for this problem. 

# Time Complexity : O(n) n= no. of elements of array
# Space Complexity : O(1) 
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No 

# Approach 
# Since there are only 3 elements. 
# Our task is to put largeest nos. at end and bring smallest no. at front. 
# Maintain low and high pointers to swap the elements. 


class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        
        low=0
        high=len(nums)-1
        index=0
        
        while index<=high:
            
            if nums[index]==2:
                nums[index],nums[high]=nums[high],nums[index]
                high-=1
            elif nums[index]==0:
                print(index,low)
                nums[index],nums[low]=nums[low],nums[index]
                low+=1
                index+=1
            else:
                index+=1
                
                
            
        
            
                
        