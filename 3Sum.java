class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> ans = new HashSet<>();
        Arrays.sort(nums);
        int j=0;
        int k=nums.length-1;
        for(int i=0;i<nums.length-2;i++){
            j=i+1;
            k=nums.length-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum==0){ans.add(Arrays.asList(nums[i],nums[j++],nums[k--]));}
                else if(sum>0){k--;}
                else if(sum<0){j++;}
            }
        }
        return new ArrayList<>(ans);
    }
}


//time complexity:O(N^2)
//space complexity:O(N)
