// Time Complexity : O(n^2)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i < nums.length-2; i++) {
            if (i!=0 && nums[i] == nums[i-1]) continue;

            int l = i + 1;
            int h = nums.length - 1;
            int currSum = 0;

            while (l < h) {
                currSum = nums[i] + nums[l] + nums[h];
                if (currSum == 0) {
                    result.add(Arrays.asList(nums[i], nums[l], nums[h]));
                    l++;
                    h--;
                    while(l < h && nums[l] == nums[l-1]) {
                        l++;
                    }
                    while(l < h && nums[h] == nums[h+1]) {
                        h--;
                    }
                } else if (currSum > 0) {
                    h--;
                } else l++;
            }
        }
        return result;
    }
}