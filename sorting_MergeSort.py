class Solution:
    def sortColors(self, nums):
        
        print("SPLITTING OF THE LIST", nums)
        
        if len(nums) > 1:
            mid = len(nums) // 2
            lefthalf = nums[:mid]
            righthalf = nums[mid:]

            self.sortColors(lefthalf)
            self.sortColors(righthalf)

            print("MERGING OF THE LIST")

            i = 0; j = 0; k = 0
            while i < len(lefthalf) and j < len(righthalf):
                if lefthalf[i] < righthalf[j]:
                    nums[k] = lefthalf[i]
                    i += 1
                else:
                    nums[k] = righthalf[j]
                    j += 1
                k += 1

            while i < len(lefthalf):
                nums[k] = lefthalf[i]
                i += 1
                k += 1

            while j < len(righthalf):
                nums[k] = righthalf[j]
                j += 1
                k += 1

            print("Merging the list", nums)

nums = [2,0,2,1,1,0]
r = Solution()
r.sortColors(nums)

print(nums)