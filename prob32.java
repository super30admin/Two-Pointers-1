//Time complexity-O[n^2]
//Getting array index out of bounds error
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
      List<List<Integer>> result = new ArrayList<>();
      if(nums.length<3) return result;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int low=i+1;
            int high=nums.length-1;
            if(i!=0 && nums[low]==nums[low-1])low++;
            while(low<high){
                int sum=nums[i]+nums[low]+nums[high];
                if(sum==0){
                    List<Integer> triplets = Arrays.asList(nums[i]+nums[low]+nums[high]);
                    result.add(triplets);
                    low++;
                    high--;
                    while(nums[low]==nums[low-1])low++;
                    while(nums[high]==nums[high+1])high--;
                }
                else if(sum<0){
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