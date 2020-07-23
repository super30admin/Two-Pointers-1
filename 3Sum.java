/*
// Time Complexity :O(n^2) + O(nlogn)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes


// Your code here along with comments explaining your approach

*/
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ret = new ArrayList<>();
        Arrays.sort(nums);
        for(int s = 0 ; s < nums.length-1; s++){
            if(s > 0 && nums[s] == nums[s-1])continue;
            int i = s+1;
            int j = nums.length-1;
            while(i < j){
                int sum = nums[i] + nums[s] + nums[j];
                if(sum > 0)
                    j--;
                if(sum < 0)
                    i++;
                if( sum == 0){
                    List<Integer> lst = new ArrayList<>();
                    lst.add(nums[s]);
                    lst.add(nums[i]);
                    lst.add(nums[j]);

                    ret.add(lst);
                    i++;j--;
                    while(i < j && nums[i] == nums[i-1]) i++;
                    while(i < j && nums[j] == nums[j+1]) j--;
                }
            }
        }
        return ret;
    }
}
