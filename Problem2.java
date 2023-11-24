// Time Complexity : O(N^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :
//perform two sum problem by fixing i. So for each each i perform 2 sum problem
//and extract possible solutions

// Your code here along with comments explaining your approach
class Problem2 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0; i<nums.length-1; i++){
            int first = i+1;
            int last = nums.length-1;
            if(i!=0 && nums[i]==nums[i-1]) continue;
            while(first < last){

                if(nums[i]+nums[first]+nums[last] == 0){
                    list.add(new ArrayList(Arrays.asList(nums[i],nums[first]
                            ,nums[last])));
                    while(first<last && nums[last] == nums[last-1]) last--;
                    while(first<last && nums[first] == nums[first+1]) first++;
                    first++;
                    last--;

                } else if(nums[i]+nums[first]+nums[last] > 0){
                    last--;
                } else {
                    first++;
                }
            }
        }
        return list;
    }
}
