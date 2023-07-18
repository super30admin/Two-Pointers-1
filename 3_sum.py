
#hashset 
class Solution:
    def helper(self, nums, target):
        l=0
        h=len(nums)-1
        ans=()
        while(l<h):
            t=nums[l]+nums[h]
            if(t==target):
                x=(target*-1,nums[l],nums[h])
                ans+=(x,)
                l+=1
                h-=1
            else:
                if(nums[h]>target-nums[l]):
                    h-=1
                else:
                    l+=1
        return ans

    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        # print(nums)
        ans={}
        for i in range(len(nums)-2):
            t_ans=self.helper(nums[i+1:],nums[i]*-1)
            # print(nums[i], t_ans, len(t_ans))
            if(len(t_ans)):
                for j in t_ans:
                    ans[j]=ans.get(j,0)+1
        return ans.keys()

# Solution with breaking it into 2-sum problem
class Solution:
    def two_sum(self, nums, target):
            h=set()
            ans=set()
            for i in nums:
                c=target-i
                if(c in h):
                    ans.add((c,i))
                else:
                    h.add(i)
            # print(ans)
            return ans
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        ans=set()
        for i in range(len(nums)-2):
            t_ans=self.two_sum(nums[i+1:], -1*nums[i])
            # print(nums[i],t_ans,len(t_ans))
            if(len(t_ans)):
                for j in t_ans:
                    k=tuple(sorted(j+(nums[i],)))
                    ans.add(k)
        return ans
