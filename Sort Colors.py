# Time: O(N)
# Space: O(1)

class Solution:
    def sortColors(self, nums):
        print(nums)

        left, current, right = 0, 0, len(nums) - 1

        while current < right:
            if nums[current] == 0:
                nums[current], nums[left] = nums[left], nums[current]
                current += 1
                left += 1
            elif nums[current] == 1:
                current += 1
            else:
                nums[current], nums[right] = nums[right], nums[current]
                right -= 1

        print(nums)


if __name__ == "__main__":
    print(Solution().sortColors([2,0,2,1,1,0]))
    print(Solution().sortColors([2,0,1]))
    print(Solution().sortColors([1,0,1]))
    print(Solution().sortColors([2,0,2]))