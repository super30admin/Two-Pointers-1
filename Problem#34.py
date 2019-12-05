# -*- coding: utf-8 -*-
"""
Created on Wed Dec  4 20:16:55 2019

@author: gunjan
"""
#2-pointer approach works only for sorted array
#input=[-1,0,1,2,-1,-4]
#Expected output = [[-1, -1, 2], [-1, 0, 1]]

###Two pointer approach

def solution(input):

    nums=sorted(input) #sorted array [-4,-1,-1,0,1,2]
    
    if(nums==[] or len(nums)<3):
        return 0
    
    answer=[]
    for i in range(len(nums)-2):
        #print nums[i]
        
        if((nums[i]==nums[i-1]) and i>0): # if 2 consecutive nos are same, same result will come-removes duplicates
            continue
        
        if(nums[i]>0): # if we reach a no greater than target - we can break the loop-wont find any more combinations
            break
        pt1=i+1 #low pointer
        pt2=len(nums)-1 #high pointer
        
        while(pt1<pt2) :   
            if((nums[i]+nums[pt1]+nums[pt2])<0): # sum<0 - increase left pointer (since its a sorted array)
                pt1+=1
            
            elif((nums[i]+nums[pt1]+nums[pt2])>0): # sum>0 - decrease right pointer
                pt2-=1
            
            elif((nums[i]+nums[pt1]+nums[pt2])==0): # sum=0 - inc left and right pointer by 1
                answer.append([nums[i],nums[pt1],nums[pt2]])
                pt1+=1
                pt2-=1
            
    return answer

solution([-1,0,1,2,-1,-4])

#Time Complexity=O(n^2) - for loop and while loop
#Space Complexity=O(1)


#other checks for duplicates
#1. set(solution) #to remove duplicates
#2. -1 in input       


#Brute force approach 

def solution2(nums):
    if(nums==[] or len(nums)<3):
        return 0
    
    answer2=[]
    for i in range(len(nums)-2):
        for j in range(i+1,len(nums)-1):
            for k in range(j+1,len(nums)):
                sum=nums[i]+nums[j]+nums[k]
                if(sum==0):
                    x=sorted([nums[i],nums[j],nums[k]])
                    if x not in answer2:
                        answer2.append(x)
    return answer2
solution2([-1,0,1,2,-1,-4])

#Time Complexity=O(n^3) - for loop and while loop
#Space Complexity=O(n^3)


