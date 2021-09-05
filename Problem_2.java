// Time Complexity : O(n2)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// select one and and do the 2 sum on the rest and save the answers
// Your code here along with comments explaining your approach
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if( nums == null || nums.length == 0) return new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for( int i = 0; i < nums.length -1; i++){
            // outside duplicacy
            if( i > 0 && nums[i] == nums[i-1]) continue;
            int low = i+1; int high = nums.length - 1;
            while( low < high ){
                int sum = nums[i] + nums[low] + nums[high];
                if( sum == 0){
                    List<Integer> ls = Arrays.asList(nums[i], nums[low], nums[high]);
                    ans.add(ls);
                    high--; low++;
                    // inside duplicacty
                    while( low < high && nums[low] == nums[low-1]) low++; // low
                    while( low < high && nums[high] == nums[high+1]) high--; // high
                }else if( sum > 0){
                    high--;
                }else{
                    low++;
                }
            }
        }
        return ans;
    }
}