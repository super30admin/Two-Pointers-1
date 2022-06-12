//Time O(n^2)
//Space O(1)

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i =0;i<nums.length-1;i++) {
            if(i>0 && nums[i-1]==nums[i]) 
                continue;
            int low = i+1; 
            int high = nums.length-1;  
            if(nums[i]>0) break;
            while(low<high){
                if(nums[low]+nums[high]+nums[i]==0) { 
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[low]);
                    temp.add(nums[high]);
                    res.add(temp);
                    low++;
                    high--;
                    while(low<high && nums[low-1]==nums[low])
                        low++;
                }
                else if(nums[low]+nums[high]+nums[i]>0)
                    high--;  
                else
                    low++;  
            }
        }
        return res;
    }
}  