//Time complexity: O(n^3)
//Space complexity: O(n)
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null) {
            return null;
        }
        List<List<Integer>> result = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                for(int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if(sum == 0) {
                        List<Integer> list = Arrays.asList(nums[i], nums[j], nums[k]);
                        Collections.sort(list);
                        if(!set.contains(list)) {
                            result.add(list);
                            set.add(list);
                        }
                    }
                }
            }
        }
        return result;
    }
}