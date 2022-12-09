class Solution {
    private void swap(int[] nums, int low, int high){
           int temp = nums[low];
           nums[low] = nums[high];
           nums[high] = temp;
           
     } 
   public void sortColors(int[] nums) {
       int l = 0;
       int h = nums.length - 1;
       int mid = 0;

       while(mid <= h){
           if(nums[mid] == 0){
               swap(nums,mid,l);
               l++;
               mid++;

           }
           else if(nums[mid] == 1){
               mid++;
           }
           else{
               swap(nums,mid,h);
               h--;
           }

       }




}

   }
// Approach
//TC - O(n) , SC-O(1)

//In BruteForce we can do by sorting the array. Optimisation for this is using 3 pointers. 
//low, high and mid. if my mid is 0 the swapping mid with low and incrementing mid and low. if my mid is 2 swapping mid and high by decreasing high. if my mid is 1 then incrementing mid without swapping 