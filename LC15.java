class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Set<List<Integer>> output = new HashSet<>();
        
        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            
            while(j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0) {
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
                    output.add(temp);
                    j++;
                } else if(sum < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return new ArrayList<>(output);
    }
}

//Time: O(n^2 or n*n)
//Space: O(n)