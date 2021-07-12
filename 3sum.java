//TC: O(N^2)
//SC: O(1)
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int pivot = 0;
        List<List<Integer>> result = new ArrayList<>();
        
        for(int i=0; i<nums.length-2; i++) {
            int search = 0 - nums[i];
            int low = i+1;
            int high = nums.length-1;
            
            if(i>0 && nums[i-1] == nums[i]) {
                continue;
            }
            while(low < high) {
                if(nums[low]+nums[high] == search) {
                    result.add(List.of(nums[i], nums[low], nums[high]));
                    low++;
                    while(low<high && nums[low] == nums[low-1]) {
                        low++;
                    }
                }else if(nums[low]+nums[high] < search) {
                    low ++;
                }else {
                    high--;
                }
            }
        }
        return result;
    }
}