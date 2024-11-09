// Approach : Sort and then two pointer approach
// Time: nlogn + n*2 = n*2
// Space: O(1)
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        int target=0;
        for(int i=0;i<n;i++){
            // fix first element but before fixing it check for any duplicates
            if(i>0 && nums[i]==nums[i-1]) continue;
            // if fixing element is already greater than target
            if(nums[i]>target) break;
            int low = i+1;
            int high = n-1;
            while(low<high){
                int sum = nums[i]+nums[low]+nums[high];
                if(sum == target){
                    result.add(Arrays.asList(nums[i],nums[low],nums[high]));
                    low++;
                    high--;
                    // check for any duplicates & boundar conditions
                    while(low<high && nums[low]==nums[low-1]){
                        low++;
                    }
                    while(low<high && nums[high]==nums[high+1]){
                        high--;
                    }
                } else if(sum<target){
                    low++;
                } else{
                    high--;
                }
            }
        }
        return result;
        
    }
}