// Time Complexity: O(n^2)
// Space complexity: O(1)

class Solution2 {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < n-2; i++) {
            if( i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            if( nums[i] > 0) {
                return result;
            }
            int left = i+1;
            int right = n-1;
            while( left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if( sum == 0) {
                    List<Integer> li = Arrays.asList(nums[i], nums[left], nums[right]);
                    result.add(li);
                    left++;
                    right--;
                    while( left < right && nums[left] == nums[left-1]) {
                        left++;
                    }
                    while( left < right && nums[right] == nums[right+1]) {
                        right--;
                    }
                } else if ( sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return result;
    }
}