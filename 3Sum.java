// Time Complexity : O(n log n) + O(n^2) = O(n^2) where n is number of elements in array.
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length == 0) return new ArrayList<>();

        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> out = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(i>0 && nums[i] == nums[i-1]) continue;
            if(nums[i]>0) break;
            int l = i+1;
            int h = n-1;
            while(l<h){
                int sum = nums[i]+nums[l]+nums[h];
                if(sum == 0){
                    List<Integer> l1 = Arrays.asList(nums[i], nums[l], nums[h]);
                    out.add(l1);
                    l++;
                    h--;
                    while(l<h && nums[l]==nums[l-1]){
                        l++;
                    }
                    while(l<h && nums[h]==nums[h+1]){
                        h--;
                    }
                }
                else if(sum<0){
                    l++;
                } else {
                    h--;
                }
            }
        }
        return out;
    }
}