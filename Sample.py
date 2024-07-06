##########11. Container With Most Water#############################################################################################################################
// Time Complexity : n
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach in three sentences only
Took left and right pointer, than found the area, now we have to move either left or right pointer we decided by comparing the height at each pointer which ever is the smallest we will move the pointer ahead and check new area and compare that area to initially calculate area. We will keep moving pointer till left crosses right	


class Solution:
    def maxArea(self, height: List[int]) -> int:
        l,r=0,len(height)-1
        area=min(height[l],height[r])*(r-l)
        while l<r:
            if height[l]<=height[r]:
                l+=1
            else:
                r-=1
            area=max(area,min(height[l],height[r])*(r-l))
        return area
        

        

#########75. Sort Colors##########################################################################################################################


// Time Complexity : n
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : I sorted the color using extra space but after lecture learnt way to sort color without using extra space

// Your code here along with comments explaining your approach in three sentences only
We have 3 pointers left, right and mid. Left will help to collect 0 mid will help to collect 1 and right will collect zero. Here mid will iterate through the loop and check if it has 0 or 2 if it has 0 than it will replace with left if 2 than replace with right or if it has 1 it will keep moving

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        l,m,r=0,0,len(nums)-1
        while m<=r:
            if nums[m]==0:
                nums[l],nums[m]=nums[m],nums[l]
                l+=1
                m+=1
            elif nums[m]==2:
                nums[r],nums[m]=nums[m],nums[r]
                r-=1
            else:
                m+=1
            print(nums)
            print(l,m,r)

        

        


#########15. 3Sum#################################################################################################################


// Time Complexity : n^2
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : I was not able to able to extra while check to be applied, I have highlighted same with *** due to which my code was going out of range. After checking the video was able to figure it out


// Your code here along with comments explaining your approach in three sentences only
We have fixed 1 element and applied 2sum on rest of elements. Firstly 0th index element is fixed and 2 sum is applied on rest than next looping though each index and applying 2sum for all other


class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        print(nums)
        #i=0
        
        l2=[]
        for i in range(len(nums)-2):
            if i>0 and nums[i]==nums[i-1]:
                continue
            l=i+1
            r=len(nums)-1
            while l<r:
                sum1=nums[i]+nums[l]+nums[r]
                #print(i,l,r)
                if sum1==0:
                    l2.append([nums[i],nums[l],nums[r]])
                    l+=1
                    r-=1
                    while l<r and nums[l]==nums[l-1]:	***
                        l+=1  
                    while l<r and nums[r]==nums[r+1]:	***
                        r-=1
                      
                elif sum1<0:
                    l+=1                    
                else:
                    r-=1
                    
                #tgt=0-nums[i]
                #result1=self.twop(nums, i+1, r, i,tgt)
        #print(l2)
        return l2
    
    '''def twop(self,nums,l,r,i,tgt):
        l1=[]
        
        return l1'''


        