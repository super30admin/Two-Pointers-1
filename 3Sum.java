//Time complexity is O(n2)
//Space complexity is O(n)
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res= new ArrayList<>();
        for(int i=0;i<nums.length && nums[i]<=0;i++){
            if(i==0 ||(nums[i-1]!=nums[i])){
                helper(nums, i, res);
            }
        }
        return res;
    }
    public void helper(int[] nums, int i, List<List<Integer>> res){
        int lo = i+1;
        int hi = nums.length-1;
        while(lo<hi){
            int sum = nums[i]+nums[lo]+nums[hi];
            if(sum<0){
                lo=lo+1;
            }
            else if(sum>0){
                hi=hi-1;
            }
            else{
                List<Integer> temp= new ArrayList<Integer>();
                temp.add(nums[i]);
                temp.add(nums[lo]);
                temp.add(nums[hi]);
                res.add(temp);
                lo=lo+1;
                hi=hi-1;
                while(lo<hi && nums[lo-1]==nums[lo]){
                    lo=lo+1;
                }
            }
        }

    }
}