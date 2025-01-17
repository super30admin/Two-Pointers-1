############# Three Sum ############

# Time Complexity : O(n^2)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Using every element as the target perform two sum on the remaining elements using two pointers

def three_sum(nums):
        if not nums:
            return []
            
        nums.sort()
        result = []
        for i in range(len(nums)-2):
            if i > 0 and (nums[i] == nums[i - 1] or nums[i] > 0):
                continue
                
            target = -nums[i]
            l = i+1
            r = len(nums)-1
            
            while l < r:
                curr_sum =nums[l]+nums[r]
                if curr_sum > target:
                    r-=1
                elif curr_sum < target:
                    l+=1
                else:
                    triplet = [-target, nums[l], nums[r]]
                    result.append(triplet)
                    while l < r and nums[l] == nums[l + 1]: 
                        l += 1
                    while l < r and nums[r] == nums[r - 1]:  
                        r -= 1
                    l+=1
                    r-=1
        return result
