// Time Complexity :O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// Your code here along with comments explaining your approach
/* Sort the array. 
Keep two pointers at low and high and a pivot. Run the check on all the other elements with pivot as constant. 
If sum is less than 0, increment low pointer else decrement high pointer. 
Check if the pivot element is same as previous pivot, then ignore and continue. 
Else if the left element is same as previous, skip it and carry on. 
If the right element is same as the element on its right skip it and move high pointer to less than current position. 
 */

public class Problem2  {
        public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i =0; i < n-2; i++){
            if(i>0 && nums[i] == nums[i-1]) 
                continue; 
            int l = i+1; 
            int h = n-1;
            while(l < h){
                int sum = nums[i]+nums[l]+nums[h];
                if(sum == 0){
                    List<Integer> li = Arrays.asList(nums[i],nums[l],nums[h]);
                    list.add(li);
                    l++;
                    h--;
                    while(l < h && nums[l] == nums[l-1])
                        l++;
                    while(l < h && nums[h] == nums[h+1])
                        h--;
                }
                else if(sum > 0)
                    h--;
                else 
                    l++;
            }
        }
        return list;
        }
}
