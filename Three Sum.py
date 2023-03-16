# Question: Since this question expects a List of List as return output, why does it accept set as an output as well in my Approach 2? Could you please tell me why that is since I could not understand that.
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        # Approach 1
        # searchset = set(nums)
        # ans = set()
        # dic = collections.defaultdict(list)
        # for i in range(len(nums)):
        #    for j in range(len(nums)):
        #        if i!=j:
        #             dic[0 - (nums[i]+nums[j])].append([i,j])
        # # print(dic)
        # for k,v in dic.items():
        #     if k in searchset:
        #         for t in range(len(nums)):
        #             if k==nums[t]:
        #                 for lst in dic[k]:
        #                     if t not in lst:
        #                         tempidx = lst + [t]
        #                         tempans = tuple(sorted([nums[i] for i in tempidx]))
        #                         # if tempans not in ans:
        #                         ans.add(tempans)
        # return ans

        # Approach 2 Hashset approach
        # Time Complexity: O(n**2)
        # Space COmplexity: O(1) Since HashSet is used to return the output

        # nums.sort()
        # # print(nums)
        # ans = set()
        # l = len(nums)
        # for i in range(len(nums)):
        #     # visit = set()
        #     if nums[i] > 0:
        #         return ans
        #     p1 = i+1
        #     p2 = l-1
        #     while p1 < p2:
        #         summ = nums[p1] + nums[p2]
        #         if summ > (0 - nums[i]):
        #             p2 -= 1
        #         elif summ < (0 - nums[i]):
        #             p1 += 1
        #         else:
        #             ans.add(tuple(sorted([nums[i],nums[p1],nums[p2]])))
        #             # ans.append([nums[i],nums[p1],nums[p2]])
        #             p1 += 1
        #             p2 -= 1

        # return ans

        # Approach 3 Two sum without hashset approach
        # Time complexity: O(n**2)
        # Space complexity: O(1)
        nums.sort()
        ans = []
        l = len(nums)
        for i in range(len(nums)):
            if i > 0 and nums[i] == nums[i - 1]: continue
            if nums[i] > 0:
                return ans
            p1 = i + 1
            p2 = l - 1

            while p1 < p2:
                temp = [nums[i], nums[p1], nums[p2]]
                summ = nums[i] + nums[p1] + nums[p2]
                if summ < 0:
                    p1 += 1
                elif summ > 0:
                    p2 -= 1
                else:
                    ans.append(temp)
                    p1 += 1
                    p2 -= 1
                    while p1 < p2 and nums[p1] == nums[p1 - 1]: p1 += 1
                    while p1 < p2 and nums[p2] == nums[p2 + 1]: p2 -= 1
        return ans
