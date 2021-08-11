// Time Complexity : O(n^3)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length == 0){
            return new ArrayList<>();
        }
        int n = nums.length;
        HashSet<List<Integer>> set = new HashSet<>();
        for(int i = 0; i < n - 2; i++){
            for(int j = i + 1; j < n - 1; i++){
                for (int k = j + 1; k < n; k++){
                    if(nums[i] + nums[j] + nums[k] == 0){
                        List<Integer> li = Arrays.asList(nums[i], nums[j], nums[k]);
                        Collections.sort(li);
                        set.add(li);
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }
}