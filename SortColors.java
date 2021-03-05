class Solution {
    public void sortColors(int[] nums) {
      
        int left = 0;
        int right = nums.length - 1;
        int cur = 0;
        
        while(cur <= right ){
            //moving 0's to wards left
            if(nums[cur] == 0){
                swap(nums, cur, left);
                cur++;
                left++;
            }else if(nums[cur] == 2){ //moving 2's towards right
                swap(nums, cur, right);
                right--;
            }else{
                cur++;
            }
        }
    }
    
    public static void swap(int[] nums, int i, int j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
}
//Time Complexity : O(n)
//Space Complexity: O(1)


/* Brute Force Solution : Counting number of 0's, 1's and 2's*/
// class Solution {
//     public void sortColors(int[] nums) {
//         int ones = 0;
//         int twos = 0;
//         int zeros = 0;
//         for(int i = 0; i < nums.length; i++){
//             if(nums[i] == 0){
//                 zeros++;
//             }else if(nums[i] == 1){
//                 ones++;
//             } else if(nums[i] == 2){
//                 twos++;
//             }
//         }
        
//         for(int i = 0; i < nums.length; i++){
//             if(zeros > 0){
//                 nums[i] = 0;
//                 zeros--;
//             }else if( ones > 0){
//                 nums[i] = 1;
//                 ones--;
//             }else{
//                 nums[i] = 2;
//             }
//         }
//     }
// }