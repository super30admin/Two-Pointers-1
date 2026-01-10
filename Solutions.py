Problem1 (https://leetcode.com/problems/sort-colors/)
Time Complexity : O(n)
Space Complexity : O(1)


## we need to collect 0 at the start
## 1 in the mid 
## 2 in the end
## so we can have three different pointers, check if the value is 2 replace
## check if the value is 0, replace from low , increment pointers
## else just increment mid

class Solution(object):
    def sortColors(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        low,high = 0,len(nums)-1
        mid = 0

        while mid<=high:
            if nums[mid] == 2:
                nums[mid],nums[high] = nums[high],nums[mid]
                high-=1
            elif nums[mid] == 0:
                nums[mid],nums[low] = nums[low],nums[mid]
                low+=1
                mid +=1
            else:
                mid+=1





Problem2 (https://leetcode.com/problems/3sum/)
Time Complexity : O(n^2)
Space Complexity : O(1)


## sort the array so that we can manipulate left and right pointer
## for removing the duplicates, we can move i until it remains the same
## choose the l and r, check the sum, if sum ==0 add
## move left if sum <0
## move right if sum > 0 

class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        res = []
        nums.sort()
        for i in range(len(nums)-1):
            if i>0 and nums[i] == nums[i-1]:
                continue
        
            l = i+1
            r = len(nums)-1
            while l<r:
                
                sum_ = nums[i] + nums[l] + nums[r]
                if sum_<0:
                    l+=1
                elif sum_ >0:
                    r-=1
                else:
                    res.append([nums[i],nums[l],nums[r]])
                    l+=1
                    r-=1
                    while(l < r and nums[l] == nums[l - 1]): 
                        l+=1
                    while(l < r and nums[r] == nums[r + 1]): 
                        r-=1
        
        return res



Problem3 (https://leetcode.com/problems/container-with-most-water/)
Time Complexity : O(n)
Space Complexity : O(1)

class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
       ## initialize left and right
       ## check for water stored
       ## replace with max 
       ## reduce or increase pointers

        l=0
        r=len(height)-1
        cur_area = max_area =0  
        while(l<r):

            cur_area = min(height[r],height[l]) * (r-l)
            max_area = max(max_area,cur_area)

            if height[l] > height[r]:
                r-=1
            else:
                l+=1

        return max_area