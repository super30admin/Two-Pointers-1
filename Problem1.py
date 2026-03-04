#Sort Colors

#O(n) time complexity
#O(1) space complecity
#Logic -> Have 3 ointers, left, mid and right. if mid is 2, replace with right pointer and move right pointer by 1 on left. 
# If mid is 1 move mid pointer by 1 to right. If mid is 0 replace it with left and move both left and pointers 
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        leftPointer = 0
        midPointer = 0
        rightPointer = len(nums)-1

        while midPointer <=rightPointer:
            numleft = nums[leftPointer]
            numRight = nums[rightPointer]
            numMid = nums[midPointer]
            if numMid == 2:
                nums[midPointer] = numRight
                nums[rightPointer] = numMid
                rightPointer-=1
            elif numMid == 1:
                midPointer+=1
            else:
                nums[midPointer] = numleft
                nums[leftPointer] = numMid
                leftPointer+=1
                midPointer+=1



