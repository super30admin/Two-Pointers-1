# -*- coding: utf-8 -*-
"""
Created on Wed Dec  4 23:12:28 2019

@author: gunjan
"""

#nums=[1,8,6,2,5,4,8,3,7]

def solution(nums):
    if(len(nums)==0 or nums==[]):
        return 0
    #expected output=49
    max=0
    i=0
    j=len(nums)-1
    #keep 2 pointers and move the pointer with lower height
    while(i<j):
        h=min(nums[i],nums[j])
        a=h*(j-i)
        if (a>max):
            h1=nums[i]
            h2=nums[j]
            max=a 
        if(nums[i]>nums[j]):
            j-=1
        else:
            i+=1
    print (h1,h2,max)

solution([1,8,6,2,5,4,8,3,7])       
        
#Time Complexity=O(n)
#Space Complexity=O(n)


#brute Force Solution
nums=[1,8,6,2,5,4,8,3,7]
#expected output=49
max=0
for i in range(len(nums)-1):
    for j in range(len(nums)):    
        h=min(nums[i],nums[j])
        a=h*(j-i)
        if (a>max):
            h1=nums[i]
            h2=nums[j]
            max=a
print (h1,h2,max)            
            
#Time complexity=O(n^2)
#Space Complexity=O(n^2)

