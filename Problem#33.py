# -*- coding: utf-8 -*-
"""
Created on Wed Dec  4 19:29:56 2019

@author: gunjan
"""


##################################
###########Method1:
#################################
#input=[2,0,2,1,1,0]
#expected output=[0,0,1,1,2,2]

#swap function
def swap(x,y):
    temp=x
    x=y
    y=temp
    return(x,y)

#solution function
def solution(nums):

    if(len(nums)==0):  #edge case
        return 0
    
    low=0
    mid=0
    high=len(nums)-1
    
    
    while(mid<=high):
        if(nums[mid]==0):  #case 1
            nums[mid],nums[low]=swap(nums[mid],nums[low])
            mid+=1
            low+=1
        
        elif(nums[mid]==1): #case 2
            mid+=1
        
        elif(nums[mid]==2):  #case 3
            nums[mid],nums[high]=swap(nums[mid],nums[high])
            high-=1
    
    print nums   

 
solution([2,0,2,1,1,0])
solution([0,1,0,2,2,2,0,2,1,1,0])


##################################
#Time Complexity=O(n)
#Space Complexity= 
#################################
