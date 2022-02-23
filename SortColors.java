// Time Complexity : O(n) n:array length
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

//Maintained 3 pointers "l" is left to make sure there are all 0's before "l" and pointer "a" has all 1's before it, r is right has all 2's after it. 


class Solution {
    public void sortColors(int[] nums) {
        int l=0;
        int r = nums.length-1;
        int a = 0;
        while(a<=r){
            if(nums[a] == 2){   //if a = 2 then we move it to right so swapping it with r and decrease r
                swap(nums,a,r);
                r--;            
            }
            else if(nums[a] == 1){ //If a = 1 we are just incrementing it
                a++;
            }
            else                //If a = 0, incrementing a and l. 
            {
                swap(nums,a,l);
                l++;
                a++;
            }
        }
    }
        void swap(int[] nums, int a, int b){
            int temp = nums[a];
            nums[a] = nums[b];
            nums[b] = temp;
        }
    
// Time Complexity : O(n) n:array length
// Space Complexity : O(1)
    //Another Approach - Maintaining the counts of every variable and at last again traverse the array and insert the elements till their count gets "0".  
//         int count0 = 0;
//         int count1 = 0;
//         int count2 = 0;
//         for(int i=0;i<nums.length;i++){
//             if(nums[i] == 0)
//                 count0++;
//             else if(nums[i] == 1)
//                 count1++;
//             else
//                 count2++;
                
//         }
//         for(int i=0;i<nums.length;i++){
//                 if(count0 == 0 && count1 == 0){
//                     nums[i] = 2;
//                 }
//                 else if(count0 == 0){
//                     nums[i]  = 1;
//                     count1--;
//                 }
//                 else{
//                      nums[i] = 0;
//                     count0--;
//                 }
                   
//         }
    }
