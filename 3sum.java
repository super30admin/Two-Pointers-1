//timeComplexity O(n^2)
//SpacComplexity O(1)
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for(int i = 0 ; i < n-2; i++){
            if(nums[i] > 0)break;
            if(i != 0 && nums[i] == nums[i-1]) continue;
            
            int low =i+1;
            int high = nums.length - 1;
            while(low<high){
                if(nums[i] + nums[low]+nums[high] == 0){
                    List<Integer> list = Arrays.asList(nums[i],nums[low],nums[high]);
                    result.add(list);
                    low++;
                    high--;
                   
                    while(low < high &&nums[low] == nums[low-1])low++;
                    while(low < high && nums[high] == nums[high+1])high--;
                }else if(nums[i] + nums[low]+ nums[high] < 0){
                    low++;
                }else{
                    high--;
                }
            }
        }
       return result; 
    }
}
