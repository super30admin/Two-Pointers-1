# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

#Using Dutch National Flag Algorithms

# Lo := 1; Mid := 1; Hi := N;
# while Mid <= Hi do
# Invariant: a[1..Lo-1]=0 and a[Lo..Mid-1]=1 and a[Hi+1..N]=2; a[Mid..Hi] are unknown.
# case a[Mid] in
# 0: swap a[Lo] and a[Mid]; Lo++; Mid++
# 1: Mid++
# 2: swap a[Mid] and a[Hi]; Hi--


class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n = len(nums)
        l,m,r = 0,0,n-1
        while m <= r:
            if nums[m] == 0:
                nums[m],nums[l] = nums[l],nums[m]
                l+=1
                m+=1
            elif nums[m] == 1:
                m+=1
            else:
                nums[r],nums[m] = nums[m],nums[r]
                r-=1