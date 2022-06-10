//Time O(n^2)
//Space O(1)
// Ran on leetcode : yes
// Any issues : no
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i =0;i<nums.length-1;i++)   // For each element in the array, keep that as the target and do 2 sum using 2 pointers
        {   if(i>0 && nums[i-1]==nums[i]) 
            continue;
            int low = i+1; //low pointer for 2 sum
            int high = nums.length-1;  // high pointer for 2 sum
            if(nums[i]>0) break;
            while(low<high)
            {
           
           if(nums[low]+nums[high]+nums[i]==0)   // if the pointer sums add to 0, means we have 3 numbers to add to list
           { 
               ArrayList<Integer> temp = new ArrayList<>();
               temp.add(nums[i]);
               temp.add(nums[low]);
               temp.add(nums[high]);
               res.add(temp);
               low++; // increment low
               high--; //reduce high
               while(low<high && nums[low-1]==nums[low])
                   low++;  // check for duplicate lows and remove them as well
           }
           else if(nums[low]+nums[high]+nums[i]>0)
               high--;  // if the sum of all 3 is too high, then reduce high pointer to bring sum closer to 0
           else
               low++;  // if the sum of all 3 is less than 0 then increase low pointer to bring sum closer to 0
            
            }
            
        }
        return res;
    }
}