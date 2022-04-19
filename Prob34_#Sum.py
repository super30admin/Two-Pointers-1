#Time Complexity : 0(n)
#Space Complexity : O(1)
#Did this code successfully run on Leetcode : yes
#Any problem you faced while coding this : no

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        s = sorted(nums)        
        output = set()
        for k in range(len(s)):
            target = -s[k]
            i,j = k+1, len(s)-1
            while i < j:
                sum_two = s[i] + s[j]
                if sum_two < target:
                    i += 1
                elif sum_two > target:
                    j -= 1
                else:
                    output.add((s[k],s[i],s[j]))
                    i += 1
                    j -= 1
        return output