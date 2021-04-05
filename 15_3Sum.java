class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums==null || nums.length==0){
            return new ArrayList<>();
        }
        
        int low = 0, high = nums.length-1;
        int sum = 0;
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
      
        for(int i=0; i<nums.length-2; i++){
            low = i+1;
            high = nums.length-1;
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            while(low<high){
                sum = nums[i] + nums[low] + nums[high];
                
                if(sum==0){
                    result.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    low++;
                    high--;
                    while(low<high && nums[low]==nums[low-1])
                        low++;
                    while(low<high && nums[high] == nums[high+1])
                        high--;
                }
                else if(sum < 0){
                    low++;
                }
                else
                {
                    high--;
                }
            }
        }
        return result;
    }
}

//TC => O(n*n)
//SC => O(1)
