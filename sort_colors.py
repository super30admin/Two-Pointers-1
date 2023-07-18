class Solution:
    def swap(self, nums, a, b):
        t=nums[a]
        nums[a]=nums[b]
        nums[b]=t

    def extra_space_solution(self, nums):
        # has both hashset and hashmap Solution
        # h={0:0,1:0,2:0}
        h=[0,0,0]
        for i in nums:
            h[i]+=1
            # h[i]=h.get(i,0)+1
        for i in range(h[0]):
            nums[i]=0
        for i in range(h[0],h[1]+h[0]):
            nums[i]=1
        for i in range(h[1]+h[0],h[1]+h[0]+h[2]):
            nums[i]=2
        print(nums)

    def no_auxilary_space_solution(self, nums):
        l=0
        mid=0
        n=len(nums)
        h=n-1

        while(mid<=h):
            if(nums[mid]==0):
                # self.swap(nums, l,mid)
                nums[l],nums[mid]=nums[mid],nums[l]
                mid+=1
                l+=1
            else:
                if(nums[mid]==1):
                    mid+=1
                else:
                    # self.swap(nums, mid, h)
                    nums[mid],nums[h]=nums[h],nums[mid]
                    h-=1
                    # mid+=1

    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        #using extra storage
        # self.extra_space_solution(nums)
        #No auxilary space solution
        self.no_auxilary_space_solution(nums)
        