# // Time Complexity : O(n)
# // Space Complexity :O(1)
# // Did this code successfully run on Leetcode : yes   
# // Any problem you faced while coding this : no


# // Your code here along with comments explaining your approach
# intiution is to maintain 3 pointers 1st element is constant and 2nd and last element 
# based on sum value move left pointer to center or right pointer to center
 

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        answer = []
        for i in range(len(nums)-2):
            if nums[i] > 0 :
                break
            
            if i > 0 and nums[i] == nums[i-1]:
                continue
            l = i + 1
            r = len(nums) - 1

            while l < r :
                total = nums[i] + nums[l] + nums[r]

                if total < 0 :
                    l += 1
                elif total > 0:
                    r -= 1
                else:
                    triplet = [nums[i],nums[l],nums[r]]
                    answer.append(triplet)
                    while l < r and nums[l] == triplet[1]:
                        l += 1
                    while l < r and nums[r] == triplet[2]:
                        r -= 1
        return answer
