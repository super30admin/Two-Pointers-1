class Problem2 {
    public List<List<Integer>> threeSum(int[] nums) {
        int target = 0;
        // Set<List<Integer>> resultSet = new HashSet<>();
        // // null check
        // if(nums == null || nums.length == 0){
        //     return new ArrayList<>();
        // }
        // int n = nums.length;
        // for(int i=0; i<n-2; i++){
        //     for(int j = i+1; j< n-1; j++){
        //         for(int k = j+1; k<n; k++){
        //             if(nums[i]+nums[j]+nums[k] == target){
        //                 List<Integer> valuesToAdd = Arrays.asList(nums[i], nums[j], nums[k]);
        //                 Collections.sort(valuesToAdd);
        //                 resultSet.add(valuesToAdd);
        //             }
        //         }
        //     }
        // }
        // return new ArrayList<>(resultSet);
        List<List<Integer>> result = new ArrayList<>();
        // null check
        if(nums == null || nums.length == 0) return result;
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=0; i<n-2; i++){
            if(i != target && nums[i] == nums[i-1]) continue;
            int low = i+1;
            int high = n-1;
            while(low<high){
                int sum = nums[i] + nums[low] + nums[high];
                if(sum == target){
                    List<Integer> list = Arrays.asList(nums[i], nums[low], nums[high]);
                    Collections.sort(list);
                    result.add(list);
                    low++; high--;
                    // taking care of inner duplicates
                    while(low<high && nums[low]==nums[low-1]) low++;
                    while(low<high && nums[high]==nums[high+1]) high--;
                }
                else if(sum<target) low++;
                else high--;
            }
        }
        return result;
    }
}