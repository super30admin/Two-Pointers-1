// Time Complexity: O(nlogn)
// Space Complexity: O(1)

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        
        int size = nums.length;
        if(size > 0 && nums[0] > 0) return result;
        
        for(int i=0; i< size; i++){
            // i is the pivot index
            if(i != 0 && nums[i] == nums[i-1]) continue;
            int low = i+1; int high = size-1;
            while(low < high){
                int sum = nums[i] + nums[low] + nums[high];
                if(sum == 0){
                    List<Integer> li = Arrays.asList(nums[i],nums[low],nums[high]);
                    result.add(li);
                    low++;high--;
                    while(low < high && nums[low] == nums[low-1]) low++;
                    while(low < high && nums[high] == nums[high+1]) high--;
                    
                } else if (sum > 0){
                    high--;
                } else{
                    low++;
                }
            }
        }
        
        return result;
    }
}