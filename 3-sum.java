class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); //nlogn


        for (int i = 0; i < n; i++) { //O(n^2)
            //outer duplicacy
            if (nums[i] > 0)
                break;
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            int left = i + 1;
            int right = n - 1;
            while (left < right) {
                int curr = nums[i] + nums[left] + nums[right];
                
                if (curr == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    //inner duplicacy
                    while (left < right && nums[left] == nums[left - 1])
                        left++;
                    while (left < right && nums[right] == nums[right + 1])
                        right--;
                } else if (curr > 0) {
                    right--;
                } else {
                    left++;
                }
            }

        }
        return new ArrayList<>(result);
    }
}

//TC: O(n^2)
//SC: O(1)