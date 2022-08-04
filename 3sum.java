class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        HashSet<List<Integer>> result = new HashSet();
        for(int i=0;i<n-2;i++){
            if(nums[i]> 0)break;
            if(i!=0 && nums[i]==nums[i-1]) continue;
            int start=i+1;
            int end=nums.length-1;
            while(start<end){
                int sum = nums[i]+nums[start]+nums[end];
                if(sum==0){
                    List<Integer> temp = new ArrayList();
                    temp.add(nums[i]);
                    temp.add(nums[start]);
                    temp.add(nums[end]);
                    Collections.sort(temp);
                    result.add(temp);
                    start++;
                    while(start<end && nums[start]==nums[start-1]) start++;
                    while(start<end && nums[end]==nums[end-1]) end--;
                }
                else if(sum<0)
                    start++;
                else
                    end--;
            }
        }
        return new ArrayList<>(result);
    }
}
