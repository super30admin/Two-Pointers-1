/**
nums = [0,0,1,1,2,2]
r=0
w=1
b=2

[0,0,1,1,2,2]

- array is not empty
- atleast 1 colr exist it can be any one of the color.

Solutions-
- O(nlogn) QuickSort
-
0 1 2
3 ptr
nums = [0,0,1,1,2,2]
              1 2 

[0,0,1,1,2,2]

[0,1,2]

 1 0 2
 
 [2,0,2,1,1,0]
 [0,0,1,1,2,2]
 
 TC - O(n) in the worst case where n is the length of an array.
 SC - O(1)    
**/
class Solution {
    
    public void sortColors(int[] nums) {
        
        int twoPtr = nums.length;
        int onePtr = twoPtr;
        int startPtr = 0;
        
        // base condition later
        while(startPtr != onePtr && startPtr < nums.length)
        {
            if (nums[startPtr] == 0)
            {
                startPtr++;
                continue;
            }
            
            if (nums[startPtr] == 2)
            {
                twoPtr--;
                int temp = nums[startPtr];
                nums[startPtr] = nums[twoPtr];
                nums[twoPtr] = temp;
                onePtr = twoPtr;
            }
            else
            {
                onePtr--;
                int temp = nums[startPtr];
                nums[startPtr] = nums[onePtr];
                nums[onePtr] = temp;
            }
        }
    }
}