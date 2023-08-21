// TC: O(n)
// SC: O(1)
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length; 
        for(int i = 0; i< nums.length - 2; i++){
            // can't be 0
            if(nums[i] > 0) break;
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int l = i+1; int r = n-1;
            while(l<r){
                int sum = nums[i] + nums[l] + nums[r];

                if(sum == 0){
                    List<Integer> li = Arrays.asList(nums[i], nums[l], nums[r]);
                    result.add(li);
                    l++; r--;

                    while(l < r && nums[l] == nums[l-1]) l++;
                    while(l < r && nums[r] == nums[r+1]) r--;
                }
                else if(sum < 0){
                        l++;
                }
                else{
                    r--;
                }
            }
        }
        return result;
    }
}