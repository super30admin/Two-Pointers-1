class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // not contain duplicate so store in set
        // FOR EACH index no. find 2 other no. where their sum should be 0 - nums[i]
        // sort the array & use 2 pointer if sum > 0 - nums[i] then move right-- else left++
        // do this for all & to avoid duplicate , check if nums[i-1] == nums[i] skip
        // TC: nlogn + n2 // -4 -1 -1 -1 0 1 2

        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums); // to apply 2 pointers

        int l = 0; int r = nums.length-1;

        for( int i = 0; i< nums.length-2; i++ ){

            if( i != 0 && nums[i-1] == nums[i] ){ // skip duplicate
                continue;
            }
            int cmp = 0-nums[i];

            l = i+1;
            r = nums.length-1;

            while( l<r ){
                if( nums[l] + nums[r] == cmp ){
                    res.add( Arrays.asList(nums[i] , nums[l] , nums[r] ));
                    l++;
                    r--;

                    while( l<r && nums[l-1] == nums[l]) { // skip duplicate
                        l++;

                    }
                    while( l<r && nums[r] == nums[r+1]) { // skip duplicate
                        r--;

                    }
                }
                else if( nums[l] + nums[r] > cmp ){
                    r--;
                }
                else{
                    l++;
                }
            }
        }

        return res;
    }
}