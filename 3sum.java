class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int i,j,left,right,sum,n;
        List<List<Integer>>result = new ArrayList<>();
        n=nums.length;
        Arrays.sort(nums);
        if(nums.length == 0) return result;
        for(i=0;i<n-1;i++){
            left=i+1;right=n-1;
            if(nums[i]>0) break;
            if(i>0 && nums[i]==nums[i-1]) continue;
            while(left<right){
                sum=nums[left]+nums[right];
                if(sum+nums[i]==0){
                    List<Integer> li = Arrays.asList(nums[i],nums[left],nums[right]);
                    result.add(li);
                    left++;
                    right--;
                    while(nums[left]==nums[left-1] && left<right){
                        left++;
                    }
                    while(nums[right]==nums[right+1] && left<right){
                        right--;
                    }
                }
                else if(sum+nums[i]>0){
                    right--;
                }
                else{
                    left++;
                }
                
            }
        }
        return result;
    }
}