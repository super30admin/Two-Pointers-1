//Executed but getting wrong answer. Please help where should I make changes in my code.
//Time Complexity --> n^2 + nlogn --> sorting + iterating 2 loops with 3 pointer solution so n^2
//Space Complexity --> O(1)

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        
        //null 
        if(nums == null || nums.length == 0) return result;
        Arrays.sort(nums);
        int n = nums.length-1;
        
        for(int i = 0; i < n; i++) {
            int low = i+1;
            int high = n-1;
            int sum = nums[i]+nums[low]+nums[high];
            while(low < high){
                if(sum == 0) {
                    List<Integer> li = Arrays.asList(nums[i], nums[low], nums[high]);
                    result.add(li);
                    low++; high--;
                    while(low <= high && nums[low] == nums[low-1]) low++;
                    while(low <= high && nums[high] == nums[high+1]) high--;
                }
                else if(sum > 0){
                    high--;
                } 
                else {
                    low++;
                }
                    
            }
        }
        
        return result;
    }
}
