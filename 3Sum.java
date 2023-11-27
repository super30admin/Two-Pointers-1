//  Time Complexity: O(n^2)
//  Space Complexity: O(1)
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i< nums.length; i++) {
            if(i==0 || nums[i] != nums[i-1]){
                int low = i+1;
                int high = nums.length-1;
                while(low < high) {
                    if(nums[i] + nums[low] + nums[high] == 0){
                        List<Integer> l = new ArrayList();
                        l.add(nums[i]);
                        l.add(nums[low]);
                        l.add(nums[high]);
                        list.add(l);
                        while (low < high && nums[low] == nums[low + 1]) low++;
                        while (low < high && nums[high] == nums[high-1]) high--;
                        low++;
                        high--;
                    }
                    else if(nums[i] + nums[low] + nums[high] < 0) low++;
                    else high--;
                }
            }

        }
        // List<List<Integer>> list = new ArrayList<>();
        // for(List l: set) list.add(l);
        return list;
    }
}