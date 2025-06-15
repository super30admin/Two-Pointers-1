/*
Steps:-
1. Initialize a pointer 'i' to track the position of the next valid element(starts at index 1).
2. Initialize a counter 'count' to keep track of how many times the number has occured.
3. Loop through the array from index 1 to end.
    a. If the current element is the same as the previous, increment 'count'.
    b. If its new element, reset the count to 1.
4. If 'count' is less than or equal to 2, it is valid- copy it to index 'i' and increment 'i'.
5. After the loop, return 'i' as the lengthof the updated array.

This algorithm modifies the array in-place and ensures that each element appears atmost twice.

*/





class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0; i<nums.length && nums[i]<=0; ++i){
            if(i==0|| nums[i-1] != nums[i]){
                twoSumII(nums, i, res);
            }
        }
        return res;
    }

    //Helper Function to find 2 numbers that, with nums[i], sums up to zero
    void twoSumII(int[] nums, int i, List<List<Integer>> res){
        int lo=i+1;
        int hi = nums.length-1;

        while(lo<hi){
            int sum = nums[i]+nums[lo]+nums[hi];
            if(sum<0){
                ++lo;
            }else if(sum>0){
                --hi;
            }else{
                res.add(Arrays.asList(nums[i], nums[lo++], nums[hi--]));
                while(lo<hi && nums[lo] == nums[lo-1])  ++lo;
            }
        }
    }

        
    
}