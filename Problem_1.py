"""
Problem : 1

Time Complexity : O(n)
Space Complexity : O(1)

Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No

taking a count list, which counts the number of occurences of the 0,1 and 2 in the input array
then hovering over entire counter array and placing the respective numbers in the order of
their magnitude

"""

# Sort Colors

# Approach - 1
# without using pointers, but without extra space

class Solution(object):
    def sortColors(self, nums):

        count=[0,0,0]

        for i in nums:
            count[i]+=1
        index=0

        for i in range(len(count)):
            counter=count[i]
            while counter>0:
                nums[index]=i
                counter-=1
                index+=1

# Approach -2 
# using three pointers

class Solution(object):
    def sortColors(self, nums):

        if nums==None or len(nums)==0:
            return 0

        l,mid,h=0,0,len(nums)-1

        while mid<=h:
            if nums[mid]==2:
                self.swap(nums,mid,h)
                h-=1
            elif nums[mid]==0:
                self.swap(nums,mid,l)
                l+=1
                mid+=1
            else:
                mid+=1


    def swap(self,nums,i,j):
        temp=nums[i]
        nums[i]=nums[j]
        nums[j]=temp