// Time complexity :O(n) 
//Space complexity :O(1);
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> li = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0) break;
            if(i>0 && nums[i-1]==nums[i]) continue;
            int l=i+1,r=nums.length-1;
            while(l<r){
                int sum = nums[i] + nums[l]+nums[r];
                if(sum==0){
                   List<Integer> s = Arrays.asList(nums[i],nums[l],nums[r]);
                   li.add(s);

                    l++;r--;
                    while(nums[l-1] == nums[l] && l<r) l++;
                    while(nums[r+1] == nums[r] && l<r) r--;

                }
                else if(sum >0) r--;
                else if(sum<0) l++;
            }
        }
        return li;
    }
}