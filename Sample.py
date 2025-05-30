#Time Complexity : O(N)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
#  a three pointer approach one pointer at beginning, one at end.. and one pointer iterating through the array elements 

    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        left = 0
        right = len(nums) - 1
        mid = 0 

        while mid <= right:

            if nums[mid] == 0:

                self.swap(left,mid,nums)
                mid +=1 
                left+=1

            elif nums[mid] == 1:
                mid +=1

            else:
                self.swap(right,mid,nums)
                right-=1
                
    def swap(self,place1,place2,nums):

        temp = nums[place1]
        nums[place1] = nums[place2]
        nums[place2] = temp
    
#Time Complexity : O(N)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
#  a two pinter approach, from beginning and end.. and calculating maxwidth at each point 
        
def maxArea(self, height: List[int]) -> int:
        left = 0 
        right = len(height) - 1
        mymax = 0

        while left < right:

            width = right - left
            mymax = max(mymax, width * min(height[left],height[right]))

            if height[left] < height[right]:
                left+=1
            else:
                right-=1
        return mymax


    
#Time Complexity : O(N)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
#  iterating through each element in array.. while following two pointer aapproach similar to twosum for rest of the array 

 def threeSum(self, nums: List[int]) -> List[List[int]]:
        res = []
        nums.sort()
        for i in range(len(nums)):
            if i == 0 or nums[i] != nums[i-1]:
                self.twosum(i,res,nums)
        return res

    def twosum(self,i,res,nums):

        lo = i+1
        hi = len(nums) -1
        target = 0- nums[i]

        while lo < hi:

            mynum = nums[lo] + nums[hi]

            if target == mynum:
                res.append([nums[i],nums[lo],nums[hi]])
                lo += 1
                hi -=1
            
                while nums[lo] == nums[lo-1] and lo < hi:
                    lo +=1
                while nums[hi] == nums[hi+1] and lo< hi:
                    hi-=1
            
            elif mynum < target:
                lo +=1
            else:
                hi-=1

