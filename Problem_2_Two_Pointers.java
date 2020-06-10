// Time complexity - O(n^2)
// Space complexity - O(1)

// Two pointers approach. If sum < 0, increase low pointers else decrease high pointer.

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums.length < 3) return result;
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = 0; i < n-2; i++){
           if ((i > 0) && (nums[i - 1] == nums[i])) continue; // Optimization condition
           int low = i + 1;
           int high = n - 1;
           while (low < high){
               int sum = nums[i] + nums[low] + nums[high];
               // case 1 sum = 0 
               if(sum == 0){
                   List<Integer> current = Arrays.asList(nums[i],nums[low],nums[high]); 
                   result.add(current);
                   low++; high--;
                   // Optimization condition
                   while(low < high && nums[low] == nums[low-1]) low++;
                   while(low < high && nums[high] == nums[high + 1]) high--;
               }
               // case 2 sum < 0
               else if (sum < 0){
                   low++;
               }
                // case 3 sum > 0
               else {
                   high--;
               }
           }
       }
       return result;
    }
}
