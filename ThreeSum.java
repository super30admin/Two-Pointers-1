//approach-here the problem statement states given an array return all triplets where some of these triplets is 0. my approach here sort the array then for each item i, find two other items in the array such that their sum is '-i'. To do this i am using two pointers on each end of the remaining list and moving the pointer accordingly to get all the possible combinations and to avoid duplicates as well.
//time complexity-O(nlogn + n^2) as we are sorting and we are taking each item and then iterting the rest of the array
//space Complexity-O(1) as we are using only extra variables which occupy constant space. we donnot consider the space used by the returned output.
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int target = -nums[i];
            int left = i + 1;
            int right = nums.length - 1;
            //eliminating the duplicated on outer level
            if (i != 0 && nums[i] == nums[i - 1])
                continue;

            while (left < right) {
                if (nums[left] + nums[right] == target) {
                    
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    result.add(list);
                    left++;
                    //eliminating the duplicates on inner level
                    while(left<right&&nums[left]==nums[left-1])left++;
                    right--;
                } else if (nums[left] + nums[right] < target)
                    left++;
                else
                    right--;
            }
        }
        return result;
    }
}
