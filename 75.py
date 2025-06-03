# Time O(n)
# Space O(1)
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        n = len(nums)
        zeroptr,oneptr,twoptr=0,0,n-1

        while oneptr<=twoptr:
            if nums[oneptr] == 0:
                nums[zeroptr], nums[oneptr] = nums[oneptr], nums[zeroptr]
                zeroptr += 1
                oneptr += 1
            elif nums[oneptr] == 1:
                oneptr+=1
            elif nums[oneptr] == 2:
                nums[oneptr], nums[twoptr] = nums[twoptr], nums[oneptr]
                twoptr -= 1

