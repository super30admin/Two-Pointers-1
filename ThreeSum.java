// Time Complexity : O(N^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes


// Approach: The Second Code optimizes the duplicate check that improves the Time taken from 5% to 75% on LC
//class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
//         List<List<Integer>> result = new ArrayList<>();
//         if(nums == null || nums.length == 0 || nums.length < 3){
//             return result;
//         }
        
        
//         Arrays.sort(nums);
//         for(int i = 0; i<nums.length; i++){
//             int ptr1 = i+1;
//             int ptr2 = nums.length-1;
            
            
//             while(ptr1 < ptr2){
//                 int sum = nums[i] + nums[ptr1] + nums[ptr2];
                
//                 if(sum ==0){
//                     List<Integer> list = new ArrayList<>();
//                     list.add(nums[i]);
//                     list.add(nums[ptr1]);
//                     list.add(nums[ptr2]);
//                     if(!result.contains(list)){
//                         result.add(list);
//                     }
//                     ptr1++;
//                 }
//                 else if(sum > 0){
//                     ptr2--;
//                 }
//                 else{
//                     ptr1++;
//                 }
//             }
//         }
//         return result;
//     }
// }

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length < 3) return new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; i++){
            // duplicates
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int low = i + 1;
            int high = nums.length - 1;
            while(low < high){
                int sum = nums[i] + nums[low] + nums[high];
                if(sum == 0){
                  List<Integer> myList = Arrays.asList( nums[i], nums[low], nums[high]);
                  result.add(myList);
                  low++;
                  high--;
                // duplicates 
                  while(low < high && nums[low] == nums[low-1]) low++;
                 // duplicates 
                  while(low < high && nums[high] == nums[high + 1 ]) high--;
                } else if (sum < 0){
                    low++;
                } else {
                    high--;
                }
            }
        }
        return result;
    }
}