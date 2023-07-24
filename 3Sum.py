class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        output=[]
        len_nums= len(nums)
        for x in range(0, len_nums-2):
            if x!=0 and nums[x]==nums[x-1]:
                continue

            low= x+1
            high= len_nums-1
            target= 0- nums[x]
            while(low<high):
                total= nums[low]+ nums[high]
                if total== target:
                    output.append([nums[x], nums[low], nums[high]])
                    while high>low and nums[low]==nums[low+1]:
                        low+=1
                    while high>low and nums[high]== nums[high-1]:
                        high-=1

                    low+=1
                    high-=1
                elif total> target:
                    high-=1
                elif total<target:
                    low+=1
        return output
                            