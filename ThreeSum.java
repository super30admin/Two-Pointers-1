// This problem first sorts the given array and finds the other two elements in left over array using two pointer approach
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> response = new ArrayList();
        // sort the array
        Arrays.sort(nums); //nlogn
        for(int i=0;i<nums.length-2;i++) { //n
        // If the element is greater than 0, then no point in checking as the other elements will be >0 and wont reach target 0
            if(nums[i]>0) break;
            // if element is same, skip
            if(i!=0 && nums[i]==nums[i-1]) {
                    continue;
            }
            int target = 0 - nums[i];
            int a = i+1, b=nums.length-1;
            while(a<b) { //n
                // if element is same, skip
                while(a<b && a!=i+1 && nums[a]==nums[a-1]) {
                    a++;
                }
                // if element is same, skip
                while(a<b && b!=nums.length-1 && nums[b]==nums[b+1]) {
                    b--;
                }
                if(a>=b) break;
                int sum = nums[a]+nums[b];
                // Target hit
                if(sum==target) {
                    response.add(List.of(nums[i], nums[a], nums[b]));
                    a++;
                    b--;
                // two pointer move left
                } else if(sum>target) {
                    b--;
                // two pointer move right
                } else {
                    a++;
                }
            }
        }
        return response;
    }
}
