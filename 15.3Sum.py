#Time Complexity : O(N^2)
#Space compleity : O(1)
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()  # Sort the array in ascending order
        n = len(nums)
        result = []

        for i in range(n - 2):
            if i > 0 and nums[i] == nums[i - 1]:
                continue  # Skiping outside duplicates

            target = -nums[i]
            left = i + 1
            right = n - 1

            while left < right:
                total = nums[left] + nums[right]

                if total < target:
                    left += 1
                elif total > target:
                    right -= 1
                else:
                    result.append([nums[i], nums[left], nums[right]])

                    # Skiping inside duplicate elements
                    while left < right and nums[left] == nums[left + 1]: #Whenever base case variables are changing, like left+=1 or right-=1, check the base case again (i<r)
                        left += 1
                    while left < right and nums[right] == nums[right - 1]:
                        right -= 1

                    left += 1
                    right -= 1

        return result
