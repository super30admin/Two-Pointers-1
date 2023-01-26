//two pointer
// Time Complexity :O(n^2)
// Space Complexity :O(1)

/*
 * sort the array and for each element use the two pointer
 * method to find the target. if we find a duplicate value we 
 * move forward. add the result to a arraylist.
 */

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        if(nums[n-1] < 0) return result;
        
        for(int i = 0; i < n-2; i++){
            if(nums[i] > 0) break;
            if(i > 0 && nums[i] == nums[i-1]) continue;

            int low = i+1;
            int high = n-1;
            while(low < high){
                int sum = nums[i] + nums[low] + nums[high];
                if(sum == 0) {
                    List<Integer> li = Arrays.asList(nums[i], nums[low], nums[high]);
                    result.add(li);
                    low ++;
                    high--;
                    while(low < high && nums[low] == nums[low-1]) low++;
                    while(low < high && nums[high] == nums[high+1]) high--;
                }
                else if(sum > 0) high--;
                else low++;
            }
        }
        return result;
    }
}