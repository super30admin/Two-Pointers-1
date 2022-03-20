public class ThreeSum {
  /**
   * Leetcode: https://leetcode.com/problems/3sum/
   * 
   * Time Complexity: O(n^2) + O(nlogn)(for sorting)
   * Space Complexity: O(1)
   * Were you able to solve this on leetcode? Yes
   */
  
  public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    Arrays.sort(nums); 
    int i = 0;
    while(i < nums.length - 2){
        int num = nums[i];
        int target = 0 - num;

        int start = i+1, end = nums.length-1;
        while(start < end){
            if(nums[start] + nums[end] == target){
                List<Integer> temp = new ArrayList<>();
                temp.add(nums[start]);
                temp.add(nums[end]);
                temp.add(num);
                result.add(temp);
                start++;
                while(start < end && nums[start] == nums[start-1]){ start++; }
                end--;
            } else if(nums[start] + nums[end] < target) {
                start++;
            } else {
                end--;
            }
        }
        
        i++;
        // don't repeat with the same number in the next iteration.
        while(i < nums.length && nums[i] == nums[i-1]){ i++; }
    }
                       
    return result;
}
}
