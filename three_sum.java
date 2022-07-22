//time complexity: o(n2)
//space complexity: o(1)

class Solution{

    public List<List<Integer>> threeSum(int[] nums){
        if(nums == null || nums.length == 0) return new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            if(i>0 && nums[i] == nums[i-1]) continue;
            int left = i+1;
            int right = nums.length -1;

            while(left<right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum<0){
                    left++;
                }
                else if(sum>0){
                    right--;
                }
                else{
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    // to handle duplicates and left pointer should not pass right pointer
                    while(left<right && nums[left] == nums[left-1]){
                        left++;
                    }
                    while(left<right && nums[right] == nums[right + 1]){
                        right--;
                    }
                }
            }
        }
        return result;
    }
}














// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
//         if(nums == null || nums.length == 0) return new ArrayList<>();
//         List<List<Integer>> result = new ArrayList<>();

//         HashSet<List<Integer>> h = new HashSet<>();

//         // Brute Force
//         for(int i = 0; i<nums.length-2; i++){
//             for(int j = i+1; j<nums.length-1; j++){
//                 for(int k = j+1; k<nums.length; k++){
//                     int sum = nums[i] + nums[j] + nums[k];
//                     if(sum == 0){
//                         List<Integer> list = Arrays.asList(nums[i], nums[j], nums[k]);

//                         Collections.sort(list);

//                         if(!h.contains(list)){
//                             result.add(list);
//                             h.add(list);
//                         }
//                     }
//                 }
//             }
//         }
//         return result;
//     }
// }