public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        if(nums==null || n<0) return null;
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); // -4 -1 -1 0 1 2
        for(int i=0;i<n;i++){
            int num = nums[i];
            int l = i+1, r = n-1;
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            while(l<r){
                int sum = num+nums[l]+nums[r];
                if(sum<0){
                    ++l;
                }else if(sum==0){
                    result.add(Arrays.asList(num,nums[l++],nums[r--]));
                    while(l<r&&nums[l]==nums[l-1]){
                        ++l;
                    }
                }else{
                    --r;
                }

            }
        }
        return result; 
    }
}

// TC - O(n2)
// SC - O(1)