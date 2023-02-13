
#successfully submitted on Leetcode: yes
#TC = O(nlogn + n^2)
#SC = O(1)


class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        #[-4,-1,-1,0,1,2]
        nums.sort()
        ans = []

        for i in range(0, len(nums)):
            l = i + 1
            h = len(nums) - 1
            while l < h:
                if nums[i] + nums[l] + nums[h] == 0:
                    if [nums[i], nums[l], nums[h]] not in ans:
                        ans.append([nums[i], nums[l], nums[h]])
                    l += 1
                    h -= 1


                elif nums[i] + nums[l] + nums[h] < 0:
                    l += 1
                else:
                    h -= 1
        return ans