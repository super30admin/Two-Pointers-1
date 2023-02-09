#All TC on leetcode passed

class Solution:

    #Here we use 3 pointer l- keeping track of 0, h- kepping track of 2 and m- to keep track of current num. 
    #If we find 2 then we swap nums at m & h and decrement h. If we find 0 we swap nums at m & l and increment l & m. 
    #If we find 1 we increment m.
    #Time complexity - O(n)
    #Space complexity - O(1) 
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        l=0
        h=len(nums)-1
        m=0

        while m<=h:
            if nums[m]==2:
                nums[m], nums[h] = nums[h], nums[m]
                h-=1
            elif nums[m]==0:
                nums[m], nums[l] = nums[l], nums[m]
                l+=1
                m+=1
            else:
                m+=1
        return nums


        