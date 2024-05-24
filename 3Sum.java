/**
Brute Force: Nested Iteration - > O(n^3), O(1)

Sort array + Two Pointers - > O(nlogn)+ O(n^2), SC - O(1)

No Sort -> HashSet + complement -> O(n^2), SC - O(n)
 */

 class Solution {

    // No Sort Technique-> HashSet + complement
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> res = new HashSet<>();
       for(int i =0;i<nums.length-1;i++){
        HashSet<Integer> set = new HashSet<>();
        for(int j = i+1;j<nums.length;j++){
            int k = -(nums[i]+nums[j]);
            if(set.contains(k)){
                List<Integer> list = new ArrayList<>(Arrays.asList(nums[i],nums[j],k));
                Collections.sort(list);
                res.add(list);
            }
            set.add(nums[j]);
        }
       }
       return res.stream().toList();
    }
    // Sort + two pointer approach
    public List<List<Integer>> threeSum1(int[] nums) {
        HashSet<List<Integer>> set = new HashSet<>();

        Arrays.sort(nums);

        for(int i=0;i<nums.length;i++){
            
            if(i==0 || nums[i]!=nums[i-1]){
                
            twoPointer(nums,i,set);
            }
        }
     return set.stream().toList();
    }
    private void twoPointer(int[] nums, int i ,HashSet<List<Integer>> set ){
        int low = i+1; int high = nums.length-1;
        
        while(low<high){
            int sum = nums[i]+nums[low]+nums[high];
            if(sum<0){
                low++;
            } else if(sum>0){
                high--;
            }else {
                set.add(Arrays.asList(nums[i],nums[low],nums[high])); 
                low++;
                high --;
                while(low<high && nums[low]==nums[low-1]) low++;
                while(low<high && nums[high]==nums[high+1]) high--;
            }
        }
    }
}