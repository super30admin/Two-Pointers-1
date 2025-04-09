// Time complexity:- O(n2)
// Space complexity:- O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach in three sentences
/**
 * Approach: 
 * This problem involves finding unique triplets in the array that sum to zero.
 * I sorted the array and then used the two-pointer technique to find pairs that sum to the negative of the current element.
 * The algorithm avoids duplicates by skipping over repeated elements during both the iteration and the pointer adjustments.
 */ 
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       // Initialize the result list to store the unique triplets
       List<List<Integer>> result = new ArrayList<>();
 
       // If the array has less than 3 elements, return an empty result
       if(nums.length < 3) return result;
 
       // Sort the array to enable the two-pointer technique and avoid duplicate triplets
       Arrays.sort(nums);
 
       int n = nums.length;
 
       // Iterate over the array with 'i' as the first element of the triplet
       for(int i = 0; i < n-2; i++){
           // Skip duplicate elements to avoid duplicate triplets
           if ((i > 0) && (nums[i - 1] == nums[i])) continue;
 
           // Initialize two pointers, 'low' starting just after 'i', and 'high' at the end of the array
           int low = i + 1;
           int high = n - 1;
 
           // Use the two-pointer technique to find pairs that sum up to -nums[i]
           while (low < high){
               // Calculate the sum of the current triplet (nums[i], nums[low], nums[high])
               int sum = nums[i] + nums[low] + nums[high];
 
               // Case 1: If the sum is 0, we found a valid triplet
               if(sum == 0){
                   // Add the current triplet to the result
                   List<Integer> current = Arrays.asList(nums[i],nums[low],nums[high]);
                   result.add(current);
 
                   // Move both pointers to look for other potential triplets
                   low++; high--;
 
                   // Skip duplicate elements from the low pointer
                   while(low < high && nums[low] == nums[low-1]) low++;
 
                   // Skip duplicate elements from the high pointer
                   while(low < high && nums[high] == nums[high + 1]) high--;
               }
               // Case 2: If the sum is less than 0, move the 'low' pointer to the right
               else if (sum < 0){
                   low++;
               }
               // Case 3: If the sum is greater than 0, move the 'high' pointer to the left
               else {
                   high--;
               }
           }
       }
 
       // Return the result list containing all the unique triplets
       return result;
    }
 }
 
