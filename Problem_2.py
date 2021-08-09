class Solution:
    """
    Exhaustive approach
    TC - O(n^3)
    SC - O(n)
    """

    def approach1(self, nums):
        n = len(nums)
        s = set()
        for i in range(0, n - 2):
            for j in range(i + 1, n - 1):
                for k in range(j + 1, n):
                    if nums[i] + nums[j] + nums[k] == 0:
                        d = (nums[i], nums[j], nums[k])
                        d = tuple(sorted(d))
                        s.add(d)
        return list(s)

    """
    Two pointer approach 
    TC - O(n^2)
    SC - O(1)
    """

    def approach2(self, nums):
        target, left, right = 0, 0, 0
        ans = []
        nums = sorted(nums)
        for i in range(len(nums)):
            if nums[i] > 0: break
            if i != 0 and nums[i] == nums[i - 1]: continue
            left = i + 1
            right = len(nums) - 1
            target = nums[i]
            while (left < right):
                s = target + nums[left] + nums[right]
                if s == 0:
                    ans.append([target, nums[left], nums[right]])
                    left += 1
                    right -= 1
                    while (left < right and nums[left] == nums[left - 1]): left += 1
                    while (left < right and nums[right] == nums[right + 1]): right -= 1
                elif s > 0:
                    right -= 1
                else:
                    left += 1
        return ans

    def threeSum(self, nums: List[int]) -> List[List[int]]:
        if nums is None or not nums:
            return []
        return self.approach2(nums)