#Time Complexity: O(n log n)
#Space Complexity:O(n^2)
#Submit on leetcode: Yes


class Solution:
    def threeSum(self, nums: list[int]) -> list[list[int]]:
        if len(nums) <= 2:
            return []

        three_sum = set()
        nums = sorted(nums)

        for i in range(len(nums) - 2):
            start = i + 1
            end = len(nums) - 1

            while start < end:
                total_sum = nums[i] + nums[start] + nums[end]

                if total_sum == 0:
                    three_sum.add(tuple(sorted([nums[i], nums[start], nums[end]])))
                    start += 1
                    end -= 1

                elif total_sum < 0:
                    start += 1

                else:
                    end -= 1

        return three_sum

sol = Solution()
nums = [-1,0,1,2,-1,-4]
result = sol.threeSum(nums)
print(result)


