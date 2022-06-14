class Solution:
    def threeSum(self, nums):
        if nums is None or len(nums) < 3:
            return []

        n = len(nums)
        nums.sort()
        result = list()

        for i in range(n):
            if i > 0 and nums[i] == nums[i - 1]:
                continue
            if nums[i] > 0:
                break
            low, high = i + 1, n - 1

            while low < high:
                s = nums[i] + nums[low] + nums[high]
                if s == 0:
                    li = [nums[i], nums[low], nums[high]]
                    result.append(li)
                    low += 1
                    high -= 1

                    while low < high and nums[low] == nums[low - 1]:
                        low += 1
                    while low < high and nums[high] == nums[high + 1]:
                        high -= 1
                elif s < 0:
                    low += 1
                else:
                    high -= 1
        return result


if __name__ == '__main__':
    obj = Solution()
    print(obj.threeSum([-1, 0, 1, 2, -1, -4]))

# TC = O(n^2) . nlog(n) for sorting and at every place in the array we are performing two pointer O(n)
# Space complexity : O(1). Constant
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : None
