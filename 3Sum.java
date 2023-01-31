class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length == 0) {
            return new ArrayList<>();
        }

        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        if(nums[n - 1] < 0) {
            return result;
        }
        for(int i = 0; i < n - 2; i++) {
            if(nums[i] > 0) {
                break;
            }
            if(i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int low = i + 1;
            int high = n - 1;
            while(low < high) {
                int sum = nums[i] + nums[low] + nums[high];
                if(sum == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[low]);
                    list.add(nums[high]);
                    result.add(list);
                    low++;
                    high--;
                    while(low < high && nums[low] == nums[low - 1]) {
                        low++;
                    }
                    while(low < high && nums[high] == nums[high + 1]) {
                        high--;
                    }
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