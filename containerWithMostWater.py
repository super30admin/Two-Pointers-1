# // Time Complexity : O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No


# // Your code here along with comments explaining your approach
## we use a two pointer approach to find the max water. we start our l and r pointer at two end of the array
##we move that pointer whose value is lower, because by moving it we have a higher chance of getting a higher value and hance maximising the water. 
## we either need to increase the width or increase the height, by moving the pointers together we are reducing the width so height needs to be increased to 
## get maximum water.

class solution:
    def container(Self, nums):

        l = 0
        r = len(nums)-1
        water = 0
        while l<r:

            water = max(water, min(nums[l], nums[r])*(r-l))

            if nums[l]>nums[r]:
                r-=1
            else:
                l+=1
        
        return water
