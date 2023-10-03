#Time Complexity : O(nlogn) + O(n * n) = O(n^2) 
                  #sorting    2pointer and iteration
#Space Complexity : O(1) since we are not using any extra space
#Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this :No

#Approach: We iterate through nums list and apply two sum for the remaining elements of the array. To implement two sum we use
# two pointer technique for otimized solution. First we sort the array. To handle the duplicates, we dont need to sort the triplets, 
# instead we move the pointers until we find a unique element. The for loop used, ends if we find an element in the list that 
# is > 0 or we reach n-2 element. We also move the i pointer until we find a unique element. 

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        result = []
        n = len(nums)
        nums.sort()
        for i in range(n-2):
            if nums[i] > 0: break
            if i>0 and nums[i] == nums[i-1]: continue
            l = i+1
            r = n-1
            while l<r:
                summ = nums[i] + nums[l] + nums[r]
                if summ == 0:
                    result.append([nums[i], nums[l], nums[r]])
                    l += 1
                    r -= 1
                    while l<r and nums[l] == nums[l-1]: l += 1
                    while l<r and nums[r] == nums[r+1]: r -= 1
                elif summ < 0:
                    l += 1
                else:
                    r -= 1
        return result