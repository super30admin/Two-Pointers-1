// TC:O(n^2), SC: O(n)

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> res = new HashSet();
        Arrays.sort(nums);
        
        for(int i=0; i<nums.length-2;i++){
            int j=i+1;
            int k= nums.length-1;
            while(j<k){
                if(nums[j]+nums[k] == -nums[i]){
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                }
                else if(nums[j]+nums[k] < -nums[i]){
                    j++;
                }
                else k--;
            }
        }
        
        return new ArrayList<>(res);
    }
}
