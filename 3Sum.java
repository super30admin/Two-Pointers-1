// Time Complexity:- O(nlogn)+O(n^2)
//Space Complexity:- O(1)


class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result= new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        
        for(int i=0;i<n-2;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            if(nums[i]>0) break;
            int low=i+1, high=n-1;
            while(low<high){
                int sum=nums[i]+nums[low]+nums[high];
                if(sum == 0){
                    result.add(Arrays.asList(nums[i],nums[low],nums[high]));
                    low++;
                    high--;
                    while(nums[low] == nums[low-1]){
                        low++;
                    }
                    while(nums[high] == nums[high+1]){
                        high--;
                    }
                }else if(sum<0){
                    low++;
                }else{
                    high--;
                }
            }
        }
        return result;
    }
}