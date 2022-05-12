//Time Complexity: O(n^2)
//Space Complexity:constant
//Did this code successfully run on Leetcode :Yes

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Map<Integer, Integer> map = getMapWithPos(nums);
        Set<List<Integer>> items = new HashSet<>();
        Set<Integer> hs1 = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!hs1.add(nums[i]))
                continue;
            Set<Integer> hs2 = new HashSet<>();
            for (int k = i + 1; k < nums.length; k++) {
                if (!hs2.add(nums[k]))
                    continue;
                int n3 = -nums[i] - nums[k];
                Integer pos = map.get(n3);
                if (pos != null && pos > k) {
                    List<Integer> list = new ArrayList<>(3);
                    list.add(nums[i]);
                    list.add(nums[k]);
                    list.add(nums[pos]);
                    Collections.sort(list);
                    items.add(list);
                }
            }
        }
        return new ArrayList<>(items);
    }
    private Map<Integer, Integer> getMapWithPos(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            if (!map.containsKey(nums[i]))
                map.put(nums[i], i);
        }
        return map;
    }
}
