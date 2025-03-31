class Solution {

// Time Complexity : o(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Initially coming up with the optimum approach felt difficult   

    public void sortColors(int[] nums) {
        int start = 0;
        int mid = 0;
        int end = nums.length - 1;

        while (mid<=end){
            //If element is 0 - then swap it with start pointer and start++ & end++
            if(nums[mid] == 0){
                swap(nums,start,mid);
                start++;
                mid++;
            }    
            //if element is 1 - then no swapping and mid++
            else if(nums[mid] == 1){
                mid++;
            }    
            //if element is 2 - then swap with end and end --
            else if (nums[mid] == 2){
                swap(nums,mid,end);
                end--;
                }
            }
        }  
        //defining helper function for swapping values
        private void swap(int [] nums,int i , int j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
