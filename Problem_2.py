class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        if not nums:
            return []
        result = []
        nums.sort()
        n = len(nums)
        for i in range(0, n-2):
            if nums[i] > 0:
                break
            if i > 0 and nums[i] == nums[i-1]:
                continue
            a = nums[i]
            b = i+1
            c = n-1
            while b < c:
                summ = a+nums[b]+nums[c]
                if summ == 0:
                    result.append([a, nums[b], nums[c]])
                    b += 1
                    c -= 1
                    while b < c and nums[b] == nums[b-1]:
                        b += 1
                    while b < c and nums[c] == nums[c+1]:
                        c -= 1
                elif summ < 0:
                    b += 1
                elif summ > 0:
                    c -= 1
        return(result)
