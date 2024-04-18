// Time Complexity : O(N log N) for sorting + O(n^2) for nested iteration ~ O(N^2)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :had to go through video once.
class 3Sum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> resultArray = new ArrayList<>();
        for(int i = 0; i < nums.length-2; i++) {
            if(i != 0 && nums[i] == nums[i-1]) continue;
            int low = i+1, high = nums.length-1;
            if(nums[i] > 0) break;
            while(low < high) {
                int sum = nums[i] + nums[low] + nums[high];
                if(sum == 0) {
                    resultArray.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    low++;
                    high--;
                    while(low < high && nums[low] == nums[low-1]) {
                        low++;
                    }
                    while(low < high && nums[high] == nums[high+1]) {
                        high--;
                    }

                } else if(sum > 0) {
                    high--;
                } else {
                    low++;
                }
            }
        }
        return resultArray;
    }
}