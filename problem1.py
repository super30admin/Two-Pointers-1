#timecomplexity O(n)
#spacecomplexity O(1)
#desc: l for 0 value
#h for 2 value
#mid for 1 value
#mid is 1 keep incrimenting mid++
#if mid=2 swap mid and h index value and decriment h--
#if mid 0 swap mid and l index value and incriment mid and l++(why we are incrimenting mid here also)
#case when we are not incrimenting mid in case mid==0: at that point L get incrimented and mid stays at same index
# to overcome this mid should always >= then l.

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        
        """
        if nums==[] or len(nums)==0: return []
        l=mid=0
        h=len(nums)-1
        while mid<=h:
            if nums[mid]==1:
                mid+=1
            elif nums[mid]==2:
                nums[mid],nums[h]=nums[h],nums[mid]
                h-=1
            else:
                nums[mid],nums[l]=nums[l],nums[mid]
                mid+=1
                l+=1
                
        return nums      
    