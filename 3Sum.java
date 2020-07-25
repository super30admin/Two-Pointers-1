class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums== null || nums.length == 0) return result;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length-2; i++){
            if((i>0) && nums[i-1]==nums[i]) continue;
            int low = i+1;
            int high = nums.length-1;
            while(low<high){
                if(nums[low]+nums[i]+nums[high]==0){
                List<Integer> list = Arrays.asList(nums[low], nums[i], nums[high]);
                    result.add(list);
                    low++;
                    high--;
                    while(low<high && nums[low]==nums[low-1]){
                        low++;
                    }
                    while(low<high && nums[high]==nums[high+1]){
                        high--;
                    }
                }
                else if(nums[low]+nums[i]+nums[high] < 0){
                    low++;
                }
                else{
                    high--;
                }
            }
        }
        return result;
    }
}
