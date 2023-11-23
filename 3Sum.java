//time Complexity: O(n^2)
//space complexity: O(1)
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        int n = nums.length;
        int target =0 ;

        for(int i =0;i<n;i++){
            int low= i+1; int high = n-1;
            if(i>0 && nums[i] == nums[i-1]) continue;
            while(low<high){
            int sum = nums[i] + nums[low] + nums[high];

            if(sum==0){
                result.add(Arrays.asList(nums[i],nums[low],nums[high]));
                low++;
                high--;
                while(low < n && nums[low] == nums[low-1])
                    low++;
                while(high > 0 && nums[high] == nums[high+1])
                    high--;
            }
            else if(sum > target)
                high--;
            else
                low++;
            }
            
        }
        return result;
    }
}