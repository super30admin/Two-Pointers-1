class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        if(nums==null||nums.length < 4)
            return ans;
        Arrays.sort(nums);
        for(int i =0;i<nums.length-3;i++){
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            for(int j = i+1;j<nums.length-2;j++){
                if(j > i + 1 && nums[j] == nums[j - 1]) continue;
                int l = j+1;
                int h = nums.length-1;
                int newTarget = target-(nums[i]+nums[j]);
                while(l<h){
                    if(nums[l]+nums[h]==newTarget){
                        List<Integer> res = Arrays.asList(nums[i],nums[j],nums[l],nums[h]);
                        ans.add(res);
                        l++;
                        h--;
                        while(l < h && nums[l] == nums[l - 1]) {
                            l++;
                        }
                        while(l < h && nums[h] == nums[h + 1]) {
                            h--;
                        }
                    }
                    else if(nums[l]+nums[h]<newTarget)
                        l++;
                    else
                        h--;
                }
            }
        }
        return ans;
    }
}