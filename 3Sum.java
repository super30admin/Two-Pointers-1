class Solution {
    //Time complexity: O(n^2)
    //Space complexity: O(1)
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        if(nums.length<=2)
            return res;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            if(i>0 && nums[i]==nums[i-1])
                continue;
            if(nums[i]>0)
                break;
            int l=i+1,h=nums.length-1;
            while(l<h){
                int s=nums[l]+nums[i]+nums[h];
                if(s==0){
                    res.add(Arrays.asList(nums[l],nums[i],nums[h]));
                    l++;
                    h--;
                    while(l<h && nums[l]==nums[l-1]){
                        l++;
                    }
                    while(l<h && nums[h]==nums[h+1]){
                        h--;
                    }
                }
                else if(s>0){
                    h--;
                }
                else{
                    l++;
                }
            }
        }
        return res;
    }
}