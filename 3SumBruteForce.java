class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length == 0) {
            return new ArrayList<>();
        }
        HashSet<List<Integer>>s = new HashSet<>();
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                for(int k = j + 1; k < n; k++) {
                    if(nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> l = Arrays.asList(nums[i], nums[j], nums[k]);
                        Collections.sort(l);
                        s.add(l);
                    }
                }
            }
        }
        return new ArrayList<List<Integer>>(s);
    }
}