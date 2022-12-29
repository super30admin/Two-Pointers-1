class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums==null || nums.length==0) return new ArrayList<>();

        // Solution 1, brute force n*3 TC
        HashSet<List<Integer>> set = new HashSet<>();
        int n = nums.length;
        for (int i=0; i<n-2; i++){
            for(int j=i+1; j<n-1; j++){
                for(int k=j+1; k<n; k++){
                    if(nums[i]+nums[j]+nums[k] == 0){
                        List<Integer> li = Arrays.asList(nums[i],nums[j],nums[k]);
                        Collections.sort(li);
                        set.add(li);
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }
}