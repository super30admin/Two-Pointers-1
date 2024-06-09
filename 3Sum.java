class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length == 0) {
            return new ArrayList<>();
        }

        int i = 0;
        ArrayList<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        while(i < nums.length - 1) {
            while(i < nums.length - 1 && i > 0 && nums[i] == nums[i - 1]) {
                i++;
            }
            int L = i + 1;
            int R = nums.length - 1;
            while(L < R) {
                int sum = nums[i] + nums[L] + nums[R];
                if(sum == 0) {
                    list.add(Arrays.asList(nums[i], nums[L], nums[R]));
                    L++;
                    R--;
                    while(L < nums.length - 1 && nums[L] == nums[L - 1]) {
                        L++;
                    }
                    while(R > 0 && R != nums.length - 1 && nums[R] == nums[R + 1]) {
                        R--;
                    }
                } else if(sum > 0) {
                    R--;
                } else {
                    L++;
                }
            }
            i++;
        }
        return list;
    }
}
