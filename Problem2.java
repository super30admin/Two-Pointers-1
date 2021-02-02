// Time Complexity :O(n^2)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :No
// Any problem you faced while coding this :Not able to form unique pairs of list.


// Your code here along with comments explaining your approach
    //Each element's negative value is the target sum for the rest of the array.
    //We approach with two sum and find the list, but right now I have duplicate list in my final output.
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums==null || nums.length==0 )
            return new ArrayList<>(0);
        
        List<List<Integer>> out= new ArrayList<>();
        for(int j=0;j<nums.length;j++)
        {
            int target=-nums[j];
            HashMap<Integer,Integer> map= new HashMap<>();
            for(int i=j+1;i<nums.length;i++)
                {                  
                    if(map.containsKey(nums[i]))
                    {
                        List<Integer> list= new ArrayList<>();
                        list.add(nums[map.get(nums[i])]);
                        list.add(nums[i]);
                        list.add(nums[j]);
                        out.add(list);
                    }
                    else
                        map.put(target-nums[i],i);
                }

         }
         return out;
        }
       
    }
