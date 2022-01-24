#Time Complexity = O(n)
#Space Complexity = O(n)

def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        dic={}
        for i in nums:
            if(i in dic):
                dic[i]+=1
            else:
                dic[i]=1
        c = 0

        for i in [0,1,2]:
            if(i in dic):
                while(dic[i]!=0):
                    nums[c] = i
                    dic[i]-=1
                    c+=1