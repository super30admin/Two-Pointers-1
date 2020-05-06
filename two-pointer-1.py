#Problem 1: Sort colors
#Time Complexity: O(n)
#Space Complexity: O(1)
#Did this code successfully run on leetcode: yes

'''
Brute force:
Find all the red ones, append to an array, then find all the white ones, append to an array, find the blue ones, append to array.
Or just count an recreate (two pass)
'''
'''
Main idea: Have two pointers ,one representing where to put the next red (initialized at 0), one representing where to put the next
blue (initialized at n-1). And we go through the array, if we encouter a blue one, we swap the element with the pointer for blue, and update
the pointer. Same for color red. Until we go past the blue pointer
'''


class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        #edge case
        if not nums:
            return
        red,blue,i=0,len(nums)-1,0
        #smaller and equal because it is possible that the pointer of
        #blue points on a red, so i need to be able to reach it
        while i<=blue:
            if nums[i]==0:
                nums[i],nums[red]=nums[red],nums[i]
                red+=1
                i+=1
                #it's not possible that the element we swap with red
                #is red because everything that i went through is sorted
                #so if nums[red] was red, I would've picked it before
                #and red would be red+1
            elif nums[i]==2:
                nums[i],nums[blue]=nums[blue],nums[i]
                blue-=1
                #it is possible that the one that we swapped
                #with blue is a red, so we don't want to skip
                #by incrementing i
            else:
                i+=1


#Problem 2: 3Sum
#Time Complexity: O(n^2)
#Space Complexity: O(1)
#Did this code successfully run on leetcode: yes

'''
Brute force:
for i, for j , for k... , test all the triplets, and then check unicity
'''
'''
Main idea:
We sort the array (good idea since the time complexity of sorting probably won't exceed the optimal
solution with a problem with n^3 brute force solution). For each element we point a pointer directly
after that element and another pointer at the end of the list. If the sum is >0, we decrese the right pointer
(since we want a smaller sum), if sum <0 we increase the left pointer. if it's equal, we append.
Let's not forget to skip the duplicates to not add too many times. Also if the next index is the same element,
we skip it to avoid duplicate.
'''

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        #edge case
        if len(nums)<3:
            return []
        #don't forget to sort
        nums.sort()
        res=[]
        #n-2 since the last triplet will be found before that (when index is n-3)
        for i in range(len(nums)-2):
            #to make sure we don't have duplicates
            if i!=0 and nums[i]==nums[i-1]:
                continue
            left=i+1
            right=len(nums)-1
            while left<right:
                if nums[i]+nums[left]+nums[right]==0:
                    res.append([nums[i],nums[left],nums[right]])
                    left+=1
                    right-=1
                    #to make sure we don't have the same value
                    while left<right and nums[left]==nums[left-1]:
                        left+=1
                    while left<right and nums[right]==nums[right+1]:
                        right-=1
                elif nums[i]+nums[left]+nums[right]>0:
                    right-=1
                else:
                    left+=1
        return res



#Problem 3: Container with most water
#Time Complexity: O(n)
#Space Complexity: O(1)
#Did this code successfully run on leetcode: yes

'''
Brute force: test all combination and take the max area
'''
'''
Main idea:  Sorting in the case wouldn't be doable because we lose track of the x axis.
We could keep a max variable. One pointer points to each side (starts at 0, len(nums)-1)
One thing to notice here is that if the next element is smaller, there's no point to test it
since the area will obviously be bigger previously. So we can move the smallest side until it finds something bigger, then
test if it's better. There's also no point in moving the biggest part because it won't affect the height
of the rectangle and only decrease the area. So always move the smallest part for a possibility of bigger area.
'''
class Solution:
    def maxArea(self, height: List[int]) -> int:
        #edge case
        if not height:
            return 0
        left=0
        right=len(height)-1
        max_area=float("-inf")

        while left<right:
            area=(right-left)*min(height[right],height[left])
            max_area=max(max_area,area)

            #we always move the smallest side
            if height[right]<height[left]:
                right-=1
            else:
                left+=1
        return max_area
