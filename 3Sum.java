class Solution {

    // TC -> O(N^ 2 + NLogN) = O(N ^ 2)
    // SC -> O(1)

    List<List<Integer>> res; 

    public List<List<Integer>> threeSum(int[] nums) {
        this.res = new ArrayList<>();
        if(nums == null || nums.length < 3) return res;

        // TC -> O(N LogN)
        Arrays.sort(nums);

        // TC -> O(N ^ 2)
        // We skip nums[i] if they are greater than 0, as their triplets will have all +ve values since the innput is sorted.
        for(int i=0; i<nums.length-2 && nums[i] <= 0; i++){
            if(i == 0 || nums[i-1] != nums[i])
                twoSumFunc(nums, i);
        }
        return this.res;
    }

    private void twoSumFunc(int[] nums, int i){
        int low = i+1, high = nums.length-1;
        while(low < high){
            int sum = nums[i] + nums[low] + nums[high];
            if(sum < 0)
                low++;
            else if(sum > 0)
                high--;
            else{
                List<Integer> triplet = Arrays.asList(nums[i], nums[low++], nums[high--]);
                res.add(triplet);
                // Skip low if same, to avoid duplicates. Already low is incremented in above step
                // So check nums[low - 1] with nums[low]
                while(low < high && nums[low - 1] == nums[low])
                    low++;
            }
        }
    }
}
