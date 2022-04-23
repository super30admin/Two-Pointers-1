// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

// class Solution {
//     public void sortColors(int[] nums) {
        
//         // TC O(n) SC O(1)
//        if(nums == null || nums.length ==0) return; 
        
//             int low =0;
//             int high = nums.length -1;
//             int mid = 0;

//         while (mid<= high){
            
//             if(nums[mid] == 2){
//                 swap(nums, high, mid);
//                 high--;
//             } else if(nums[mid]==0){
//                 swap(nums, mid, low);
//                 mid++;
//                 low++;
//             }else{
//                 mid++;
//             }
            
//         }
        
//      }
//     private void swap(int nums[], int i, int j){
//         int temp = nums[j];
//         nums[j] = nums[i];
//         nums[i] = temp;
//     }
    
// }


// class Solution {
    
//     //TC O(n)
//     // SC O(n)
//     public List<List<Integer>> threeSum(int[] nums) {
//         if(nums == null || nums.length ==0) return new ArrayList<>();
       
//         List<List<Integer>> mylist = new ArrayList<>();
//         Arrays.sort(nums);
//         for(int i =0;i<nums.length;i++){
//             if(i>0 && nums[i] == nums[i-1]) continue;
//             int left =i+1;
//             int right =nums.length -1;
//             while (left<right){
                
//                 int sum = nums[i] + nums[left] + nums[right];
//                 if(sum==0){
//                   List<Integer> li = Arrays.asList(nums[i], nums[left], nums[right]);
//                     mylist.add(li);
//                     left++;
//                     right--;
                    
//                     while(left<right && nums[left]==nums[left-1]){left++;}
//                     while(left<right && nums[right]==nums[right+1]){right--;}
//                 }
                
//                 else if(sum<0){
//                     left++;
                    
//                 }
                    
//                     else {
//                         right--;
                        
//                     }
//             }
//         }
        
//       return mylist;  
//     }
// }


// class Solution {
    
//     // TC O(n)
//     // SC O(1)
//     public int maxArea(int[] height) {
//         if(height == null || height.length ==0) return 0;
//         int max = 0;
//         int left = 0;
//         int right = height.length-1;
        
//         while (left < right){
//             max = Math.max(max, Math.min(height[left], height[right])*(right - left));
//             if(height[left]<height[right]){
//                 left++;
//             }else{
//                 right--;
//             }
//         }
//         return max;
//     }
// }
