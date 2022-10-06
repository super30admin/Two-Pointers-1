#Time Complexity: O(n)
#Space Complexity: O(1)
#Did it run on leetcode: Yes

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        def swap(index1, index2):
            nums[index1], nums[index2] = nums[index2], nums[index1]
            return
        n = len(nums)
        l,r = 0,0
        #one pass for zeroes
        while r < n and l<n:
            if nums[l] == 0 and nums[r] == 0:
                l+=1
                r +=1
                continue
            if nums[l] == 0:
                l+= 1
                continue
            else:
                if nums[r] == 0:
                    swap(l,r)
                    l+=1
                else:
                    r+=1
        r = l
        #one pass for ones
        while r < n and l<n:
            if nums[l] == 1 and nums[r] == 1:
                l+=1
                r +=1
                continue
            if nums[l] == 1:
                l+= 1
                continue
            else:
                if nums[r] == 1:
                    swap(l,r)
                    l+=1
                else:
                    r+=1
        r = l
        #one pass for twos
        while r < n and l<n:
            if nums[l] == 2 and nums[r] == 2:
                l+=1
                r +=1
                continue
            if nums[l] == 2:
                l+= 1
                continue
            else:
                if nums[r] == 2:
                    swap(l,r)
                    l+=1
                else:
                    r+=1