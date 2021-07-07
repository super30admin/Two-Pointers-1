# Time complexity:O(n)
# Space complexity: 0(n)
# Did code run successfully on leetcode: yes
# Any problem you faced: No




class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List <List<Integer>> result = new LinkedList<>();

        Arrays.sort(nums);

        int low;
        int high;

        for(int i = 0; i< nums.length - 2; i++){

            if(i>0 && nums[i] == nums[i - 1]){
                continue;
            }
            low = i+1;
            high = nums.length - 1;
            int sum = 0;
            while(low < high){
                sum = nums[i] + nums[low] + nums[high];

                if(sum == 0){
                    result.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    low++;
                    high--;

                while(low < high && nums[low] == nums[low - 1]){
                    low++;
                }
                while(low < high && nums[high] ==  nums[high +1]){
                    high--;
                }
            }

            else if(sum > 0){
                high--;
            }
            else{
                low++;
            }
        }
        }
        return result;
    }
}