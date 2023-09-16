// Time Complexity : O(n) as it will traverse all elements in nums
// Space Complexity : O(1) as we are not using any extra space only using list that is part of output
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class Problem2 {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums.length == 0 || nums == null){
            return new ArrayList<>();
        }

        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;

        for(int i = 0; i < n; i++){
            if(i == 0 || nums[i] != nums[i-1]){
                int low = i + 1;
                int high = n - 1;
                while(low < high){
                    int sum = nums[i] + nums[low] + nums[high];
                    if(sum == 0){
                        result.add(Arrays.asList(nums[i], nums[low], nums[high]));
                        while(low < high && nums[low] == nums[low+1]) low++;
                        while(low < high && nums[high] == nums[high-1]) high--;
                        low++;
                        high--;

                    }else if(sum > 0){
                        high--;
                    }else{
                        low++;
                    }
                }
            }
        }

        return result;
    }
}
