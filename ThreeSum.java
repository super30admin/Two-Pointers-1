class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        //Ologn time and o(1) space since hashset is for output
        Arrays.sort(nums);
        Set<List<Integer>> res = new HashSet<>();

        for (int i=0; i<nums.length; i++) {

            int low = i + 1;
            int high = nums.length - 1;

            while (low < high) {

                int sum = nums[low] + nums[high] + nums[i];

                if (sum == 0) {
                    List<Integer> item = Arrays.asList(nums[low], nums[high], nums[i]);
                    res.add(item);
                    low++;
                    high--;
                } else if (sum > 0) {
                    high--;
                } else {
                    low++;
                }

            }


        }

        return new ArrayList<>(res);

    }


}