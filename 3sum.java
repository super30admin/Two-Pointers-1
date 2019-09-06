//The objective is to return a list of list of 3 integers from a given array where sum of the 3 equal to 0
//Time complexity O(N^2)
//Space complexity O(1)
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
     //sort the given array 
        Arrays.sort(nums);
        //Initialise the result list of list
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        //Iterate over the array such that index starts from 0 to length-2 as l = i+1 and to avoid out of index situation
        for(int i =0; i<nums.length-2; i++)
        {
            if(i>0 && (nums[i]==nums[i-1])) //to avoid duplicates
                continue;
            //left index
            int l = i+1;
            //right index
            int r = nums.length-1;
            
            while(l<r)
            {
                //If sum comes upto 0
                if(nums[i] + nums[l] + nums[r] == 0)
                {
                    //append the list of elements to the list of list
                    list.add(Arrays.asList(nums[i], nums[l], nums [r]));
                    //increment left pointer and decrement right pointer
                    l++;
                    r--;
                    //to avoid duplicate 
                    while(l<r && nums[l] == nums[l-1]) l++;
                    while(l<r && nums[r] == nums[r+1]) r--;
                }
                else 
                //If the sum is > 0 move the right pointer to left by decrementing
                    if(nums[i] + nums[l] + nums[r] > 0) r--;
                else
                //else increment the left pointer
                    l++;
            }
        }
        //return the list of element lists
        return list;
    }
}