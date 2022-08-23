public class 3sum {
    // TC is O(n^2)
    // SC is O(1)
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        // sort array to apply 2 pointers O(nlogn)        
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(i>0 && nums[i] == nums[i-1]) continue;
            int low = i+1;
            int high = n-1;
            while(low<high){
                List<Integer> list = new ArrayList<>();
                int sum = nums[low]+nums[high]+nums[i];
                if(sum == 0){
                    list.add(nums[i]);
                    list.add(nums[low]);
                    list.add(nums[high]);
                    result.add(list);
                    low++;
                    high--;
                    while(low <= high && nums[low] == nums[low-1]){
                        low++;
                    }
                }else if(sum < 0){
                    low++;
                }else{
                    high--;
                }
            }
        }
        return result;
    }
}
