//time - O(n^2)
//space - O(1)
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums==null || nums.length==0) return result;
        Arrays.sort(nums);

        for(int i=0; i<nums.length-2; i++){
            if(i > 0 && nums[i]==nums[i-1]) continue;
            int left = i+1;
            int right = nums.length-1;
            while(left < right){
                int sum = nums[i]+nums[left]+nums[right];
                if(sum==0){
                    List<Integer> list = Arrays.asList(nums[i], nums[left], nums[right]);
                    result.add(list);
                    left++;
                    right--;
                    while(left < right && nums[left-1]==nums[left]) left++;
                    while(left < right && nums[right]==nums[right+1]) right--;
                }
                else if(sum < 0){
                    left++;
                }
                else{
                    right--;
                }
            }
        }

        return result;
    }
}