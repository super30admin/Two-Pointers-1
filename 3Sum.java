/*
TC(n^2)
Approach 2 pointer by taking every elemnt as 3rd one
*/
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        if(nums == null || nums.length == 0) {
            return result;
        }
        int n = nums.length;
        int low = 0, high = n;
        Arrays.sort(nums);
        for(int i = 0; i < n - 2; i++) {
            if(i > 0 && nums[i] == nums[i-1]) {
                continue;
            }

            if(nums[i] > 0) {
                break;
            }
            low = i + 1;
            high = n - 1;

            while(low < high) {
                int sum = nums[i] + nums[low] + nums[high];

                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    low++;
                    high--;
                    while(low < high  && nums[low] == nums[low - 1]) low++;
                    while(low < high  && nums[high] == nums[high + 1]) high--;
                } else if(sum > 0) {
                    high--;
                } else {
                    low++;
                }
            }
        }

        return result;
    }
}