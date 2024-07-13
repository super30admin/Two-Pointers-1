#My solution involves two nested loops. The outer loop runs through the entire list, while the inner loop compares each element with all the elements that come after it. If I find a pair where the earlier element is greater than the later one, I swap them. This process continues until all elements are in the correct order. While this method isn't the most efficient for large lists, it's straightforward and gets the job done for smaller inputs. I know there are more optimized solutions like the Dutch National Flag algorithm specifically for this problem, but I wanted to start with a basic sorting approach that I'm comfortable with.


class Solution:
    def sortColors(self, nums: List[int]) -> None:
        n=len(nums)

        for i in range(n - 1):
            for j in range(i + 1, n):
                if(nums[i] > nums[j]):
                    nums[i], nums[j] = nums[j], nums[i]