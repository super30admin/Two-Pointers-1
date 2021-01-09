/*

TC: O(n^2logn) because we are first sorting it and then we are iterating array twice to find the complement
of sum
SC: O(n) as we are using set.
 */

class ThreeSum{

    public List<List<Integer>> threeSum(int[] nums) {

        HashSet<List<Integer>> set = new HashSet<>();

        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++){
            int j = i+1;
            int k = nums.length-1;
            while(j < k){
                int sum = nums[j] + nums[k];
                if (sum == -nums[i]){
                    set.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                }
                else if(sum > -nums[i]){
                    k--;
                }
                else{
                    j++;
                }
            }
        }

        return new ArrayList<>(set);
    }
}