// Time Complexity: O(n^2 + nlogN) ~ O(N^2)
// Space Complexity : O(1)

// Approach:
//     Sort the given array.
//     Loop through the array from i->0 to i-> nums.length-3 so that duplicates are not considered
//     For given i, start = i+1 & end= nums.length-1;
//     Calculate the sum of nums[i], nums[start], nums[end]
//     If the sum = 0. Include the elements in list.
//     If sum<0, start++ such that no start element should be the same else end-- and prev end != cur end.

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length<1) return new ArrayList<>();
        
        List<List<Integer>> list = new ArrayList<>();
        
        Arrays.sort(nums);
        
        for(int i = 0; i<nums.length-2; i++){
            if(i ==0 || nums[i-1]<nums[i]){
                int start = i+1;
                int end = nums.length-1;
                while(start<end){
                    int sum = nums[i] + nums[start] + nums[end];
                    if(sum == 0){
                        list.add(Arrays.asList(nums[i],nums[start],nums[end]));
                    }  
                    if(sum < 0){
                        int currentStart = start;
                        while(nums[currentStart] == nums[start] && start<end){
                            start++;
                        }
                    } else{
                        int currentEnd = end;
                        while(nums[currentEnd] == nums[end] && start<end){
                            end--;
                        }
                    }
                }   
            }
        }
        return list;
    }
}