class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        //O(n^2) time and O(1) space
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;

        for (int i=0; i<n; i++) {

            //check for ouside duplicay so when u start another iteration in for loop, if we already did for -1 we dont do it again cuz             //its sorted
            if (i != 0 && nums[i] == nums[i-1]) continue;
            //Array is sorted so once we hit only positives we cant make a sum of 0
            if (nums[i] > 0) break;
            int low = i + 1;
            int high = n - 1;

            while (low < high) {
                int sum = nums[i] + nums[low] + nums[high];

                if (sum == 0) {
                    //found a triplet
                    List<Integer> list = Arrays.asList(nums[i], nums[high], nums[low]);
                    result.add(list);
                    low++;
                    high--;
                    //keep going till we hit a diff element in array to make sure we dont have duplicate elements
                    //have to rewrite base condition cuz we move the low and high inside while loop
                    while (low < high && nums[low] == nums[low - 1]) low++;
                    while (low < high && nums[high] == nums[high + 1]) high--;
                    //we can remove the line above because the low pointer will ensure we don't hit any dupliate cases
                } else if (sum > 0) {
                    high--;
                } else {
                    low++;
                }
            }

        }

        return result;

    }


}