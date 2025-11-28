class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<n-2;i++){
            //outside duplicacy
            if(i>0 && nums[i] == nums[i-1]) continue;
            int l= i+1;
            int r=n-1;
            while(l<r){
                int sum = nums[i] + nums[l] + nums[r];
                if(sum == 0){
                    List<Integer> list = Arrays.asList(nums[i],nums[l],nums[r]); //record it.
                    res.add(list);
                    l++; // move both pointers once
                    r--;
                    while(l<r && nums[l] == nums[l-1]){ //move till you get unique element
                        l++;
                    }
                    while(l<r && nums[r] == nums[r+1]){
                        r--;
                    }

                }else if(sum < 0) {
                    l++;
                } else{
                    r--;
                }
            }

        }
        return res;
    }
}