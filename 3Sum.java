// Time Complexity : o(n^ 3)
// Space Complexity : o(n)
// Did this code successfully run on Leetcode : yes , time limit exceeded
// Any problem you faced while coding this : no

// its important to sort the contents of list in hashset containing lists inorder for .contains to work
// Your code here along with comments explaining your approach
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length == 0) {
            return new ArrayList<>();
        }
        //brute-force approach
        List<List<Integer>> result = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();
        for(int i = 0; i < nums.length; i ++) {
            for(int j = i + 1; j < nums.length; j++) {
                for(int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if(sum == 0) {
                        List<Integer> li = Arrays.asList(nums[i], nums[j], nums[k]);
                        Collections.sort(li);
                        if(!set.contains(li)) {
                            set.add(li);
                            result.add(li);
                        }
                    }
                }
            }
        }
        return result;
    }
}