/** Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
* Time complexity O(N*N). Space complexity O(1)
* Code submitted on leetcode
*/
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> sumList = new ArrayList<>();
        if (nums == null || nums.length == 0 )
            return sumList;
        Arrays.sort(nums);
        for (int i = 0; i< nums.length - 2 ; i++) {
             if(nums[i] > 0) {
                break;
            }
            if(i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
           
            int low = i+1, high = nums.length - 1;
            while (low < high) {
                int sum = nums[i]+ nums[low]+ nums[high];
                if (sum == 0) {
                    sumList.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    low ++;
                    high--;
                    while (low < high && nums[low-1] == nums[low])
                    {
                        low++;
                    }
                    while (low < high && nums[high+1] == nums[high])
                    {
                        high--;
                    }
                 }   
                 else if (sum < 0){
                    low ++;
                 } else {
                    high --;
                 }
             }
         }
        return sumList;
    }
}

