"""
Solution 1 3 pointers: low, mid(starting at low), high 
Here mid pointer is not like Binary Search middle. rather an iterator over the array
seeing at the middle elements. 
IMPORTANT: mid++ when we find '0' as we don't want mid to lag behind low. 
if mid ==2:
    swap(high,mid)
    high --
else curr==0:
    swap(low,mid)
    low++
    mid++ 
else curr == 1
    mid++

Time COmplexity: O(N)
Space Complexity: O(1)
"""
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        low = 0 
        mid = 0
        high = len(nums)-1
        
        while mid<=high:

            if nums[mid] == 0:
                # swap low with mid
                temp = nums[low]
                nums[low] = nums[mid]
                nums[mid] = temp
                low+=1
                mid+=1
            elif nums[mid] == 2:
                # swap high with mid
                temp = nums[high]
                nums[high] = nums[mid]
                nums[mid] = temp
                high-=1
            else:
                mid+=1
            
"""
Solution 2: 3 pointers: low, mid(starting at high), high 
Here mid pointer is not like Binary Search middle. rather an iterator over the array
seeing at the middle elements. 
IMPORTANT: mid-- when we find '2' as we don't want mid to lag behind high. 
if mid ==2:
    swap(high,mid)
    high --
    mid--
else curr==0:
    swap(low,mid)
    low++ 
else curr == 1
    mid--

Time COmplexity: O(N)
Space Complexity: O(1)
"""
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        low = 0 
        mid = len(nums)-1
        high = len(nums)-1
        
        while mid>=low:

            if nums[mid] == 0:
                # swap low with mid
                temp = nums[low]
                nums[low] = nums[mid]
                nums[mid] = temp
                low+=1
        
            elif nums[mid] == 2:
                # swap high with mid
                temp = nums[high]
                nums[high] = nums[mid]
                nums[mid] = temp
                high-=1
                mid-=1

            else:
                mid-=1
            
            