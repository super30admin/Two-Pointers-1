# Time complexity : O(n^2)
# Space complexity : O(1)
# Leetcode : Solved and submitted

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        # brute force solution 
        n = len(nums)
        
        if n == 0:
            return []
        res = []
        # sorting the list using in-built function which has a time complexity of nlogn
        nums.sort()
        
        # traversing the list from first element until n-2, as we are looking for triplets
        for i in range(n-2):
            # positive numbers can't be added to give a sum which is 0, so eliminating those options
            if nums[i] > 0 : break
            # check for outside duplicates
            # checking for boundary and also if the elements are same, if so then we just increment the value of i
            if i!=0 and nums[i] == nums[i-1]:
                continue
            # setting the pointers low and high
            low = i + 1
            high = n - 1
            
            # traversing the list until both the pointers does not cross each other
            # calculate the val of 3 elements and check if it is the target which is 0, if it is then we add the triplets to the resulting list
            # and increment the low and decrement the high pointer
            while low < high:
                val = nums[i] + nums[low] + nums[high]
                if val == 0:
                    temp = [nums[i],nums[low],nums[high]]
                    res.append(temp)
                    low += 1
                    high -= 1
                # to avoid duplicate pairs of values, we increment the low and high pointer until we get a new value other than the current one
                    while low < high and nums[low] == nums[low-1]:
                        low += 1
                    while low < high and nums[high] == nums[high+1]:
                        high -= 1
                # to eliminate the exhaustive choices, we move the pointers based on the value of the sum calculated
                elif val > 0:
                    high -= 1
                else:
                    low += 1
                    
        return res
