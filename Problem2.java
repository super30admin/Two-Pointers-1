Time Complexity: O(n^2)
Space Complexity: Constant
Ran successfully on leetcode?: yes

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        
        for(int i = 0; i < n - 2; i++){
            if(nums[i] > 0) break;
            if(i > 0 && nums[i] == nums[i - 1])
                continue;
            int low = i + 1;
            int high = n - 1;
            while(low < high){
                int sum = nums[i] + nums[low] + nums[high];
                if(sum == 0){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[low]);
                    list.add(nums[high]);
                    result.add(list);
                    low++;
                    while(low < high && nums[low] == nums[low - 1]) low++;
                    while(high < n - 1 && low < high && nums[high] == nums[high + 1]) high--;
                } else if(sum < 0){
                    low++;
                } else{
                    high--;
                }
            }
        }
        return result;
    }
}
