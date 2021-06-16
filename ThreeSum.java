// Time Complexity : O(n^2)
// Space Complexity : O(1)

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList();
        Arrays.sort(nums);
        if(nums == null || nums.length < 3)
            return result;
        for(int i = 0;i < nums.length - 2;i++){
            //to avoid duplicates
            while(i < nums.length - 2 && i > 0 && nums[i] == nums[i - 1])
                i++;
            int j = i + 1;
            int k = nums.length - 1;
            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0){
                    result.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                    //to avoid duplicates
                    while(j < k && nums[j] == nums[j - 1])
                        j++;
                    //to avoid dubplicates
                    while(j < k && nums[k] == nums[k + 1])
                        k--;
                }
                else if(sum < 0)
                    j++;
                else
                    k--;
            }
        }
        return result;
    }
}