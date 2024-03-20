// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

//Sort the array. Take 3 pointers, Keep 1 pointer constant, the other 2 pointers will be low 
//and high pointers, for the "stationary" pointer, check if the 
//x = value(stationary pointer) + value(low pointer) if x < 0, advance low pointer
//if x> 0 advance high pointer, if x = 0, record the triplet, move high and low
//pointers if a triplet is found, check if its already recorded if not make an entry
//repeat until low and high pointers do not cross each other

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for(int i = 0;i<n-2;i++){
            //outside duplicacy
            if(i != 0 && nums[i] == nums[i-1]){
                continue;
            }
            int l = i+1;
            int h = n-1;
            while(l < h){
                int currSum = nums[i] + nums[l] + nums[h];
                if(currSum == 0){
                    result.add(Arrays.asList(nums[i], nums[l], nums[h]));
                    l++;
                    h--;
                    while(l<h && nums[l] == nums[l-1]) { l++; }
                    while(l<h && nums[h] == nums[h+1]) { h--; }
                }else if(currSum < 0){
                    l++;
                }else
                {
                    h--;
                }
            }
        }
        return result;
    }
}