class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        low=0
        mid=0
        high=len(nums)-1
        while(mid<high):
            if nums[mid]==1:
                mid+=1
            if nums[mid]==2:
                nums[mid],nums[high]=nums[high],nums[mid]
                high-=1
            
            if nums[mid]==0:
                nums[low],nums[mid]=nums[mid],nums[low]
                low+=1
                mid+=1
 time complexity is O(n)
 space is O(1)

if len(nums) == 1 or nums == None:
            return nums
        p0 = curr = 0
        p2 = len(nums)-1
        while p2<=curr: # stopping condition, curr has entered the last phase of the list
            # here array index out of is taken care by while condition :
            # because p2 is the end of the array and curr is start
            # p1 : curr will always keep incrementing and be equal or more than p1
            # p2  : condition breaks when p2>curr, this also works when we have minimum two elements
            if nums[curr]==0:
                nums[curr],p0 = p0,curr # constant space [something like temp implcitly used ]
                p0+=1 # we move towards right
                #curr+=1 ( optional)
            elif nums[curr] == 2:
                nums[curr],p2 = p2,nums[curr]
                p2-=1 # we move towards left
            else: # nums[curr] == 1
                curr+=1  # Array index out of bound error when we have [1], hence initial if conditions at the top necessary
            print(nums)
