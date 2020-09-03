//Time complexity O(N^2)
//Time complexity O(1)
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);

        List<List<Integer>> output = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            // if curr and prev was same
            if (i != 0 && nums[i - 1] == nums[i])
                continue;

            int l = i + 1;
            int r = nums.length - 1;

            while (l < r) {

                int currSum = nums[i] + nums[l] + nums[r];

                if (currSum == 0) {
                    output.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l++;
                    r--;

                    // skipping duplicates on left
                    while (l < r && nums[l - 1] == nums[l]) {
                        l++;
                    }

                    // skipping duplicates on right

                    while (l < r && nums[r + 1] == nums[r]) {
                        r--;
                    }

                } else if (currSum < 0) {
                    l++;
                    while (l < r && nums[l - 1] == nums[l]) {
                        l++;
                    }
                } else {
                    r--;
                    while (l < r && nums[r + 1] == nums[r]) {
                        r--;
                    }
                }
            }
        }

        return output;
    }
}