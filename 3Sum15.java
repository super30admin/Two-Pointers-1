//Time complexity: O(n^2 logn)
//Space Complexity: O(1)
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length == 0){
            return new ArrayList<>();
        }
        List<List<Integer>> result = new ArrayList<>();
        int low;
        int high;
        Arrays.sort(nums);
        int sum;
        for(int i = 0;i<nums.length-2; i++){
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            low = i+1;
            high = nums.length-1;
            while(low<high){
            sum = nums[i]+nums[low]+nums[high];
            if(sum == 0){
                List<Integer> li = Arrays.asList(nums[i], nums[low], nums[high]);
                result.add(li);
                low++;
                high--;
            while(low<high && nums[low] == nums[low-1]){
                low++;
            }
            while(low<high && nums[high] == nums[high+1]){
                high--;
            }
            }
            if(sum<0){
                low++;
            }
            if(sum>0){
                high--;
            }    
        }
        }
        return result;
        
    }
}
