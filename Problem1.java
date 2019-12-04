/***
Leet Code Submitted : YES
Time Complexity : O(N)
Space Complexity : O(1)

We are iterating the array and each elememt increasing the index of elements >= the found element such that we have grouping of the colors. This took lot of time to figure out this solution.


**/


class Solution {
    public void sortColors(int[] nums) {
        int zeroIndex  = 0;
        int firstIndex = 0;
        int secondIndex = 0;
        
        
        for(int i =0; i< nums.length; i++){
            if(nums[i] == 0){
                nums[secondIndex] = 2;
                nums[firstIndex]  = 1;
                nums[zeroIndex]   = 0;
                zeroIndex = zeroIndex + 1;
                firstIndex = firstIndex + 1;
                secondIndex = secondIndex + 1;
            }else if(nums[i] == 1){
                nums[secondIndex] = 2;
                nums[firstIndex]  = 1;
                firstIndex = firstIndex + 1;
                secondIndex = secondIndex + 1;
            }else if(nums[i] == 2){
                nums[secondIndex] = 2;
                secondIndex = secondIndex + 1;
            }
        }
        
        }
    }
