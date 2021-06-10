// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :

class ThreeSum{
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);

        for(int i=0; i< n; i++){
            if(i != 0 && nums[i] == nums[i-1]) continue; // to avoid outer duplicacy
            if(nums[i] > 0) break; // optimization: at this point we will never get sum zero
            int left = i + 1;
            int right = n - 1;
            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0){
                    List<Integer> li = Arrays.asList(nums[i], nums[left],nums[right]);
                    res.add(li);
                    left++;
                    right--;
                    while(left < right && nums[left] == nums[left-1]) left++; // to avoid inner duplicacy
                    while(left < right && nums[right] == nums[right+1]) right--; // to avoid inner duplicacy
                }else if (sum < 0){
                    left++;
                } else {
                    right--;
                }
            }
        }

        return res;
    }
}