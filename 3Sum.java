// TC - O(n^2), n --> length of nums array, SC - O(1)

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // Sanity check, if nums is null or length is 0, return empty ArrayList
        if(nums == null || nums.length == 0){
            return new ArrayList<>();
        }
        // Sort nums array
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        
        // Iterating nums array from 0 to length - 1
        for(int i=0; i<nums.length-1; i++){
            // To avoid repetition of sultion lists in result list, we keep a check, if nums value at ith index is equal to nums value at i-1 st index and i > 0, then skip this iteration
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            // As the array is sorted, if nums[i] > 0, there will be no numbers less than 0 to get a sum of 0
            if(nums[i] > 0){
                return result;
            }
            // Initializing 2 pointers l and h at 0 and height-1 respectively
            int l = i+1;
            int h = nums.length - 1;
            // Iterate till l < h
            while(l < h){
                // calculate sum from values at i, l and h indexes
                int sum = nums[i] + nums[l] + nums[h];
                // If sum equals 0, we found a resuling triplet, so we add it in result list, increment l and decrement h
                if(sum == 0){
                    List<Integer> subList = Arrays.asList(nums[i], nums[l], nums[h]);
                    result.add(subList);
                    l++;
                    h--;
                    // To avoid repetitions in inner loops, similar to what we have done in outer loop, if nums[l] == nums[l-1] increment l while l is still less than h, similarly for h, to avoid repetitions, if nums[h] == nums[h+1], h-- while l is still less than h
                    while(l < h && nums[l] == nums[l-1]){
                        l++;
                    }
                    while(l < h && nums[h] == nums[h+1]){
                        h--;
                    }
                // If sum < 0, increment l
                }else if(sum < 0){
                    l++;
                // If sum > 0 decrement h
                }else{
                    h--;
                }
            }
        }
        return result;
    }
}

// Using HashSet
// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
//         if(nums == null || nums.length == 0){
//             return new ArrayList<>();
//         }
//         Arrays.sort(nums);
//         List<List<Integer>> result = new ArrayList<>();
//         Set<List<Integer>> set = new HashSet<>();
//         for(int i=0; i<nums.length-1; i++){
//             if(nums[i] > 0){
//                 return result;
//             }
//             int l = i+1;
//             int h = nums.length - 1;
//             while(l < h){
//                 int sum = nums[i] + nums[l] + nums[h];
//                 if(sum == 0){
//                     List<Integer> subList = Arrays.asList(nums[i], nums[l], nums[h]);
//                     if(!set.contains(subList)){
//                         set.add(subList);
//                         result.add(subList);
//                     }
//                     l++;
//                     h--;
//                 }else if(sum < 0){
//                     l++;
//                 }else{
//                     h--;
//                 }
//             }
//         }
//         return result;
//     }
// }