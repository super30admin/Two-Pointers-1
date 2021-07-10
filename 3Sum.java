// Time Complexity : O(N^2) N-> No of integers in array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class 3Sum {
    public List<List<Integer>> threeSum(int[] nums) {

        if(nums == null || nums.length == 0 || nums.length == 1)
            return new ArrayList<>();

        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(nums);

        for (int i=0; i<nums.length; i++) {

            int low = i + 1, high = nums.length - 1;
            if(nums[i] > 0)  break;
            if(i != 0 && nums[i] == nums[i-1]) continue;

            while(low < high) {
                int currSum = nums[i] + nums[low] + nums[high];

                if(currSum < 0) {
                    low++;
                }
                else if (currSum > 0) {
                    high--;
                }
                else {
                    List<Integer> list = Arrays.asList(nums[i], nums[low], nums[high]);
                    res.add(list);
                    low++;
                    high--;

                    while(low < high && nums[low] == nums[low-1]) low++;
                    while(low < high && nums[high] == nums[high-1]) high--;

                }
         }
        }

        return res;

    }
}