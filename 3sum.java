//TC: O(n^2)
//SC: O(1)
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length == 0) return new ArrayList<>();
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i<n-2;i++){
             //outside duplicay
            if(i!=0 && nums[i] == nums[i-1]) continue;
            int low = i+1;
            int high = n-1;
            
            while(low < high){
                int sum = nums[i]+nums[low]+nums[high];
                if( sum == 0){
                    List<Integer> li = Arrays.asList(nums[i], nums[low], nums[high]);
                    result.add(li);
                    low++; 
                    high--;
                    //inside duplicay
                    while(low<high && nums[low] == nums[low-1]) low++;
                    while(low<high && nums[high] == nums[high+1]) high--;
                    
                } else if(sum > 0){
                    high--;
                }else{
                    low++;
                }
                
            }
        }
        return result;
    }
}
